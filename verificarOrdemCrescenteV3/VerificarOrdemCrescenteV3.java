package verificarOrdemCrescenteV3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * Faça um programa que leia um vetor de números
 * inteiros e verifique se ele está em ordem crescente.
 * Usando Map e EntrySet.
*/

public class VerificarOrdemCrescenteV3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumero(entrada);

        Map<Integer, Integer> numeros = new HashMap<>();
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista(numeros, tamanhoDaLista, entrada, valoresInseridos);

        boolean resultado = verificarOrdemCrescente(numeros);

        imprimirResultados(resultado, numeros);

        entrada.close();
    }

    public static int lerNumero(Scanner entrada) {
        return solicitarValor("Quantos numeros deseja inserir na lista? ", entrada, new HashSet<>());
    }

    public static int solicitarValor(String mensagem, Scanner entrada, Set<Integer> valoresInseridos) {
        int numero;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                numero = Integer.parseInt(input);
                if (numero <= 0) {
                    System.out.println("Entrada invalida. Digite um numero positivo.");
                    continue;
                }
                if (valoresInseridos.contains(numero)) {
                    System.out.println("Numero duplicado! Digite um numero diferente.");
                    continue;
                }
                valoresInseridos.add(numero);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void elementosDaLista(Map<Integer, Integer> numeros, int tamanhoDaLista, Scanner entrada,
            Set<Integer> valoresInseridos) {
        for (int i = 0; i < tamanhoDaLista; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            numeros.put(i, valor);
        }
    }

    public static boolean verificarOrdemCrescente(Map<Integer, Integer> numeros) {
        if (numeros.isEmpty() || numeros.size() == 1) return true;
        
        Integer valorAnterior = null;
        for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
            Integer valorAtual = entry.getValue();
            if (valorAnterior != null && valorAnterior > valorAtual) {
                return false;
            }
            valorAnterior = valorAtual; // Atualiza o valor anterior para o valor atual
        }
        return true;
    }

    public static void imprimirResultados(boolean resultado, Map<Integer, Integer> numeros) {
        System.out.println("Os numeros " + numeros.values() + (resultado ? " estao" : " nao estao") + " em ordem crescente.");
    }
}

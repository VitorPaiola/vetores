package verificarOrdemCrescente;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Faça um programa que leia um vetor de números
 * inteiros e verifique se ele está em ordem crescente.
 * Usando array.
*/

public class VerificarOrdemCrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumero(entrada);

        int[] numeros = new int[tamanhoDaLista];
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista(numeros, entrada, valoresInseridos);

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

    public static void elementosDaLista(int[] numeros, Scanner entrada, Set<Integer> valoresInseridos) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = solicitarValor("Digite o " + (i + 1) + " numero: ", entrada, valoresInseridos);
        }
    }

    public static boolean verificarOrdemCrescente(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirResultados(boolean resultado, int[] numeros) {
        System.out.println("Os numeros " + Arrays.toString(numeros) +
                (resultado ? " estao" : " nao estao") + " em ordem crescente.");
    }
}

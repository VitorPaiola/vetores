package verificarParesVetorV2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * Crie um programa que leia um vetor de números
 * inteiros e verifique se todos os elementos são pares.
 * Usando List.
*/

public class VerificarParesVetorV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumero(entrada);

        List<Integer> numeros = new ArrayList<>();
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista(numeros, tamanhoDaLista, entrada, valoresInseridos);

        boolean numerosPares = verificarNumerosPares(numeros);

        imprimirResultados(numeros, numerosPares);

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
                    System.out.println(" Entrada invalida. Digite um numero positivo.");
                    continue;
                }
                if (valoresInseridos.contains(numero)) {
                    System.out.println("Numero duplicado! Digite um numero diferente");
                    continue;
                }
                valoresInseridos.add(numero);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void elementosDaLista(List<Integer> numeros, int tamanhoDaLista, Scanner entrada, Set<Integer> valoresInseridos) {
        for (int i = 0; i < tamanhoDaLista; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            numeros.add(valor);
        }
    }

    public static boolean verificarNumerosPares(List<Integer> numeros) {
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirResultados(List<Integer> numeros, boolean numerosPares) {
        System.out.println("Lista inserida: " + numeros);
        System.out.println(numerosPares ? "Todos os elementos sao pares." : "Existem elementos impares no vetor.");
    }
}

package exibirOrdemInversa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Escreva um programa que leia um vetor de números
 * inteiros e exiba os elementos na ordem inversa.
 * Usando array.
*/

public class ExibirOrdemInversa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumeros(entrada);

        int[] numeros = new int[tamanhoDaLista];
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista(numeros, entrada, valoresInseridos);

        int[] ordemInversa = ordemInversa(numeros);

        imprimirResultados(ordemInversa);

        entrada.close();
    }

    public static int lerNumeros(Scanner entrada) {
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
            numeros[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
        }
    }

    public static int[] ordemInversa(int[] numeros) {
        int[] inverso = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            inverso[i] = numeros[numeros.length - 1 - i];
        }
        return inverso;
    }

    public static void imprimirResultados(int[] ordemInversa) {
        System.out.println("Numeros na ordem inversa: " + Arrays.toString(ordemInversa));
    }
}

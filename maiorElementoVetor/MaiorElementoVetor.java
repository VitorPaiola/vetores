package maiorElementoVetor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Faça um programa que leia um vetor de números
 * inteiros e exiba o maior elemento presente no vetor.
 * Usando array.
*/

public class MaiorElementoVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtd = lerNumeros(entrada);
        int[] numeros = new int[qtd];
        Set<Integer> valoresInseridos = new HashSet<>(); // Não permite elementos duplicados

        elementosDaLista(numeros, entrada, valoresInseridos);

        int maiorElemento = maiorElementoVetor(numeros);

        imprimirResultados(maiorElemento);

        entrada.close();
    }

    public static int lerNumeros(Scanner entrada) {
        return solicitarValor("Digite a quantidade de elementos que deseja inserir na lista? ", entrada, new HashSet<>());
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
                    System.out.println("Numero duplicado! Digite um valor diferente.");
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

    public static int maiorElementoVetor(int[] numeros) {
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static void imprimirResultados(int maiorElemento) {
        System.out.println("O maior elemento da lista e: " + maiorElemento);
    }
}

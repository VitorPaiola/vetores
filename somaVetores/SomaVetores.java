package somaVetores;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Crie um programa que leia dois vetores de números
 * inteiros com o mesmo tamanho e exiba um novo vetor com
 * a soma dos elementos correspondentes dos dois vetores.
 * Usando array.
*/

public class SomaVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoLista = lerNumeros(entrada);

        int[] lista1 = new int[tamanhoLista];
        int[] lista2 = new int[tamanhoLista];
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista1(lista1, tamanhoLista, entrada, valoresInseridos);
        elementosDaLista2(lista2, tamanhoLista, entrada, valoresInseridos);

        int[] soma = calcularSoma(lista1, lista2);

        imprimirResultados(soma);

        entrada.close();
    }

    public static int lerNumeros(Scanner entrada) {
        return solicitarValor("Qual o tamanho das listas? ", entrada, new HashSet<>());
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

    public static void elementosDaLista1(int[] lista1, int qtd, Scanner entrada, Set<Integer> valoresInseridos) {
        System.out.println("--- LISTA 1 ---");
        for (int i = 0; i < qtd; i++) {
            lista1[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
        }
    }

    public static void elementosDaLista2(int[] lista2, int qtd, Scanner entrada, Set<Integer> valoresInseridos) {
        System.out.println("--- LISTA 2 ---");
        for (int i = 0; i < qtd; i++) {
            lista2[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
        }
    }

    public static int[] calcularSoma(int[] lista1, int[] lista2) {
        int[] soma = new int[lista1.length];
        for (int i = 0; i < lista1.length; i++) {
            soma[i] = lista1[i] + lista2[i];
        }
        return soma;
    }

    public static void imprimirResultados(int[] soma) {
        System.out.print("A soma dos vetores e: ");
        for (int i = 0; i < soma.length; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println();
    }
}

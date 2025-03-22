package multiplicacaoVetores;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Escreva um programa que leia dois vetores de
 * numeros inteiros com o mesmo tamanho e exiba um novo
 * vetor com os elementos resultantes da multiplicacao
 * dos elementos correspondentes dos dois vetores.
 * Usando array.
*/

public class MultiplicacaoVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumero(entrada);

        int[] lista1 = new int[tamanhoDaLista];
        int[] lista2 = new int[tamanhoDaLista];

        elementosDaLista(lista1, entrada, "LISTA 1");
        elementosDaLista(lista2, entrada, "LISTA 2");

        int[] listaResultante = calcularProduto(lista1, lista2);

        imprimirResultados(lista1, lista2, listaResultante);

        entrada.close();
    }

    public static int lerNumero(Scanner entrada) {
        return solicitarValor("Digite o tamanho das listas: ", entrada);
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
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
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void elementosDaLista(int[] lista, Scanner entrada, String nomeLista) {
        System.out.println("--- " + nomeLista + " ---");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
        }
    }

    public static int[] calcularProduto(int[] lista1, int[] lista2) {
        int[] resultado = new int[lista1.length];
        for (int i = 0; i < lista1.length; i++) {
            resultado[i] = lista1[i] * lista2[i];
        }
        return resultado;
    }

    public static void imprimirResultados(int[] lista1, int[] lista2, int[] listaResultante) {
        System.out.println("--- RESULTADO ---");
        System.out.print("O produto entre " + Arrays.toString(lista1) + " e " + Arrays.toString(lista2) + " e: " + Arrays.toString(listaResultante));
    }
}

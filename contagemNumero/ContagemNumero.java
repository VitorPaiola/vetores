package contagemNumero;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de números inteiros e
 * exiba quantas vezes um número específico aparece no vetor.
 * Usando array.
*/

public class ContagemNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumero(entrada);

        int[] numeros = new int[tamanhoDaLista];

        elementosDaLista(numeros, entrada, tamanhoDaLista);

        int numeroBuscado = solicitarValor("Digite o numero que deseja buscar: ", entrada);
        int repeticoes = qtdRepeticoes(numeros, numeroBuscado);

        imprimirResultados(numeroBuscado, repeticoes);

        entrada.close();
    }

    public static int lerNumero(Scanner entrada) {
        return solicitarValor("Quantos numeros deseja inserir na lista? ", entrada);
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

    public static void elementosDaLista(int[] numeros, Scanner entrada, int tamanhoDaLista) {
        for (int i = 0; i < tamanhoDaLista; i++) {
            numeros[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
        }
    }

    public static int qtdRepeticoes(int[] numeros, int numeroBuscado) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                contador++;
            }
        }
        return contador;
    }

    public static void imprimirResultados(int numeroBuscado, int repeticoes) {
        String mensagem = repeticoes == 1
                ? "O numero " + numeroBuscado + " aparece 1 vez na lista."
                : "O numero " + numeroBuscado + " aparece " + repeticoes + " vezes na lista.";

        System.out.println(mensagem);
    }
}

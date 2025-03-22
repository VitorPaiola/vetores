package mediaElementosVetor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Escreva um programa que leia um vetor de números
 * inteiros e exiba a média dos elementos.
 * Usando array.
*/

public class MediaElementosVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtd = lerNumeros(entrada);
        int[] numeros = new int[qtd];
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista(numeros, qtd, entrada, valoresInseridos);

        int media = mediaElementos(numeros);

        imprimirResultados(media);
        
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

    public static void elementosDaLista(int[] numeros, int qtd, Scanner entrada, Set<Integer> valoresInseridos) {
        for (int i = 0; i < qtd; i++) {
            numeros[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
        }
    }

    public static int mediaElementos(int[] numeros) {
        int soma = 0; 
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma / numeros.length;
    }

    public static void imprimirResultados(int media) {
        System.out.println("A media dos elementos e: " + media);
    }
}

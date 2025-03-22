package mediaElementosVetorV2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * Escreva um programa que leia um vetor de números
 * inteiros e exiba a média dos elementos.
 * Usando List.
*/

public class MediaElementosVetorV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtd = lerNumeros(entrada);
        List<Integer> numeros = new ArrayList<>();
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

    public static void elementosDaLista(List<Integer> numeros, int qtd, Scanner entrada,
            Set<Integer> valoresInseridos) {
        for (int i = 0; i < qtd; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            numeros.add(valor);
        }
    }

    public static int mediaElementos(List<Integer> numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma / numeros.size();
    }

    public static void imprimirResultados(int media) {
        System.out.println("A media dos elementos e: " + media);
    }
}

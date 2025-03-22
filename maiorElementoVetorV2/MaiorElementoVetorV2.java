package maiorElementoVetorV2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * Faça um programa que leia um vetor de números
 * inteiros e exiba o maior elemento presente no vetor.
 * Usando List.
*/

public class MaiorElementoVetorV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtd = lerNumeros(entrada);
        List<Integer> numeros = new ArrayList<>();
        Set<Integer> valoresInseridos = new HashSet<>(); // Não permite elementos duplicados

        elementosDaLista(numeros, qtd, entrada, valoresInseridos);

        int maiorElemento = maiorElementoLista(numeros);

        imprimirResultados(maiorElemento);

        entrada.close();
    }

    public static int lerNumeros(Scanner entrada) {
        return solicitarValor("Digite a quantidade de elementos que deseja inserir na lista? ", entrada,
                new HashSet<>());
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

    public static void elementosDaLista(List<Integer> numeros, int qtd, Scanner entrada,
            Set<Integer> valoresInseridos) {
        for (int i = 0; i < qtd; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            numeros.add(valor);
        }
    }

    public static int maiorElementoLista(List<Integer> numeros) {
        int maior = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
            }
        }
        return maior;
    }

    public static void imprimirResultados(int maiorElemento) {
        System.out.println("O maior elemento da lista e: " + maiorElemento);
    }
}

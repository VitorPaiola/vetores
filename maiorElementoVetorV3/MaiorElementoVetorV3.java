package maiorElementoVetorV3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * Faça um programa que leia um vetor de números
 * inteiros e exiba o maior elemento presente no vetor.
 * Usando Map e EntrySet.
*/

public class MaiorElementoVetorV3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtd = lerNumeros(entrada);
        Map<Integer, Integer> numeros = new HashMap<>();
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista(numeros, qtd, entrada, valoresInseridos);

        int maiorElemento = maiorElemento(numeros);

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

    public static void elementosDaLista(Map<Integer, Integer> numeros, int qtd, Scanner entrada,
            Set<Integer> valoresInseridos) {
        for (int i = 0; i < qtd; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            numeros.put(i, valor);
        }
    }

    public static int maiorElemento(Map<Integer, Integer> numeros) {
        int maior = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
            }
        }
        return maior;
    }

    public static void imprimirResultados(int maiorElemento) {
        System.out.println("O maior elemento da lista e: " + maiorElemento);
    }
}

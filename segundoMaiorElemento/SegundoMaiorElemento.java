package segundoMaiorElemento;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Crie um programa que leia um vetor de números inteiros
 * e encontre o segundo maior elemento presente no vetor.
 * Usando array.
*/

public class SegundoMaiorElemento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumeros(entrada);

        int[] numeros = new int[tamanhoDaLista];
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista(numeros, entrada, valoresInseridos);

        while (numeros.length < 2 || valoresInseridos.size() < 2) {
            System.out.println("E necessario pelo menos dois numeros diferentes para encontrar o segundo maior.");
            tamanhoDaLista = lerNumeros(entrada);
            numeros = new int[tamanhoDaLista];
            valoresInseridos.clear();
            elementosDaLista(numeros, entrada, valoresInseridos);
        }

        int segundoMaior = segundoMaiorElemento(numeros);

        imprimirResultados(numeros, segundoMaior);

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

    public static int segundoMaiorElemento(int[] numeros) {
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior && numero < maior) {
                segundoMaior = numero;
            }
        }
        return segundoMaior;
    }

    public static void imprimirResultados(int[] numeros, int segundoMaior) {
        System.out.println("O segundo maior numero da lista " + Arrays.toString(numeros) + " e: " + segundoMaior);
    }
}

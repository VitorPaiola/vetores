package somaVetoresV2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * Crie um programa que leia dois vetores de números
 * inteiros com o mesmo tamanho e exiba um novo vetor com
 * a soma dos elementos correspondentes dos dois vetores.
 * Usando List.
*/

public class SomaVetoresV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoLista = lerNumeros(entrada);

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaLista1(lista1, tamanhoLista, entrada, valoresInseridos);
        elementosDaLista2(lista2, tamanhoLista, entrada, valoresInseridos);

        List<Integer> soma = calcularSoma(lista1, lista2);

        imprimirResultados(soma);

        entrada.close();
    }

    public static int lerNumeros(Scanner entrada) {
        return solicitarValor("Digite o tamanho das listas? ", entrada, new HashSet<>());
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

    public static void elementosDaLista1(List<Integer> lista1, int qtd, Scanner entrada, Set<Integer> valoresInseridos) {
        System.out.println("--- LISTA 1 ---");
        for (int i = 0; i < qtd; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            lista1.add(valor);
        }
    }

    public static void elementosDaLista2(List<Integer> lista2, int qtd, Scanner entrada, Set<Integer> valoresInseridos) {
        System.out.println("--- LISTA 2 ---");
        for (int i = 0; i < qtd; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            lista2.add(valor);
        }
    }

    public static List<Integer> calcularSoma(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> soma = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            soma.add(lista1.get(i) + lista2.get(i));
        }
        return soma;
    }

    public static void imprimirResultados(List<Integer> soma) {
        System.out.print("A soma dos vetores e: ");
        for (Integer valor : soma) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

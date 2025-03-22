package somaVetoresV3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * Crie um programa que leia dois vetores de números
 * inteiros com o mesmo tamanho e exiba um novo vetor com
 * a soma dos elementos correspondentes dos dois vetores.
 * Usando Map e EntrySet.
*/

public class SomaVetoresV3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoLista = lerNumeros(entrada);

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDoMap1(map1, tamanhoLista, entrada, valoresInseridos);
        elementosDoMap2(map2, tamanhoLista, entrada, valoresInseridos);

        Map<Integer, Integer> soma = calcularSoma(map1, map2);

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

    public static void elementosDoMap1(Map<Integer, Integer> map1, int tamanhoLista, Scanner entrada, Set<Integer> valoresInseridos) {
        System.out.println("--- LISTA 1 ---");
        for (int i = 0; i < tamanhoLista; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            map1.put(i, valor);
        }
    }

    public static void elementosDoMap2(Map<Integer, Integer> map2, int tamanhoLista, Scanner entrada, Set<Integer> valoresInseridos) {
        System.out.println("--- LISTA 2 ---");
        for (int i = 0; i < tamanhoLista; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada, valoresInseridos);
            map2.put(i, valor);
        }
    }

    public static Map<Integer, Integer> calcularSoma(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        Map<Integer, Integer> soma = new HashMap<>();
        for (int i = 0; i < map1.size(); i++) {
            soma.put(i, map1.get(i) + map2.get(i));
        }
        return soma;
    }

    public static void imprimirResultados(Map<Integer, Integer> soma) {
        System.out.print("A soma dos vetores e: ");
        for (Map.Entry<Integer, Integer> entry : soma.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }
}

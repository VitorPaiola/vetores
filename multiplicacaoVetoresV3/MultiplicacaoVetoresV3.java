package multiplicacaoVetoresV3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Escreva um programa que leia dois vetores de
 * numeros inteiros com o mesmo tamanho e exiba um novo
 * vetor com os elementos resultantes da multiplicacao
 * dos elementos correspondentes dos dois vetores.
 * Usando Map e EntrySet.
 */

public class MultiplicacaoVetoresV3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumero(entrada);

        Map<Integer, Integer> lista = new HashMap<>();

        elementosDaLista(lista, tamanhoDaLista, entrada);

        Map<Integer, Integer> listaResultante = calcularProduto(lista);

        imprimirResultados(lista, listaResultante);

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
                System.out.println("Entrada vazia não permitida. Digite um número válido.");
                continue;
            }

            try {
                numero = Integer.parseInt(input);
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("Entrada inválida. Digite um número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite apenas números.");
            }
        }
    }

    public static void elementosDaLista(Map<Integer, Integer> lista, int tamanhoDaLista, Scanner entrada) {
        System.out.println("--- LISTA 1 ---");
        int[] lista1 = new int[tamanhoDaLista];
        for (int i = 0; i < tamanhoDaLista; i++) {
            lista1[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
        }

        System.out.println("--- LISTA 2 ---");
        int[] lista2 = new int[tamanhoDaLista];
        for (int i = 0; i < tamanhoDaLista; i++) {
            lista2[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
            lista.put(lista1[i], lista2[i]);
        }
    }

    public static Map<Integer, Integer> calcularProduto(Map<Integer, Integer> lista) {
        Map<Integer, Integer> resultado = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : lista.entrySet()) {
            resultado.put(entry.getKey(), entry.getKey() * entry.getValue());
        }
        return resultado;
    }

    public static void imprimirResultados(Map<Integer, Integer> lista, Map<Integer, Integer> listaResultante) {
        System.out.println("--- RESULTADO ---");
        System.out.println(
            "O produto entre " + lista.keySet() + " e " + lista.values() + " e: " + listaResultante.values()
        );
    }
}

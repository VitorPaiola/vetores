package multiplicacaoVetoresV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa que leia dois vetores de
 * numeros inteiros com o mesmo tamanho e exiba um novo
 * vetor com os elementos resultantes da multiplicacao
 * dos elementos correspondentes dos dois vetores.
 * Usando List.
*/

public class MultiplicacaoVetoresV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumero(entrada);

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        elementosDaLista(lista1, tamanhoDaLista, entrada, "LISTA 1");
        elementosDaLista(lista2, tamanhoDaLista, entrada, "LISTA 2");

        List<Integer> listaResultante = calcularProduto(lista1, lista2);

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

    public static void elementosDaLista(List<Integer> lista, int tamanhoDaLista, Scanner entrada, String nomeLista) {
        System.out.println("--- " + nomeLista + " ---");
        for (int i = 0; i < tamanhoDaLista; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
            lista.add(valor);
        }
    }

    public static List<Integer> calcularProduto(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            resultado.add(lista1.get(i) * lista2.get(i));
        }
        return resultado;
    }

    public static void imprimirResultados(List<Integer> lista1, List<Integer> lista2, List<Integer> listaResultante) {
        System.out.println("--- RESULTADO ---");
        System.out.println("O produto entre " + lista1 + " e " + lista2 + " e: " + listaResultante);
    }
}

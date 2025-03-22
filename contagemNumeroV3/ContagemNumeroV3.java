package contagemNumeroV3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Faça um programa que leia uma lista de números inteiros e
 * exiba quantas vezes um número específico aparece na lista.
 * Usando Map e EntrySet.
 */

public class ContagemNumeroV3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoDaLista = lerNumero(entrada);

        List<Integer> numeros = new ArrayList<>();

        elementosDaLista(numeros, tamanhoDaLista, entrada);

        Map<Integer, Integer> frequencia = contarFrequencia(numeros);

        imprimirResultados(frequencia);

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
                if (numero >= 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void elementosDaLista(List<Integer> numeros, int tamanhoDaLista, Scanner entrada) {
        for (int i = 0; i < tamanhoDaLista; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
            numeros.add(valor);
        }
    }

    public static Map<Integer, Integer> contarFrequencia(List<Integer> numeros) {
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int numero : numeros) {
            frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);
        }
        
        return frequencia;
    }

    public static void imprimirResultados(Map<Integer, Integer> frequencia) {
        for (Map.Entry<Integer, Integer> entrada : frequencia.entrySet()) {
            int numero = entrada.getKey();
            int repeticoes = entrada.getValue();
            String mensagem = repeticoes == 1
                    ? "O numero " + numero + " aparece 1 vez na lista."
                    : "O numero " + numero + " aparece " + repeticoes + " vezes na lista.";

            System.out.println(mensagem);
        }
    }
}

package somaElementosVetorV3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Crie um programa que leia um vetor de números
 * inteiros e exiba a soma de todos os elementos.
 * Usando Map.
*/

public class SomaElementosVetorV3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtd = lerNumeros(entrada);
        Map<Integer, Integer> numeros = new LinkedHashMap<>();

        elementosDaLista(numeros, qtd, entrada);

        int soma = calcularSoma(numeros);

        imprimirResultados(soma);

        entrada.close();
    }

    public static int lerNumeros(Scanner entrada) {
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
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void elementosDaLista(Map<Integer, Integer> numeros, int qtd, Scanner entrada) {
        for (int i = 0; i < qtd; i++) {
            int valor = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
            numeros.put(i, valor);
        }
    }

    public static int calcularSoma(Map<Integer, Integer> numeros) {
        int soma = 0;
        for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
            soma += entry.getValue();
        }
        return soma;
    }

    public static void imprimirResultados(int soma) {
        System.out.println("A soma dos elementos e: " + soma);
    }
}

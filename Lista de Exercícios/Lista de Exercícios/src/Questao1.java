/*1) Escreva um programa que recebe três números inteiros e informe quantos são pares e
qual o menor, depois gere um número aleatório (de 0 a 10) e diga se divide o menor valor
dos três. Pesquise na API de Java como gerar um número aleatório. */

import java.util.Random;

public class Questao1 {
    public static void Numeros(int num1, int num2, int num3){
        int[] lista = {num1, num2, num3};
        int qnt_pares = 0;
        int menor = num1;
        String resposta;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                qnt_pares++;
            }
            if (lista[i] < menor) {
                menor = lista[i];
            }
        }

        Random aleatorio = new Random();
        int num_aleatorio = aleatorio.nextInt(10);

        if (menor % num_aleatorio == 0){
            resposta = ("O número aleatório " + num_aleatorio + " divide o menor valor.");
        } else {
            resposta = ("O número aleatório " + num_aleatorio + " não divide o menor valor.");
        }

        System.out.println("Quantidade de números pares: " + qnt_pares);
        System.out.println("Menor número: " + menor);
        System.out.println(resposta);
    }


    public static void main(String[] args) {
        Numeros(10,26,48);
    }
}

/*Seja uma equação do segundo grau, no formato ax2 + bx + c, faça um programa que
receba os coeficientes (a, b, c) e informe as raízes, exceto no caso de raiz complexa.
Pesquise na API de Java como calcular a raiz quadrada.*/

import java.lang.Math;
public class Questao3 {
    
    public static void raizes(int a, int b, int c){
        double delta, x1, x2;

        delta = (Math.pow(b, 2))-(4*a*c);

        x1 = ((-b) + Math.sqrt(delta))/(2*a);
        x2 = ((-b) - Math.sqrt(delta))/(2*a);

        System.out.println("As raízes são: " + x1 + " e " + x2);
    }

    public static void main(String[] args) {
        raizes(1, 6, 5);
    }
}

import java.util.Arrays;

/*Escreva um programa que mostra como saída uma “escada” formada por asteriscos (*)
com uma quantidade de degraus especificada pelo usuário.*/

public class Questao5 {
    public static void escada(int quant) {
        char degrau = '*';

        for (int i = 1; i <= quant; i++) {
            char[] listaDeAsts = new char[i]; 
            Arrays.fill(listaDeAsts, degrau);
            String degrausComAsts = new String(listaDeAsts);
            System.out.println(degrausComAsts);
        }
        
    }

    public static void main(String[] args) {
        escada(25);
    }
}

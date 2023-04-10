/*6) Construa uma classe árvore que tem como atributos um inteiro para representar a sua
idade, uma String que contém seu nome, outro inteiro para representar a idade máxima e
um double que contém o tamanho da árvore em metros. Crie um método para envelhecer
a arvore que aumenta a idade em um ano e o tamanho em alguns centímetros (qualquer
valor serve), lembre que se a árvore morrer, não será mais possível fazê-la crescer. */

import java.util.Scanner;

public class Arvore {
    int idade, idade_max;
    String nome;
    double tamanho;
    double crescimento;


   public static void envelhecer(int idade, int idade_max, String nome, double tamanho, double crescimento) {
        if (idade < idade_max){
            idade += 1;
            tamanho += crescimento;
            System.out.println("A arvore " + nome + " agora tem " + idade + " anos e " + tamanho + "metros de altura");
        } else {
            System.out.println("A arvore já tem " + idade + " anos e não pode mais crescer,ela tem " + tamanho + "metros de altura");        
        }  
    }

    public static void main(String[] args) {
        boolean continuar = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome da arvore: ");
        String nome = input.next();

        input = new Scanner(System.in);
        System.out.println("digite a idade da arvore: ");
        int idade = input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Digite a idade maxima da arvore: ");
        int idade_max = input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Digite o tamanho inicial da arvore: ");
        double tamanho = input.nextDouble();

        input = new Scanner(System.in);
        System.out.println("Digite a taxa de crescimento da arvore: ");
        double crescimento = input.nextDouble();

        while (continuar == true){
            input = new Scanner(System.in);
            System.out.println("Deseja que a arvore continue crescendo?(s/n): ");
            
            String nome = input.next();
        }
    }


    //Getters and Setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade_max() {
        return idade_max;
    }

    public void setIdade_max(int idade_max) {
        this.idade_max = idade_max;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getCrescimento() {
        return crescimento;
    }

    public void setCrescimento(double crescimento) {
        this.crescimento = crescimento;
    }
}

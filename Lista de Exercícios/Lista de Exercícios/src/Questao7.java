import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        boolean continuar = true;
        int acao;
        int valor;

        Scanner input = new Scanner(System.in);
        
        Heroi hero = new Heroi();

        hero.setVida_max(10);
        hero.setVida_atual(10);
        hero.setNome("NetinhoMascarado");
        hero.setMagia_max(10);
        hero.setMagia_atual(10);
        hero.setHabilidades("Fazer as pessoas se sentirem desconfortáveis");

        while(continuar == true){
            System.out.println(" ");
            System.out.println("Qual ação você deseja fazer?");
            System.out.println("1-Receber Dano; 2- Usar Magia;");
            System.out.println("3-Recuperar Vida; 4-Recuperar Magia;");
            System.out.println("5-Sair.");
            acao = input.nextInt();
            input = new Scanner(System.in);
            System.out.println(" ");
            switch (acao) {
                case 1:
                    System.out.println("Digite a quantidade de Dano que será recebido:");
                    valor = input.nextInt();
                    input = new Scanner(System.in);
                    hero.receberDano(valor);
                    break;
                
                case 2:
                    System.out.println("Digite a quantidade de Magia que será usada:");
                    valor = input.nextInt();
                    input = new Scanner(System.in);
                    hero.usarMagia(valor);
                    break;
                
                case 3:
                    System.out.println("Digite a quantidade de Vida que será recuperada:");
                    valor = input.nextInt();
                    input = new Scanner(System.in);
                    hero.recuperarVida(valor);
                    break;

                case 4:
                    System.out.println("Digite a quantidade de Magia que será recuperada:");
                    valor = input.nextInt();
                    input = new Scanner(System.in);
                    hero.recuperarMagia(valor);
                    break;

                default:
                    System.out.println("Se encerra a jornada do nosso herói");
                    continuar = false;
                    break;
            }
        }
    }
}

//Fazer um switch case para o user escolher o que quer fazer, no SC tem um while enquanto ele não sai.
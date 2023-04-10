/*2) Faça um programa que dada a idade de um jogador de futebol, classifique-o em uma
das seguintes categorias:

Idade Categoria
14 - 15 anos Infantil
16 - 17 anos Juvenil
18 - 20 anos Júnior
Acima de 20 anos Profissional */

public class Questao2 {
    public static void categoria(int idade) {
        if (idade == 14 || idade == 15){
            System.out.println("O jogador se encaixa na categoria Infantil");
        }else if (idade == 16 || idade == 17){
            System.out.println("O jogador se encaixa na categoria Juvenil");
        } else if (idade >= 18 && idade <= 20){
            System.out.println("O jogador se encaixa na categoria Júnior");
        } else if (idade > 20){
            System.out.println("O jogador se encaixa na categoria Profissional");
        } else {
            System.out.println("O jogador nçao se encaixa em nenhuma categoria.");
        }
    }

    public static void main(String[] args) {
        categoria(20);
    }
}

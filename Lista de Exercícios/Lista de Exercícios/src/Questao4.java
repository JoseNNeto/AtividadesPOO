/*4) Crie um programa que verifica se o ano digitado pelo usuário no console é bissexto.
Se o ano for bissexto, a mensagem "xxxx é bissexto" (onde xxxx é o ano digitado pelo
usuário) deve ser impressa, caso contrário a mensagem "xxxx não é bissexto" deve
aparecer no console. Se o usuário digitar um número negativo, imprima "xxxx não é um
ano válido".
Lembrando, para um ano ser bissexto, ele deve:
 Ser divisível por 4;
 Não ser divisível por 100, a menos que seja divisível também por 400.
Exemplos:
 2004 é bissexto, pois é divisível por 4, mas não é por 100.
 2000 é bissexto, pois apesar de ser divisível por 100, também é divisível por 400.
 1900 NÃO é bissexto pois apesar de ser divisível por 4, também é divisível por 100
e não por 400. */

public class Questao4 {
    public static void bissexto(int ano){
        boolean bissexto = false;

        if (ano % 4 == 0){
            if (ano % 100 != 0){
                bissexto = true;
            } else{
                bissexto = false;
                if (ano % 400 == 0){
                    bissexto = true;
                }
            }
        } else {
            bissexto = false;
        }
        
        if (bissexto == true){
            System.out.println(ano + " é bissexto");
        } else {
            System.out.println(ano + " não é bissexto");
        }
    }

    public static void main(String[] args) {
        bissexto(1900);
    }
}

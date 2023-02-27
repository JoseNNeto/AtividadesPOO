public class Exercise1a {
    public static void main(String[] args){
        int x = 1;
        while (x < 10){
            x = x + 1;
            if (x > 3){
                System.out.println("big x");
            }
        }
    }
}


/* O código compilou, porém não exibiu nada pois não cumpre a condição
 * do while, pois o valor de x é 1 e não é menor que 10.
 * Para exibir algo, devemos modificar o valor de x, na linha 3
 * somaremos 1 ao valor de x, ficando x = x + 1;
   com isso, exibirá o que foi pedido no código.*/
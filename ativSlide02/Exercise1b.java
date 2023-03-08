public class Exercise1b {
    public static void main(String[] args){
        int x = 5;
        while (x > 1){
            x = x -1;
            if (x < 3){
                System.out.println("small x");
            }
        }
    }
}

/*  Este não compilou, pois inicialmente não era atribuido a nenhuma classe
 *  Para corrigir, basta adicionar a classe e o método main. */
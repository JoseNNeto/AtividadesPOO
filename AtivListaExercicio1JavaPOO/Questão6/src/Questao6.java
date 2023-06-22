public class Questao6 {
    public static void main(String[] args) {
        //String resposta;

        Arvore newTree = new Arvore();

        newTree.setIdade(0);
        newTree.setNome("Arvere");
        newTree.setIdade_max(2);
        newTree.setTamanho(5.0);

        double taxa_cresc = 0.5;

        newTree.crescer(taxa_cresc);
    }
}
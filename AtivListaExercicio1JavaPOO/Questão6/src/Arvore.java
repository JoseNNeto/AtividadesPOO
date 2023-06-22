public class Arvore{
    int idade;
    String nome;
    int idade_max;
    double tamanho;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade_max() {
        return idade_max;
    }
    public void setIdade_max(int idade_max) {
        this.idade_max = idade_max;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void crescer(double tam_cresc) {
        while (idade < idade_max){
        if (idade < idade_max){
            idade = getIdade() + 1;
            tamanho = getTamanho() + tam_cresc;

           System.out.println("A arvore " + nome + " Agora tem " + idade + " Anos e tem " + tamanho + " Metros.");
        } else {
            System.out.println("A arvore " + nome + " Chegou em sua idade máxima, que são " + idade + " Anos e ela chegou em " + tamanho + " Metros.");
        }
        }
    }
}
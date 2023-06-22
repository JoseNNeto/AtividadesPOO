public class Heroi {
    int vida_max, vida_atual;
    int magia_max, magia_atual;
    String nome;
    String habilidades;

    //Getters and Setters

    public int getVida_max() {
        return vida_max;
    }
    public void setVida_max(int vida_max) {
        this.vida_max = vida_max;
    }
    public int getVida_atual() {
        return vida_atual;
    }
    public void setVida_atual(int vida_atual) {
        this.vida_atual = vida_atual;
    }
    public int getMagia_max() {
        return magia_max;
    }
    public void setMagia_max(int magia_max) {
        this.magia_max = magia_max;
    }
    public int getMagia_atual() {
        return magia_atual;
    }
    public void setMagia_atual(int magia_atual) {
        this.magia_atual = magia_atual;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    //Métodos

    public void receberDano(int dano){
        if (dano >= vida_atual){
            System.out.println("O heroi morreu! R.I.P " + nome);
            setVida_atual(0);
        } else{
            vida_atual = getVida_atual() - dano;
            System.out.println("A vida do heroi " + nome + " Agora é " + vida_atual + " de HP ");
        }
        
    }

    public void usarMagia(int quantidade){
        if (quantidade >= magia_atual){
            System.out.println("Acabou a magia do herói " + nome);
            setMagia_atual(0);
        } else{
            magia_atual = getMagia_atual() - quantidade;
            System.out.println("A magia do heroi " + nome + " Agora é " + magia_atual + " de MP ");
        }
    }

    public void recuperarVida(int quantidade) {
        if (vida_atual == vida_max){
            System.out.println("Já está cheia a vida do herói " + nome);
        } else if(vida_atual + quantidade > vida_max){
            setVida_atual(vida_max);
            System.out.println("A vida do herói " + nome + " Agora é " + vida_atual + " de MP ");
        } else{
            vida_atual = getVida_atual() + quantidade;
            System.out.println("A vida do herói " + nome + " Agora é " + vida_atual + " de MP ");        
        }
    }

    public void recuperarMagia(int quantidade) {
        if(magia_max == magia_atual){
            System.out.println("Já está cheia a magia do herói " + nome);
        } else if(magia_atual + quantidade > magia_max){
            setMagia_atual(magia_max);
            System.out.println("A magia do herói " + nome + " Agora é " + magia_atual + " de MP ");
        } else {
            magia_atual = getMagia_atual() + quantidade;
            System.out.println("A magia do herói " + nome + " Agora é " + magia_atual + " de MP ");
        }
    }

}

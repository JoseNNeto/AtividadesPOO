public class Cliente extends Pessoa {
    double valorDivida;
    int anoNascim;

    //Getters and Setters
    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public int getAnoNascim() {
        return anoNascim;
    }
    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    @Override
    public void ListaTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("sexo: " + sexo);
        System.out.println("Valor da dívida: " + valorDivida);
        System.out.println("Ano de nascimento:" + anoNascim);
    }
}


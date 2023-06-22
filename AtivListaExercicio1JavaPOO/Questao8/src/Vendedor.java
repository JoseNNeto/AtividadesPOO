public class Vendedor extends Empregado {
    double valorVendas;
    int qntVendas;

    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public int getQntVendas() {
        return qntVendas;
    }
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public void ListaTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Salario: " + salario);
        System.out.println("Matrícula:" + matricula);
        System.out.println("Valor das vendas: " + valorVendas);
        System.out.println("Quantidade de Vendas: " + qntVendas);
    }
}

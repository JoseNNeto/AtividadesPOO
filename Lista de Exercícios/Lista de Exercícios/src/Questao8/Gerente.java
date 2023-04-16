public class Gerente extends Empregado {
    String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public void ListaTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Salario: " + salario);
        System.out.println("Matrícula:" + matricula);
        System.out.println("Gerencia: " + nomeGerencia);
    }
}

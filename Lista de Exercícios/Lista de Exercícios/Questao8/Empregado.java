public class Empregado extends Pessoa {
    double salario;
    String matricula;

    //Getters and Setters
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorINSS(double salario){
        double valor;

        valor = (salario * 0.11);

        return valor;
    }

    @Override
    public void ListaTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Salario: " + salario);
        System.out.println("Matrícula:" + matricula);
    }
}

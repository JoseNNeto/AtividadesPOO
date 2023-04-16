public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pessoa");
        Pessoa p = new Pessoa();
        p.setNome("Neto");
        p.setIdade(19);
        p.setSexo("Masculino");
        p.ListaTudo();
        System.out.println("");

        System.out.println("Cliente");
        Cliente c = new Cliente();
        c.setNome("Neto");
        c.setIdade(19);
        c.setSexo("Masculino");
        c.setValorDivida(1000.0);
        c.setAnoNascim(2003);
        c.ListaTudo();
        System.out.println("");

        System.out.println("Empregado");
        Empregado e = new Empregado();
        e.setNome("Neto");
        e.setIdade(19);
        e.setSexo("Masculino");
        e.setSalario(2000);
        e.setMatricula("20221EWBJ0246");
        double inss = e.valorINSS(e.salario);
        e.ListaTudo();
        System.out.println("O valor do INSS é " + inss);
        System.out.println("");

        System.out.println("Gerente");
        Gerente g = new Gerente();
        g.setNome("Neto");
        g.setIdade(19);
        g.setSexo("Masculino");
        g.setSalario(2000);
        g.setMatricula("20221EWBJ0246");
        g.setNomeGerencia("POO");
        g.ListaTudo();
        System.out.println("");

        System.out.println("Vendedor");
        Vendedor v = new Vendedor();
        v.setNome("Neto");
        v.setIdade(19);
        v.setSexo("Masculino");
        v.setSalario(2000);
        v.setMatricula("20221EWBJ0246");
        v.setValorVendas(5000);
        v.setQntVendas(300);
        v.ListaTudo();
        System.out.println("");
    }
}

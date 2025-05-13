public class Empregado {

    int identificacao;
    String nome;
    String sobrenome;
    double salario;

    public double getSalarioAnual() {
        return salario * 12;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public void editarSalario(double percentualDeAumento) {
        salario += salario * percentualDeAumento;
    }

}

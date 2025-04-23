public class Main {
    public static void main(String[] args) {
                
        /*
         * Crie uma classe Empregado que terá como atributos:
         * Identificação
         * Nome
         * Sobrenome
         * Salário (mensal)
         * Crie métodos para:
         * Saber o salário anual do empregado
         * Saber o nome completo do empregado
         * Modificar o salário, o parâmetro do método deve ser o percentual de aumento
         */

        Empregado empregado1 = new Empregado();

        empregado1.identificacao = 1;
        empregado1.nome = "tadeu";
        empregado1.sobrenome = "alves";
        empregado1.salario = 500.00;

        System.out.printf("Salário anual = R$ %.2f\n",empregado1.getSalarioAnual());
        System.out.printf("Nome completo: %s\n", empregado1.getNomeCompleto());
        
        empregado1.editarSalario(0.15);
        System.out.printf("Novo salário R$ %.2f\n", empregado1.salario);

    }
}

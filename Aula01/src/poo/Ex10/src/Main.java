public class Main {
    public static void main(String[] args) {

        OnibusEscolar onibus1 = new OnibusEscolar();

        try {
            onibus1.setQuantidadeDeEstudantes(35);
            //onibus1.setQuantidadeDeEstudantes(45); // lança a exceção
            onibus1.setQuantidadeDeProfessores(2);
            onibus1.setQuantidadeDeProfessores(0); // lança a exceção
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.printf("A quantidade de estudantes atual é: %d.\n",
                    onibus1.getQuantidadeDeEstudantes());
            System.out.printf("A quantidade de professores atual é: %d.\n",
                    onibus1.getQuantidadeDeProfessores());
        }
    }
}

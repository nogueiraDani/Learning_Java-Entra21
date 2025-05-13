public class OnibusEscolar {

    private int quantidadeDeEstudantes;
    private int quantidadeDeProfessores;

    public OnibusEscolar() {
    }

    public int getQuantidadeDeEstudantes() {
        return quantidadeDeEstudantes;
    }

    public void setQuantidadeDeEstudantes(int quantidadeDeEstudantes) {
        if (quantidadeDeEstudantes <= 40) {
            this.quantidadeDeEstudantes = quantidadeDeEstudantes;
        } else {
            this.quantidadeDeEstudantes = 40;
            throw new IllegalArgumentException("A capacidade maxima do onibus é de 40 alunos.");
        }
    }

    public int getQuantidadeDeProfessores() {
        return quantidadeDeProfessores;
    }

    public void setQuantidadeDeProfessores(int quantidadeDeProfessores) {

        if (quantidadeDeProfessores > 0 && this.quantidadeDeProfessores != 0) {
            this.quantidadeDeProfessores = quantidadeDeProfessores;
        } else {
            setQuantidadeDeEstudantes(0);
            this.quantidadeDeProfessores = 0;
            throw new IllegalArgumentException("Pela regra, no onibus escolar sempre deve haver 1 professor.");
        }
    }

}

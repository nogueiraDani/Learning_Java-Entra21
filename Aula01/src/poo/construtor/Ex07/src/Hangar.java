import java.util.ArrayList;
import java.util.List;

public class Hangar {

    List<Aeronave> aeronaves = new ArrayList<>();

    public String getNomeAeronaveComMaiorCapacidadeDePassageiros() {
        int maiorQuantidadePassageiros = Integer.MIN_VALUE;
        String nomeAeronave = "";

        if (aeronaves.isEmpty()) {
            return "-- Não há aeronaves no hangar.-- ";
        } else {
            for (Aeronave aeronave : aeronaves) {
                if (aeronave.quantidadeDePassageiros > maiorQuantidadePassageiros) {
                    maiorQuantidadePassageiros = aeronave.quantidadeDePassageiros;
                    nomeAeronave = aeronave.modelo;
                }
            }
        }

        return nomeAeronave;
    }

    public String getNomeAeronaveComMaiorEficiencia() {
        double maiorEficiencia = Double.MIN_VALUE;
        String nomeAeronave = "";

        if (aeronaves.isEmpty()) {
            return "-- Não há aeronaves no hangar. --";
        } else {
            for (Aeronave aeronave : aeronaves) {
                double eficiencia = aeronave.getEficiencia();
                if (eficiencia > maiorEficiencia) {
                    maiorEficiencia = eficiencia;
                    nomeAeronave = aeronave.modelo;
                }
            }
        }

        return nomeAeronave;
    }

    public String getNomeAeronaveComMaiorDistanciaDeVoo() {
        double maiorTempoDeVoo = Double.MIN_VALUE;
        String nomeAeronave = "";

        if (aeronaves.isEmpty()) {
            return "-- Não há aeronaves no hangar. --";
        } else {
            for (Aeronave aeronave : aeronaves) {
                double tempoDeVoo = aeronave.getTempoDeVoo();
                if (tempoDeVoo > maiorTempoDeVoo) {
                    maiorTempoDeVoo = tempoDeVoo;
                    nomeAeronave = aeronave.modelo;
                }
            }
            return nomeAeronave;
        }

    }
}

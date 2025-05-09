public class Conta {

    private String nomeTitular;
    private Double saldo = 0.0;

    public Conta(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Conta(String nomeTitular, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    

}

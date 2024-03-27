public class ContaBancaria {
    private String nomeTitular;
    private String numeroConta;
    private double saldoConta;

    public ContaBancaria(String nomeTitular, String numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldoConta = 0;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
}

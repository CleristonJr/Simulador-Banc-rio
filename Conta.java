public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Erro: Valor inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada para " + contaDestino.getNomeTitular());
        } else {
            System.out.println("Falha na transferência.");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numeroConta + " | Titular: " + nomeTitular + " | Saldo: R$ " + String.format("%.2f", saldo);
    }
}

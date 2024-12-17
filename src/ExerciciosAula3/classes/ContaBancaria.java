package ExerciciosAula3.classes;

// Classe base
public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$" + valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para consultar o saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Getter para saldo (caso necessário em subclasses)
    public double getSaldo() {
        return saldo;
    }

    // Setter para saldo (usado pela subclasse para ajustes)
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

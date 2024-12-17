package ExerciciosAula3.classes;

// Subclasse ContaCorrente que herda de ContaBancaria
public class ContaCorrente extends ContaBancaria {
    private static final double TARIFA_MENSAL = 15.0;

    // Método para cobrar a tarifa mensal
    public void cobrarTarifaMensal() {
        if (getSaldo() >= TARIFA_MENSAL) {
            setSaldo(getSaldo() - TARIFA_MENSAL);
            System.out.println("Tarifa mensal de R$" + TARIFA_MENSAL + " foi cobrada.");
        } else {
            System.out.println("Saldo insuficiente para cobrar a tarifa mensal.");
        }
    }
}

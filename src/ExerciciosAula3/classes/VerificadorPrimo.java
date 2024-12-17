package ExerciciosAula3.classes;

// Subclasse VerificadorPrimo que herda de NumerosPrimos
public class VerificadorPrimo extends NumerosPrimos {

    // Método específico para verificar se um número é primo
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}

package ExerciciosAula3.classes;

// Subclasse GeradorPrimo que herda de NumerosPrimos
public class GeradorPrimo extends NumerosPrimos {

    // Método específico para gerar o próximo número primo após um dado número
    public int gerarProximoPrimo(int numero) {
        int proximo = numero + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}

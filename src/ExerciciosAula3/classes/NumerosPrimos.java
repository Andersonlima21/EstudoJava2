package ExerciciosAula3.classes;
import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    // Método para verificar se um número é primo
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para listar os números primos até um limite
    public List<Integer> listarPrimos(int limite) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
}

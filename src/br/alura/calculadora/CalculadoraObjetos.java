package br.alura.calculadora;

import br.alura.aula.objeto.Heranca;
import br.alura.aula.objeto.Obj;
import br.alura.aula.objeto.Obj2;

public class CalculadoraObjetos {
    int total;

    public int getTotal() {
        return total;
    }

//    public void calcula(Obj obj1) {
//        total += (int) obj1.retornaMedia();
//    }
//    public void calcula(Obj2 obj2) {
//        total += (int) obj2.retornaMedia();
//    }

    public void calcula(Heranca heranca) {
        total += (int) heranca.retornaMedia();
    }
}

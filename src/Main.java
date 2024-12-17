import br.alura.aula.objeto.Obj;
import br.alura.aula.objeto.Obj2;

public class Main {
    public static void main(String[] args) {
        Obj objeto1 = new Obj();

        // Setter de um atributo privado
        objeto1.setValues("Primeiro obj");

//        objeto1.nomeObj = "Primeiro obj"; // Não utilizo mais passagem direta de valor para o atribudo
        objeto1.setValueInt(1);
        objeto1.setValueDouble(10.0);

        // Acessando atributos do objeto
//        System.out.println(objeto1.nomeObj);
//        System.out.println(objeto1.valorIntObj);
//        System.out.println(objeto1.valorDoubleObj);

        // Chamanda metodo
        objeto1.exibeObj();

        objeto1.somaValores(3);
        objeto1.somaValores(10);

        System.out.println("Total de valores enviados: " + objeto1.getTotalDeValoresEnviados());

        System.out.println(objeto1.retornaMedia());

        Obj2 objeto2 = new Obj2();

        objeto2.setValues("Segundo obj");
        objeto2.setValueInt(2);
        objeto2.setValueDouble(20);
        objeto2.exibeObj();
        objeto2.somaValores(6);
        objeto2.somaValores(20);
        System.out.println("Total de valores enviados OBJETO 2: " + objeto2.getTotalDeValoresEnviados());
        System.out.println(objeto2.retornaMedia());

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Obj objeto1 = new Obj();

        objeto1.nomeObj = "Primeiro obj";
        objeto1.valorIntObj = 1;
        objeto1.valorDoubleObj = 10.0;

        // Acessando atributos do objeto
//        System.out.println(objeto1.nomeObj);
//        System.out.println(objeto1.valorIntObj);
//        System.out.println(objeto1.valorDoubleObj);

        // Chamanda metodo
        objeto1.exibeObj();

        objeto1.somaValores(3);
        objeto1.somaValores(10);

        System.out.println(objeto1.somaDeValores);
        System.out.println(objeto1.retornaMedia());

    }
}
public class Obj {
    String nomeObj;
    int valorIntObj;
    double valorDoubleObj;

    double somaDeValores;
    int totalDeValoresEnviados;

    void exibeObj() {
        System.out.println("Nome do objeto: " + nomeObj);
        System.out.println("Valor inteiro do objeto: " + valorIntObj);
        System.out.println("Valor double do objeto: " + valorDoubleObj);
    }

    void somaValores(double valor) {
        somaDeValores += valor;
        totalDeValoresEnviados++;
    }

    double retornaMedia() {
        return somaDeValores / totalDeValoresEnviados;
    }


}

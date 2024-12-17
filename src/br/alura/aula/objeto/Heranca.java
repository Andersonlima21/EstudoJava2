package br.alura.aula.objeto;

public class Heranca {
    private String nomeObj;
    private int valorIntObj;
    private double valorDoubleObj;

    private double somaDeValores;
    private int totalDeValoresEnviados;

    public void exibeObj() {
        System.out.println("Nome do objeto: " + nomeObj);
        System.out.println("Valor inteiro do objeto: " + valorIntObj);
        System.out.println("Valor double do objeto: " + valorDoubleObj);
    }

    public void somaValores(double valor) {
        somaDeValores += valor;
        totalDeValoresEnviados++;
    }

    public double retornaMedia() {
        return somaDeValores / totalDeValoresEnviados;
    }

    public int getTotalDeValoresEnviados() {
        return totalDeValoresEnviados;
    }

    public void setValues(String nomeObj) {
        this.nomeObj = nomeObj;
    }

    public void setValueInt(int valorInt) {
        this.valorIntObj = valorInt;
    }

    public void setValueDouble(double valorDouble) {
        this.valorDoubleObj = valorDouble;
    }
}

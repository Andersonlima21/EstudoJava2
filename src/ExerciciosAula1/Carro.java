package ExerciciosAula1;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTenicaCarro() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    int calcularAnoDoCarro(int anoAtual) {
        return anoAtual - ano;
    }

}

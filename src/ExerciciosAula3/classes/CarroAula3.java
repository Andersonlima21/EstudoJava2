package ExerciciosAula3.classes;

public class CarroAula3 {
    String modelo;
    double precoAno1;
    double precoAno2;
    double precoAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public String retornaMaiorEMenorPreco() {
        double maior = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
        double menor = Math.min(precoAno1, Math.min(precoAno2, precoAno3));

        return "Maior preço: " + maior + ", Menor preço: " + menor;
    }
}

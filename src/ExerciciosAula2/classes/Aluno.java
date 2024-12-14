package ExerciciosAula2.classes;

public class Aluno {
    private String nomeAluno;
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;
    private double quartaNota;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getQuartaNota() {
        return quartaNota;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public double getTerceiraNota() {
        return terceiraNota;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public void setTerceiraNota(double terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

    public void setQuartaNota(double quartaNota) {
        this.quartaNota = quartaNota;
    }

    public double calcularMedia() {
        return primeiraNota + segundaNota + terceiraNota + quartaNota / 4;
    }
}

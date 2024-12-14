package ExerciciosAula2.classes;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String analisePessoa() {
        return idade >= 18 ? nome + " é maior de idade!" : nome + " é menor de idade!";
    }

}

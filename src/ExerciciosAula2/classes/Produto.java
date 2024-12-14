package ExerciciosAula2.classes;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double adicionaDesconto(int desconto) {
        double descontoCalculado = preco * desconto / 100.0;
        preco -= descontoCalculado; // Reduz o preço pelo valor do desconto
        return preco; // Retorna o preço atualizado
    }
}

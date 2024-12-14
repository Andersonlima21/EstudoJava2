package ExerciciosAula2.classes;

public class Livro {
    private String nomeLivro;
    private String autor;

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public String exibeDetalhes(){
        return "Nome do Livro: " + nomeLivro + " Autor: " + autor;
    }
}

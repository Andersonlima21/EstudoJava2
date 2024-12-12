package ExerciciosAula1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacoes;
    int numAvaliacoes;

    // Retorno void pois já apresento aqui mesmo o que eu preciso
    void exibeFichaTecnicaMusica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Artista: " + artista);
    }

    void avaliacaoMusica(double nota){
        avaliacoes += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacoes / numAvaliacoes;
    }

}

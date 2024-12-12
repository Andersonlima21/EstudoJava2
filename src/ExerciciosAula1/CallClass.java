package ExerciciosAula1;

public class CallClass {
    public static void main(String[] args) {
        // 1 - Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa stringRetorno = new Pessoa();

        stringRetorno.msg = "Olá, mundo! Envio da minha string, para a classe Pessoa";

        // Impressão do metodo helloWord, com o valor recebido armazenado
        System.out.println(stringRetorno.helloWord());

        // 2 - Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número
        Calculadora valorParaDobrar = new Calculadora();
        int valorADobrar = 6;

        int valorDobrado = valorParaDobrar.dobraValor(valorADobrar);
        System.out.println("valor enviado para dobrar: " + valorADobrar + " valore retornado dobrado: " + valorDobrado);

        // 3-Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();

        musica.titulo = "The Emptiness Machine";
        musica.anoLancamento = 2024;
        musica.artista = "Linkin park";

        // Exibindo ficha tecnica
        musica.exibeFichaTecnicaMusica();

        // Enviando avaliações para a musica
        musica.avaliacaoMusica(7.9);
        musica.avaliacaoMusica(8.9);

        // Capturando a avaliação da musica
        double valorAvaliacao = musica.mediaAvaliacoes();
        System.out.println("Media das avaliações da musica: " + valorAvaliacao);

        // 4- Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();

        carro.modelo = "peugeot 208 - Hatch";
        carro.ano = 2021;
        carro.cor = "Preto";

        carro.exibeFichaTenicaCarro();

        int idadeCarro = carro.calcularAnoDoCarro(2024);

        System.out.println("O carro tem " + idadeCarro + " anos de idade");

        // 5- Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Aluno aluno = new Aluno();

        aluno.nomeAluno = "Anderson";
        aluno.idadadeAluno = 27;

        aluno.exibeDadosAluno();

    }

}

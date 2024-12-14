package ExerciciosAula2;

import ExerciciosAula2.classes.Aluno;
import ExerciciosAula2.classes.IdadePessoa;
import ExerciciosAula2.classes.Livro;
import ExerciciosAula2.classes.Produto;

public class Exercicios {
    public static void main(String[] args) {

        // 2 - Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Anderson lima");
        pessoa.setIdade(25);

        System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade());
        System.out.println(pessoa.analisePessoa());

        System.out.println("-----------------------------------------------------------");

//        3-Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
        Produto produto = new Produto();

        produto.setNome("Produto 1");
        produto.setPreco(215.50);

        System.out.println("O " + produto.getNome() + " custa: " + produto.getPreco() + " reais!");
        System.out.println("O valor com desconto é: " + produto.adicionaDesconto(50));

        System.out.println("-----------------------------------------------------------");

//        4-Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
        Aluno aluno = new Aluno();

        aluno.setNomeAluno("Anderson lima");
        aluno.setPrimeiraNota(7.9);
        aluno.setSegundaNota(8.2);
        aluno.setTerceiraNota(9.1);
        aluno.setQuartaNota(6.9);

        System.out.println("Aluno: " + aluno.getNomeAluno());
        System.out.println("Notas: Nota 1: " + aluno.getPrimeiraNota() + " Nota 2: " + aluno.getSegundaNota() + " Nota 3: " + aluno.getTerceiraNota() + " Nota 4: " + aluno.getQuartaNota());
        System.out.println("Media do aluno: " + aluno.calcularMedia());

        System.out.println("-----------------------------------------------------------");

//  5-Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
        Livro livro = new Livro();

        livro.setNomeLivro("Livro 1");
        livro.setAutor("Anderson lima");

        System.out.println("Livro: " + livro.getNomeLivro() + " Autor: " + livro.getAutor());
        System.out.println(livro.exibeDetalhes());
    }
}

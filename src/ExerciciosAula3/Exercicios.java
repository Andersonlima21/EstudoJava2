package ExerciciosAula3;

import ExerciciosAula3.classes.*;

public class Exercicios {
    public static void main(String[] args) {
        // Criando uma instância da subclasse ModeloCarro
        ModeloCarro carro = new ModeloCarro("Peugeot 208", "Gasolina");

        // Definindo os preços para os anos
        carro.setPrecoAno1(50000.0);
        carro.setPrecoAno2(52000.0);
        carro.setPrecoAno3(48000.0);

        // Exibindo as informações do modelo e preços
        System.out.println(carro.exibirInformacoes());
        System.out.println(carro.retornaMaiorEMenorPreco());

        System.out.println("------------------------------------------------------------");

        // Criando uma instância de Cachorro
        Cachorro cachorro = new Cachorro();
        System.out.println("Cachorro:");
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println();

        // Criando uma instância de Gato
        Gato gato = new Gato();
        System.out.println("Gato:");
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println("------------------------------------------------------------------");


        // Criando uma instância de ContaCorrente
        ContaCorrente conta = new ContaCorrente();

        // Realizando operações bancárias
        System.out.println("Operações da Conta Corrente:");
        conta.depositar(100.0);
        conta.consultarSaldo();

        conta.sacar(50.0);
        conta.consultarSaldo();

        conta.cobrarTarifaMensal();
        conta.consultarSaldo();

        conta.sacar(50.0); // Tentando sacar mais do que o saldo
        conta.cobrarTarifaMensal(); // Tentando cobrar tarifa sem saldo suficiente

        System.out.println("-----------------------------------------------------------------------------");
        // Criando instâncias das subclasses
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();

        // Testando o VerificadorPrimo
        verificador.verificarSeEhPrimo(11); // 11 é primo
        verificador.verificarSeEhPrimo(15); // 15 não é primo

        System.out.println();

        // Testando o GeradorPrimo
        System.out.println("Próximo número primo após 10: " + gerador.gerarProximoPrimo(10)); // 11
        System.out.println("Próximo número primo após 20: " + gerador.gerarProximoPrimo(20)); // 23

        // Testando o método listarPrimos da classe base
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        System.out.println("\nLista de primos até 50: " + numerosPrimos.listarPrimos(50));
    }
}

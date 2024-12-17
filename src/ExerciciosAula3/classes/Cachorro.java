package ExerciciosAula3.classes;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu: Au Au!");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}

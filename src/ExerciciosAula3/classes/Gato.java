package ExerciciosAula3.classes;

// Subclasse Gato que herda de Animal
public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O gato miou: Miau!");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis!");
    }
}

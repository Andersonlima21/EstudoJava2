package ExerciciosAula3.classes;

// Subclasse que herda de CarroAula3
public class ModeloCarro extends CarroAula3 {
    private String tipoCombustivel;

    // Construtor para inicializar atributos
    public ModeloCarro(String modelo, String tipoCombustivel) {
        this.setModelo(modelo);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    // Método para exibir informações do modelo específico
    public String exibirInformacoes() {
        return "Modelo: " + getModelo() + ", Tipo de Combustível: " + tipoCombustivel;
    }
}

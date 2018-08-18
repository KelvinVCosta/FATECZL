package composicao;

public class Automovel {

    //Atributos
    private String modelo;
    private Motor motor;

    /**
     * Cria contrutor indicando o modelo e a potencia do motor
     *
     * @param modelo
     * @param potenciaMotor
     */
    public Automovel(String modelo, int potenciaMotor) {
        this();
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor);
    }

    public Automovel() {
        super();
    }

    //Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Automovel{" + "modelo=" + modelo + ", motor=" + motor + '}';
    }

}

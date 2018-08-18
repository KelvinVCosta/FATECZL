package agregacao;

public class Automovel {

    //Atributos
    private String modelo;
    private Motor motor;
    private Motorista motorista;

    //Construtores
    public Automovel(String modelo, int potenciaMotor, Motorista motorista) {
        this(modelo, potenciaMotor);
        this.motorista = motorista;
    }

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

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    //toString
    @Override
    public String toString() {
        return "Automovel{" + "modelo=" + modelo + ", motor=" + motor + ", motorista=" + motorista + '}';
    }

}

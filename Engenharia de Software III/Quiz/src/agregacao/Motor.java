package agregacao;

import composicao.*;

public class Motor {

//Atributos
    private int potencia;

//Construtores
    public Motor(int potencia) {
        this();
        this.potencia = potencia;
    }

    public Motor() {
        super();
    }

//Getters e Setters
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + '}';
    }

}

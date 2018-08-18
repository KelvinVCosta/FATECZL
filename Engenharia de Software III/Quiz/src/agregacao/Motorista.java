package agregacao;

public class Motorista {

    //Atributos
    private String nome;
    private int habilitacao;

    //Construtores
    public Motorista(String nome, int habilitacao) {
        this();
        this.nome = nome;
        this.habilitacao = habilitacao;
    }

    public Motorista() {
        super();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(int habilitacao) {
        this.habilitacao = habilitacao;
    }

    //toString
    @Override
    public String toString() {
        return "Motorista{" + "nome=" + nome + ", habilitacao=" + habilitacao + '}';
    }

}

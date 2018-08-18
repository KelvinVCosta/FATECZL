package agregacao;

public class Agregacao {

    public static void main(String[] args) {
        Motorista motorista = new Motorista("Waldo", 123456);
        Automovel gurgel = new Automovel("Gurgel 800", 800, motorista);
        System.out.println(gurgel.toString());
    }

}

package exemplos.carpark;

import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class CarPark {
    
    public static Semaphore semaforo;
    Thread estacionamento;
    static Stream pegarSair;
    static long count = 0;
    
    public static void main(String[] args) {
        
        
        int totalCarros = 10;
        int maxCarros = 3;
        semaforo = new Semaphore(maxCarros);
        for (int i = 0; i < totalCarros; i++) {
            Thread estacionamento = new CarParkThread(i, semaforo);
            estacionamento.start();
        }
        count = pegarSair.count();
        System.out.println("count: " + count);
    }
    
    
}

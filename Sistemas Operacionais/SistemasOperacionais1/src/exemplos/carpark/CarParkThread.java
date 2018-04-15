package exemplos.carpark;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Kelvin Costa
 */
public class CarParkThread extends Thread {

    private int numCarro;
    private Semaphore semaforo;

    CarParkThread(int numCarro, Semaphore semaforo) {
        this.numCarro = numCarro;
        this.semaforo = semaforo;
    }

    /**
     *
     */
    @Override
    public void run() {
        try {
            semaforo.acquire();
            entraCarro();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            semaforo.release();
        }
    }

    private void entraCarro() {
        System.out.println("Carro " + numCarro + " entrou");
        ficaCarro();
        saiCarro();
    }

    private void ficaCarro() {
        int tempoEspera = (int) ((Math.random() + 1) * 5000);
        try {
            Thread.sleep(tempoEspera);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void saiCarro() {
        System.out.println("Carro " + numCarro + " saiu");
    }

}

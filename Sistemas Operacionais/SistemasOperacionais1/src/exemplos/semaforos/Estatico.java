package exemplos.semaforos;

public class Estatico {

    public static void main(String[] args){
        for (int i = 2; i < 4; i++){
            Thread t = new EstaticoThread(i);
            t.start();
        }
    }
    
}

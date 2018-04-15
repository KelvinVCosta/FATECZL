package exemplos.semaforos;

/**
 *
 * @author Kelvin Costa
 */
public class EstaticoThread extends Thread {

    static float x;
    int idThread;
    
    /**
     *
     * @param idThread
     */
    public EstaticoThread(int idThread) {
        this.idThread = idThread;
    }
    
    /**
     *
     */
    public void run(){
        conta();
    }

    private void conta() {
        if(idThread % 2 == 0){
            System.out.println("id par");
            for(int i = 1; i < 10; i++){
                x = (float)(x + Math.pow(idThread, i));
                System.out.println(x);
            }
        } else {
            System.out.println("id impar");
            for ( float i = 1; i < 10; i++){
                x = x + (1/i);
                System.out.println(x);
            }
        }
    }
    
}

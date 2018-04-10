package exercicios.sala;

/**
 *
 * @author Kelvin Costa
 */
public class SalaThread extends Thread {


    
    private long tempoPorta;
    private long velocidade;
    
    private int id;
    
    public SalaThread(int id, long velocidade){
        this.id = id;
        this.velocidade = velocidade;
    }
    
    @Override
    public void run(){
        entraCorredor();
    }

    private void entraCorredor() {
        System.out.println("#" + id + " iniciou");
        andarCorredor();
        filaPorta();
    }

    private void andarCorredor() {
        
    }

    private void filaPorta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

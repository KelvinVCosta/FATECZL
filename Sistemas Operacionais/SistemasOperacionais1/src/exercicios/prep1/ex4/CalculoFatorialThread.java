/*
 * Considere que o cálculo de um número fatorial (usando varáveis tipo long) podem ser calculados, 
 * em Java, de maneira recursiva ou não. 
 * Faça duas threads (Uma que calcule Fatorial de maneira recursiva e outra não recursiva), 
 * onde cada Thread vai receber o número que se quer calcular o fatorial, 
 * vai exibir o valor do fatorial do número e o tempo que cada thread leva para realizar a operação. 
 * Considere usar o System.nanoTime() ao invés do System.currentTimeMillis(), 
 * o resultado sairá em nano segundos.
*/
package exercicios.prep1.ex4;

/**
 *
 * @author 670543
 */
public class CalculoFatorialThread extends Thread{
    
    int comRecursividade(int num){
        if (num <= 1) return 1;
        else return num * comRecursividade(--num);
    }
    
    static int semRecursividade(int num){ 
        int x = num;
        for(int i = num-1; i >0;i--){
            x *= i;
        }
        return x;
    }
    
    @Override
    public void run(){
        calcular();
    }        

    private void calcular(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

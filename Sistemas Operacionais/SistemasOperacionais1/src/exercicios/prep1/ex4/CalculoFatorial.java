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
public class CalculoFatorial extends Thread{
    
    static double comRecursividade(double num){
        if (num <= 1) return 1;
        else return num * comRecursividade(--num);
    }
    
    static double semRecursividade(double num){ 
        double x = num;
        for(double i = num-1; i >0;i--){
            x *= i;
        }
        return x;
    }
    
    static Thread t1 = new Thread() {
        @Override
        public void run(){
            System.out.println("t1 iniciado");
            double tempoInicial = System.nanoTime();
            System.out.println("Resultado t1: " + comRecursividade(120));
            double tempoFinal = System.nanoTime();
            double tempoTotal = (tempoFinal - tempoInicial) * Math.pow(10, 9);
            System.out.println("Tempo t1: " + tempoTotal);
            System.out.println("t1 finalizado");
        }
    };

    static Thread t2 = new Thread() {
        @Override
        public void run(){
            System.out.println("t2 iniciado");
            double tempoInicial = System.nanoTime();
            System.out.println("Resultado t2: " + semRecursividade(120));
            double tempoFinal = System.nanoTime();
            double tempoTotal = (tempoFinal - tempoInicial) * Math.pow(10, 9);
            System.out.println("Tempo t2: " + tempoTotal);
            System.out.println("t2 finalizado");
        }
    };

    public static void main(String[] args){
        double tempo = System.nanoTime();
        t1.start();
        t2.start();
    }
    
}

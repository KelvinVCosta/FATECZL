/*
 * 4 pessoas caminham, cada uma em um corredor diferente. 
 * Os 4 corredores terminam em uma única porta. 
 * Apenas 1 pessoa pode cruzar a porta, por vez. 
 * Considere que cada corredor tem 200m. e cada pessoa anda de 4 a 6 m/s. 
 * Cada pessoa leva de 1 a 2 segundos para abrir e cruzar a porta. 
 * Faça uma aplicação em java que simule essa situação.
 */
package exercicios.sala;

/**
 *
 * @author Kelvin Costa
 */
public class Sala {

    private final int MAXCRUZARPORTA = 1;
    private final int QTDPESSOAS = 4;
    private final int TAMANHOCORREDOR = 200;
    private final int VELOMAX = 6;
    private final int VELOMIN = 4;
    private SalaDto[] salaVetor;

    public void adicionarFilaPorta(int i, int idSala, double tempoExecucao) {
        this.salaVetor[i].setId(idSala);
        this.salaVetor[i].setTempo(tempoExecucao);
    }

}

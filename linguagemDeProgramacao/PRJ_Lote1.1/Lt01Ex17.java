/*
Autor: Kelvin Vicente Costa
Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
          Receber o tempo de percurso e a velocidade média.
*/

import javax.swing.JOptionPane;

public class Lt01Ex17{
  static double CalcularDistancia(double velocidadeMedia, double tempoPercurso){
    double distanciaPercorrida = velocidadeMedia * tempoPercurso;
    return distanciaPercorrida;
  }

  static double CalcularCombustivel(double distanciaPercorrida){
    double CONSUMO = 12;
    double qtdCombustivel = distanciaPercorrida / CONSUMO;
    return qtdCombustivel;
  }

  public static void main(String[] args){
    double tempoPercurso, velocidadeMedia, qtdCombustivel, distanciaPercorrida;

    tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso: "));
    velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média: "));

    distanciaPercorrida = CalcularDistancia(velocidadeMedia, tempoPercurso);
    qtdCombustivel = Math.round(CalcularCombustivel(distanciaPercorrida));

    JOptionPane.showMessageDialog(null, "A quantidade de combustivel consumida é " + qtdCombustivel + " litros");
  }
}

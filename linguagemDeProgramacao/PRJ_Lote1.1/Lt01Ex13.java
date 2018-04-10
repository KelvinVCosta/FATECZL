/*
Autor: Kelvin Vicente Costa
Objetivo: Receba a quantidade de alimento em quilos.
          Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/

import javax.swing.JOptionPane;

public class Lt01Ex13{
  public static void main(String[] args){
    double qtdAlimento, qtdDias;
    double KILOS = 1000;
    double QTDCONSUMIDA = 50;

    qtdAlimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos em kilos: "));
    qtdDias = (qtdAlimento * KILOS) / QTDCONSUMIDA;

    JOptionPane.showMessageDialog(null, "A quantidade de dias que o alimento durará será: " + qtdDias);
  }
}

/*
Autor: Kelvin Vicente Costa
Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3o ângulo.
*/

import javax.swing.JOptionPane;

public class Lt01Ex14{
  public static void main(String[] args){
    int angulo1, angulo2, angulo3;
    int TOTAL_ANGULOS = 180;

    angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro angulo: "));
    angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo angulo: "));

    angulo3 = TOTAL_ANGULOS - (angulo1 + angulo2);

    JOptionPane.showMessageDialog(null, "O valor do terceiro angulo é: " + angulo3);
  }
}

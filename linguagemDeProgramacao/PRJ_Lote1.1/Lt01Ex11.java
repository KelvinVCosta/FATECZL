/*
Autor: Kelvin Vicente Costa
Objetivo: Receba o raio de uma circunferência.
          Calcule e mostre o comprimento da circunferência.
*/

import javax.swing.JOptionPane;

public class Lt01Ex11{
  public static void main(String[] args){
    double raio, circunferencia;
    double PI = 3.14;

    raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da circunferencia: "));

    circunferencia = 2 * PI * raio;

    JOptionPane.showMessageDialog(null, "O valor do comprimento da circunferencia é: " + circunferencia);

  }
}

/*
Autor: Kelvin Vicente Costa
Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
*/

import javax.swing.JOptionPane;

public class Lt01Ex09{
  public static void main(String[] args){
    double num1, num2, somaQuadrados;
    double EXPOENTE = 2;

    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

    somaQuadrados = Math.pow(num1, EXPOENTE) + Math.pow(num2, EXPOENTE);

    JOptionPane.showMessageDialog(null, "A soma dos quadrados é: " + somaQuadrados);
  }
}

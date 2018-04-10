/*
Autor: Kelvin Vicente Costa
Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/

import javax.swing.JOptionPane;

public class Lt01Ex10{
  public static void main(String[] args){
    double num1, num2, diferenca;

    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

    if (num1 > num2){
      diferenca = num1 - num2;
    } else {
      diferenca = num2 - num1;
    }

    JOptionPane.showMessageDialog(null, "A diferença entre os valores é: " + diferenca);
  }
}

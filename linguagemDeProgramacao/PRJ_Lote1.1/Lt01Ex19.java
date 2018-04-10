/*
Autor: Kelvin Vicente Costa
Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
*/

import javax.swing.JOptionPane;

public class Lt01Ex19{
  static double RetornarMaiorValor(double valor1, double valor2){
    if (valor1 > valor2){
      return valor1;
    } else{
      return valor2;
    }
  }

  public static void main(String[] args){
    double valor1, valor2, maiorValor;

    valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

    maiorValor = RetornarMaiorValor(valor1, valor2);

    JOptionPane.showMessageDialog(null, "O maior valor é " + maiorValor);
  }
}

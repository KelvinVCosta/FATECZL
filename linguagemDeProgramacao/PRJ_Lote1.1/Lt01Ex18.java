/*
Autor: Kelvin Vicente Costa
Objetivo: Receba 2 valores inteiros.
          Calcule e mostre o resultado da diferença do maior pelo menos valor.
*/

import javax.swing.JOptionPane;

public class Lt01Ex18{
  static int RetornarDiferenca(int valor1, int valor2){
    if (valor1 > valor2){
      return valor1 - valor2;
    } else{
      return valor2 - valor1;
    }
  }

  public static void main(String[] args){
    int valor1, valor2, diferenca;

    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

    diferenca = RetornarDiferenca(valor1, valor2);

    JOptionPane.showMessageDialog(null, "A diferença entre os valores é " + diferenca);
  }
}

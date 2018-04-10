/*
Autor: Kelvin Vicente Costa
Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/

import javax.swing.JOptionPane;

public class Lt01Ex24{
  static int ReceberValor(){
    return Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser verificado: "));
  }

  static void VerificarDivisivel(int valor){
    if (valor % 6 == 0){
      JOptionPane.showMessageDialog(null, "Valor divisivel por 2 e 3");
    } else {
      JOptionPane.showMessageDialog(null, "Valor não divisivel por 2 e 3");
    }
  }

  public static void main(String[] args){
    VerificarDivisivel(ReceberValor());
  }
}

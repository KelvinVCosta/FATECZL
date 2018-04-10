/*
Autor: Kelvin Vicente Costa
Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
resultado.
*/

import javax.swing.JOptionPane;

public class Lt01Ex01{
  public static void main(String[] args) {
      int ladoQuadrado, areaQuadrado;

      ladoQuadrado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
      areaQuadrado = ladoQuadrado * ladoQuadrado;
      JOptionPane.showMessageDialog(null, "O valor da area do quadrado é igual a: " + areaQuadrado);
  }
}

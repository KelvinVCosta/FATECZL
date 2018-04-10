/*
Autor: Kelvin Vicente Costa
Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/

import javax.swing.JOptionPane;

public class Lt01Ex03{
  public static void main(String[] args){
    int baseTriangulo, alturaTriangulo, areaTriangulo;

    baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triangulo: "));
    alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triangulo: "));

    areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

    JOptionPane.showMessageDialog(null, "A area do triangulo é: " + areaTriangulo);

  }
}

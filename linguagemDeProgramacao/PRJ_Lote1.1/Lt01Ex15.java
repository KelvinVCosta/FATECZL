/*
Autor: Kelvin Vicente Costa
Objetivo: Receba os valores de 2 catetos de um triângulo retângulo.
          Calcule e mostre a hipotenusa.
*/

import javax.swing.JOptionPane;

public class Lt01Ex15{
  public static void main(String[] args){
    double catetoAdjacente, catetoOposto, hipotenusa;
    double EXPOENTE = 2;

    catetoAdjacente = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto adjacente: "));
    catetoOposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto oposto: "));

    hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, EXPOENTE) + Math.pow(catetoOposto, EXPOENTE));

    JOptionPane.showMessageDialog(null, "o valor da hipotenusa é: " + hipotenusa);
  }
}

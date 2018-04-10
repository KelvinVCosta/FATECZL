/*
Autor: Kelvin Vicente Costa
Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo.
          Calcule e mostre seu volume.
*/

import javax.swing.JOptionPane;

public class Lt01Ex07{
  public static void main(String[] args){
    int comprimento, largura, altura, volume;

    comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do comprimento"));
    largura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lrgura"));
    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do altura"));

    volume = comprimento * largura * altura;

    JOptionPane.showMessageDialog(null, "O valor do volume é: " + volume);

  }
}

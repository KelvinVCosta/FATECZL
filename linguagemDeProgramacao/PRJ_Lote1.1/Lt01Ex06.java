/*
Autor: Kelvin Vicente Costa
Objetivo: Receba os valores em x e y.
          Efetua a troca de seus valores e mostre seus conteúdos.

x = 5
y = 3

x = x + y
x = 8
y = 3

y = x - y
x = 8
y = 5

x = x - y
x = 3
y = 5
*/

import javax.swing.JOptionPane;

public class Lt01Ex06{
  public static void main(String[] args){
    int valor1, valor2;

    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digito o primeiro valor: "));
    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digito o segundo valor: "));

    valor1 = valor1 + valor2;
    valor2 = valor1 - valor2;
    valor1 = valor1 - valor2;

    JOptionPane.showMessageDialog(null, "Valor1: " + valor1 + " Valor2: " + valor2);
  }
}

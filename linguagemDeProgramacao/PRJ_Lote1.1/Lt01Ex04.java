/*Lt01Ex04
Autor: Kelvin Vicente Costa
Objetivo:   Receba a temperatura em graus Celsius.
            Calcule e mostre a sua temperatura convertida em fahrenheit
            F = (9*C+160) /5.
            F = 1.8*C + 32
*/

import javax.swing.JOptionPane;

public class Lt01Ex04{
  public static void main(String[] args){
    double celsius, fahrenheit;

    celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da temperatura em Celsius: "));
    fahrenheit = 1.8 * celsius + 32;
    JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);
  }
}

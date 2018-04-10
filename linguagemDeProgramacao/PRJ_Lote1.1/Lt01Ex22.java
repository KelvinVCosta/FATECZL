/*
Autor: Kelvin Vicente Costa
Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente.

valor1 = valor1 + valor2;
valor2 = valor1 - valor2;
valor1 = valor1 - valor2;
*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Lt01Ex22{
  static int[] ReceberValores(){
    int valores[] = new int[2];
    valores[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor "));
    valores[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor "));
    return valores;
  }

  static int[] OrdenarValores(int[] valores){
    int valoresOrdenados[] = valores;
    if (valores[0] > valores[1]){
      valores[0] = valores[0] + valores[1];
      valores[1] = valores[0] - valores[1];
      valores[0] = valores[0] - valores[1];
    } else{
      valores[1] = valores[1] + valores[0];
      valores[0] = valores[1] - valores[0];
      valores[1] = valores[1] - valores[0];
    }
    return valoresOrdenados;
  }

  static void MostrarValores(int[] valoresOrdenados){
    String mostrarValores = "";
    for(int valor : valoresOrdenados){
      mostrarValores += " " + valor + ", ";
    }
    JOptionPane.showMessageDialog(null, mostrarValores);
  }

  public static void main(String[] args){
    MostrarValores(OrdenarValores(ReceberValores()));
  }

}

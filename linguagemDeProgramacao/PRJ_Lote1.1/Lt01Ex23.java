/*
Autor: Kelvin Vicente Costa
Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4o valor não necessariamente em ordem.
          Mostre os 4 números em ordem crescente.

valor1 = valor1 + valor2;
valor2 = valor1 - valor2;
valor1 = valor1 - valor2;
*/

import javax.swing.JOptionPane;



public class Lt01Ex23{
  static double ReceberValor(){
    double valor;
    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
    return valor;
  }

  static double[] ReceberValores(){
    boolean retornar = false;
    double[] valores = new double[4];
    int i;
    for (i = 0; i < 3; i++){
      do {
          retornar = false;
          valores[i] = ReceberValor();
        if(i>0){
          if (valores[i] < valores[i-1]){
            JOptionPane.showMessageDialog(null, " Valor deve ser maior que o anterior ");
            retornar = true;
          }
        }
      } while (retornar);
    }
    valores[i] = ReceberValor();
    return valores;
  }

  static double[] OrdenarValores(double[] valores){
    boolean desordenado = true;
    double[] valoresOrdenados = valores;
    do {
      for(int i = 2; i >= 0; i--){
          if(valoresOrdenados[i] > valoresOrdenados[i+1]){
             valoresOrdenados[i] = valoresOrdenados[i] + valoresOrdenados[i+1];
             valoresOrdenados[i+1] = valoresOrdenados[i] - valoresOrdenados[i+1];
             valoresOrdenados[i] = valoresOrdenados[i] - valoresOrdenados[i+1];
           } else{
             i = 0;
            desordenado = false;
           }
      }
    } while (desordenado);
    return valoresOrdenados;
  }

  static void MostrarValores(double[] valoresOrdenados){
    String mostrarValores = "";
    for(double valor : valoresOrdenados){
      mostrarValores += " " + valor + "; ";
    }
    JOptionPane.showMessageDialog(null, mostrarValores);
  }

  public static void main(String[] args){
    MostrarValores(OrdenarValores(ReceberValores()));
  }
}

/*
Autor: Kelvin Vicente Costa
Objetivo: Receba 2 números inteiros.
          Verifique e mostre se o maior número é múltiplo do menor.
*/

import javax.swing.JOptionPane;

public class Lt01Ex26{
  static int[] ReceberValores(){
    int[] valores = new int[2];
    for(int i = 0; i < 2; i++){
      valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
    }
    return valores;
  }

  static void VerificarDivisivel(int[] valores){

    int maior;
    int menor;

    if(valores[0] > valores[1]){
      maior = valores[0];
      menor = valores[1];
    } else{
      menor = valores[0];
      maior = valores[1];
    }

    if(maior % menor == 0){
      JOptionPane.showMessageDialog(null, maior + " é multiplo de " + menor);
    } else {
      JOptionPane.showMessageDialog(null, maior + " não é multiplo de " + menor);
    }

  }

  public static void main(String[] args){
    VerificarDivisivel(ReceberValores());
  }
}

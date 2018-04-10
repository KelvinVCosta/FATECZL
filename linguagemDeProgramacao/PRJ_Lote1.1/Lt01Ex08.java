/*
Autor: Kelvin Vicente Costa
Objetivo: Receba o valor de um depósito em poupança.
          Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
*/

import javax.swing.JOptionPane;

public class Lt01Ex08{
  public static void main(String[] args){
    double valorDeposito, valorAtualizado;
    double RENDIMENTO = 1.013;
    double QTDMESES = 1;

    valorDeposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));

    valorAtualizado = Math.round(valorDeposito * RENDIMENTO * QTDMESES);

    JOptionPane.showMessageDialog(null, "O valor atualizado após 1 mês de aplicação é de: " + valorAtualizado);

  }
}

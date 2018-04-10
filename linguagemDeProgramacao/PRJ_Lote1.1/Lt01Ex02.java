/*
Autor: Kelvin Vicente Costa
Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
*/

import javax.swing.JOptionPane;

public class Lt01Ex02{
  public static void main(String[] args){
    double salario, novoSalario;
    double REAJUSTE = 1.15;

    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor atual do salario: "));
    novoSalario = salario * REAJUSTE;
    JOptionPane.showMessageDialog(null, "O salario atualizado é: " + novoSalario);
  }
}

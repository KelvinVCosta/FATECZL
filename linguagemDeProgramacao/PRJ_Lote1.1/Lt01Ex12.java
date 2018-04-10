/*
Autor: Kelvin Vicente Costa
Objetivo: Receba o ano de nascimento e o ano atual.
          Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
*/

import javax.swing.JOptionPane;

public class Lt01Ex12{
  public static void main(String[] args){
    int idadeAtual, anoNascimento, anoAtual, idadeFutura;
    int TEMPO = 17;

    anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
    anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

    idadeAtual = anoAtual - anoNascimento;
    idadeFutura = idadeAtual + TEMPO;

    JOptionPane.showMessageDialog(null, "Sua idade daqui 17 anos será: " + idadeFutura);
  }
}

/*
Autor: Kelvin Vicente Costa
Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
          Mostre a mensagem de acordo com a média:
            a. Se a média for >= 6,0 exibir “APROVADO”;
            b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
            c. Se a média for < 3,0 exibir “RETIDO”.
*/

import javax.swing.JOptionPane;

public class Lt01Ex21{
  static double CalcularMedia(double nota1, double nota2, double nota3, double nota4){
      double QTDNOTAS = 4;
      double media;
      media = (nota1 + nota2 + nota3 + nota4) / QTDNOTAS;
      return media;
  }

  static void ExibirResultado(double media){
    if (media >= 6){
      JOptionPane.showMessageDialog(null, "Nota final: " + media + "\nAPROVADO ");
    } else if (media < 6 && media >= 3){
      JOptionPane.showMessageDialog(null, "Nota final: " + media + "\nEXAME ");
    } else {
      JOptionPane.showMessageDialog(null, "Nota final: " + media + "\nRETIDO ");
    }
  }

  public static void main(String[] args) {
    double nota1, nota2, nota3, nota4;

    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
    nota3 = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota: "));
    nota4 = Double.parseDouble(JOptionPane.showInputDialog("Quarta nota: "));

    ExibirResultado(CalcularMedia(nota1, nota2, nota3, nota4));

  }
}

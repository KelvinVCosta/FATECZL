/*
Autor: Kelvin Vicente Costa
Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora,
          o percentual de desconto e o número de descendentes.
          Calcule o salário que serão as horas trabalhadas x o valor por hora.
          Calcule o salário líquido (= Salário Bruto – desconto).
          A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
*/

import javax.swing.JOptionPane;

public class Lt01Ex16{
  static double CalculoSalarioBruto(double horasTrabalhadas, double valorHora){
    double salarioBruto;
    salarioBruto = horasTrabalhadas * valorHora;

    return salarioBruto;
  }

  static double CalculoSalarioLiquido(double salarioBruto, double desconto){
    double salarioLiquido;
    salarioLiquido = salarioBruto - (salarioBruto * desconto);

    return salarioLiquido;
  }

  static double CalculoDesconto(double porcentagemDesconto){
    double desconto;
    double PORCENTUAL = 100;

    desconto = porcentagemDesconto / PORCENTUAL;

    return desconto;
  }

  static double CalculoAcrescimo(double qtdDependentes){
    double valorAcrescimo;
    double ACRESCIMO = 100;

    valorAcrescimo = qtdDependentes * ACRESCIMO;

    return valorAcrescimo;
  }

  public static void main(String[] args){
    double qtdHorasTrabalho, valorHora, percentualDesconto, qtdDescendentes;
    double salarioBruto, salarioLiquido, descontoSalarial, acrescimoDependente, salarioReceber;

    qtdHorasTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
    valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: "));
    percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
    qtdDescendentes = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de descendentes: "));

    salarioBruto = CalculoSalarioBruto(qtdHorasTrabalho, valorHora);
    descontoSalarial = CalculoDesconto(percentualDesconto);
    salarioLiquido = CalculoSalarioLiquido(salarioBruto, descontoSalarial);
    acrescimoDependente = CalculoAcrescimo(qtdDescendentes);
    salarioReceber = salarioLiquido + acrescimoDependente;

    JOptionPane.showMessageDialog(null, "O salario a receber é: " + salarioReceber);
  }

}

/*
Autor: Kelvin Vicente Costa
Objetivo:
  1. Criar um menu de opções:
    Menu Principal
      1 – Carregar Notas
      2 – Retirar Notas
      3 – Estatística
      9 – Fim
    1.1. Carregar a quantidade de notas em uma área da memória com 6 ocorrências.
    1.2. Solicitar que o cliente faça a retirada de valores obedecendo ao critério do maior pelo menor.
    1.3. Dar a opção para o cliente escolher o valor e a quantidade de notas. P. ex.: 1 x 20, 2 x 10...
    1.4. Caso não tenha o valor da maior cédula, disponibilizar a próxima.
    1.5. Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a mensagem “EXCEDEU O LIMITE DO CAIXA”.
    1.6. Solicitar até 100 retiradas ou até não haver mais notas.
    1.7. No momento da solicitação do valor, coletar também o código do banco que o cliente tem conta, segundo:
      Código  Banco
      1       Banco do Brasil
      2       Santander
      3       Itaú
      4       Caixa
    1.8. No final, exibir a estatística, separada por bancos, com:
      1.8.1. O maior e o menor valor sacado;
      1.8.2. A média dos saques;
      1.8.3. Valor total dos saques;
      1.8.4. Valor das sobras dos caixas.
*/

import javax.swing.JOptionPane;

public class CaixaEletronico{
  static int nota2, nota5, nota10, nota20, nota50, nota100;
  static int valorRetirada, saldoTotal;
  static int qtdNotas, valorAtual = 0;

  static void MenuPrincipal(){
    int opcao;
    try{
      opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada: \n" +
                                                           "1 - Carregar notas \n" +
                                                           "2 - Retirar notas \n" +
                                                           "3 - Estatística \n" +
                                                           "9 - Fim "));
    } catch (NumberFormatException e) {
      opcao = 0;
    }

   switch (opcao) {
    case 1:
      CarregarNotas();
      break;
    case 2:
      RetirarNotas();
      break;
    case 3:
      //Estatistica();
      break;
    case 9:
      System.exit(0);
    default:
      JOptionPane.showMessageDialog(null, " Opção inválida \n Tente novamente ");
      MenuPrincipal();
   }
  }

  static int SubtrairValor(int valorRetirada, int valorNota){
    qtdNotas = valorRetirada / valorNota;
    valorRetirada -= qtdNotas * valorNota;
    return valorAtual;
  }

  static void CarregarNotas(){
    nota2 += Integer.parseInt(JOptionPane.showInputDialog("Quantide de notas de 2 a serem adicionadas: "));
    nota5 += Integer.parseInt(JOptionPane.showInputDialog("Quantide de notas de 5 a serem adicionadas: "));
    nota10 += Integer.parseInt(JOptionPane.showInputDialog("Quantide de notas de 10 a serem adicionadas: "));
    nota20 += Integer.parseInt(JOptionPane.showInputDialog("Quantide de notas de 20 a serem adicionadas: "));
    nota50 += Integer.parseInt(JOptionPane.showInputDialog("Quantide de notas de 50 a serem adicionadas: "));
    nota100 += Integer.parseInt(JOptionPane.showInputDialog("Quantide de notas de 100 a serem adicionadas: "));
    saldoTotal =  (nota2 * 2) + (nota5 * 5) + (nota10 * 10) +
                  (nota20 * 20) + (nota50 * 50) + (nota100 * 100);
    JOptionPane.showMessageDialog(null, "Valores adicionados com sucesso");
    MenuPrincipal();
  }

  static void RetirarNotas(){
    int valorRetirada, qtdNotas;
    valorRetirada = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para retirada: "));

    if (saldoTotal - valorRetirada < 0){
        JOptionPane.showMessageDialog(null, "EXCEDEU O LIMITE DO CAIXA");
        RetirarNotas();
    } else{



        JOptionPane.showMessageDialog(null, "Retirada efetuada com sucesso");
        MenuPrincipal();
    }
  }
  public static void main(String[] args){
    MenuPrincipal();
    }
}

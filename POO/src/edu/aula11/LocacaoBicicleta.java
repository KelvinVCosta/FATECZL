package edu.aula11;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kelvin
 */
public class LocacaoBicicleta {

    private JFrame janela;
    private JTextField txtNome = new JTextField(50);
    private JTextField txtBikeModel = new JTextField(30);
    private JTextField txtDataLocacao = new JTextField(8);
    private JTextField txtPreco = new JTextField(8);
    private JButton btnAdicionar = new JButton("Adicionar");
    private JButton btnPesquisar = new JButton("Pesquisar");

    public LocacaoBicicleta() {
        janela = new JFrame("Formulario de Locação");
        JPanel painel = new JPanel(new GridLayout(5, 2));

        painel.add(new JLabel("Nome do Cliente: "));
        painel.add(txtNome);
        painel.add(new JLabel("Modelo da Bicicleta: "));
        painel.add(txtBikeModel);
        painel.add(new JLabel("Data da Locação: "));
        painel.add(txtDataLocacao);
        painel.add(new JLabel("Preço: "));
        painel.add(txtPreco);

        painel.add(btnAdicionar);
        painel.add(btnPesquisar);
        
        janela.setContentPane(painel);

        janela.setSize(400, 300);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LocacaoBicicleta();
    }

}

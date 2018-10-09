package edu.aula8;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kelvin
 */
public class JanelaTeste {

    public static void main(String[] args){
        JFrame janela = new JFrame("Teste");
        JPanel painel = new JPanel();
        JLabel lblTexto = new JLabel("Texto antigo");
        JButton btnOk = new JButton("Aperte");
        painel.add(lblTexto);
        painel.add(btnOk);
        
        janela.setContentPane(painel);
        janela.setSize(400, 300);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnOk.addActionListener((ActionEvent ae) -> {
            lblTexto.setText("Novo texto");
        });
    }
}

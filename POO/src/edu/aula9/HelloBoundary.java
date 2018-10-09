package edu.aula9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kelvin
 */
public class HelloBoundary implements ActionListener {

    JLabel lblTexto = new JLabel();

    public HelloBoundary() {
        JFrame janela = new JFrame("Teste");
        JPanel painel = new JPanel();
        lblTexto = new JLabel("Texto antigo");
        JButton btnOk = new JButton("Aperte");
        painel.add(lblTexto);
        painel.add(btnOk);

        lblTexto.setText("Texto antigo");
        janela.setContentPane(painel);
        btnOk.addActionListener(this);

        janela.setSize(400, 300);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        lblTexto.setText("Novo antigo");
    }

    public static void main(String[] args) {
        new HelloBoundary();
    }
}

package edu.aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Kelvin
 */
public class Ouvinte implements ActionListener {

    public JLabel label;
    
    public Ouvinte(JLabel label){
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Botão apertado");
    }
}

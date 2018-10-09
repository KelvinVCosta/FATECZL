package edu.aula9;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kelvin
 */
public class AlunoBoundary {
    
    private final static String[] CURSOS = {"ADS", "Polimeros", "Logistica", 
        "Comex", "RH", "Gestão Empresarial"};
    
    private JFrame janela;
    private JTextField txtNome = new JTextField(30);
    private JTextField txtRa = new JTextField(10);
    private JTextField txtNascimento = new JTextField(10);
    private JTextField txtEmail = new JTextField(30);
    private JComboBox<String> cmbCurso = new JComboBox<>(CURSOS);
    private JTextField txtAltura = new JTextField(10);
    private JButton btnAdicionar = new JButton("Adicionar");
    private JButton btnPesquisar = new JButton("Pesquisar");
    
    public AlunoBoundary() {
        janela = new JFrame("Registro de alunos");
        JPanel painel = new JPanel(new GridLayout(2, 2));
        
        painel.add(new JLabel("Nome do aluno: "));
        painel.add(txtNome);
        painel.add(new JLabel("RA: "));
        painel.add(txtRa);
        painel.add(new JLabel("Data de nascimento: "));
        painel.add(txtNascimento);
        painel.add(new JLabel("Email: "));
        painel.add(txtEmail);
        painel.add(new JLabel("Curso: "));
        painel.add(cmbCurso);
        painel.add(new JLabel("Altura: "));
        painel.add(txtAltura);
        painel.add(btnAdicionar);
        painel.add(btnPesquisar);
        
    }
}

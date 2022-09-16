package br.com.senaibrasilia.projetoinicial;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener {

	private JButton btnLogar;
	private FlowLayout layout;
	private Container container;
	private JLabel textoUsuario = new JLabel("Usuário: ");
	
	

	public Login() {
		super();
		layout = new FlowLayout();
		container = getContentPane();

		JLabel label = new JLabel();
        label = new JLabel("Login ");
        container.add(label);
        
        JLabel labe2 = new JLabel();
        labe2 = new JLabel("Senha ");
        container.add(labe2);
		
		
		btnLogar = new JButton("Logar");
		add(btnLogar);
		setLayout(layout);
		btnLogar.addActionListener(this);
		setSize(800, 600);

	}

	public void actionPerformed(ActionEvent e) {

		JOptionPane.showMessageDialog(null, "Você clicou aqui");
	}

}

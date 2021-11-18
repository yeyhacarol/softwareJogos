package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Console;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.JButton;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtTituloJogo;
	private JTextField txtValor;
	private JTextField txtObservacoes;

	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloJogo = new JLabel("T\u00EDtulo do jogo:");
		lblTituloJogo.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblTituloJogo.setBounds(10, 10, 115, 30);
		contentPane.add(lblTituloJogo);
		
		txtTituloJogo = new JTextField();
		txtTituloJogo.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		txtTituloJogo.setBounds(135, 10, 175, 30);
		contentPane.add(txtTituloJogo);
		txtTituloJogo.setColumns(10);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblConsole.setBounds(10, 65, 115, 30);
		contentPane.add(lblConsole);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblFabricante.setBounds(10, 125, 115, 30);
		contentPane.add(lblFabricante);
		
		JComboBox comboConsoles = new JComboBox();
		comboConsoles.setModel(new DefaultComboBoxModel(Console.values()));
		comboConsoles.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		comboConsoles.setBounds(135, 65, 175, 30);
		contentPane.add(comboConsoles);
		
		JCheckBox checkZerado = new JCheckBox("Zerado");
		checkZerado.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		checkZerado.setBounds(135, 185, 84, 30);
		contentPane.add(checkZerado);
		
		
		JComboBox comboFabricantes = new JComboBox();
		comboFabricantes.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		comboFabricantes.setBounds(135, 125, 175, 30);
		contentPane.add(comboFabricantes);
		
		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblValor.setBounds(10, 245, 132, 30);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		txtValor.setColumns(10);
		txtValor.setBounds(135, 245, 175, 30);
		contentPane.add(txtValor);
		
		txtObservacoes = new JTextField();
		txtObservacoes.setBounds(10, 355, 300, 165);
		contentPane.add(txtObservacoes);
		txtObservacoes.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblObservacoes.setBounds(10, 320, 132, 30);
		contentPane.add(lblObservacoes);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		btnSalvar.setBounds(92, 563, 175, 30);
		contentPane.add(btnSalvar);
	}
}

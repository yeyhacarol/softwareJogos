package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repositoy.FabricanteRepository;
import br.senai.sp.jandira.repositoy.JogoRepository;

import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ButtonGroup;

public class TelaCadastroJogos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTituloJogo;
	private JTextField txtValor;
	private JTextField txtObservacoes;

	private int posicao;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public TelaCadastroJogos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTituloJogo = new JLabel("Título do jogo:");
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
		buttonGroup.add(checkZerado);
		checkZerado.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		checkZerado.setBounds(135, 185, 84, 30);
		contentPane.add(checkZerado);

		JComboBox comboFabricantes = new JComboBox();
		comboFabricantes.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		comboFabricantes.setBounds(135, 125, 175, 30);

		DefaultComboBoxModel<String> modelFabricantes = new DefaultComboBoxModel<String>();

		FabricanteRepository fabricantes = new FabricanteRepository();

		for (Fabricante fabricante : fabricantes.getFabricantes()) {
			modelFabricantes.addElement(fabricante.getNome());
		}

		comboFabricantes.setModel(modelFabricantes);

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
		txtObservacoes.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		txtObservacoes.setBounds(10, 355, 300, 165);
		contentPane.add(txtObservacoes);
		txtObservacoes.setColumns(10);

		JLabel lblObservacoes = new JLabel("Observações:");
		lblObservacoes.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblObservacoes.setBounds(10, 320, 132, 30);
		contentPane.add(lblObservacoes);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		btnSalvar.setBounds(92, 563, 175, 30);
		contentPane.add(btnSalvar);

		JLabel lblListaJogos = new JLabel("Lista de jogos:");
		lblListaJogos.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblListaJogos.setBounds(450, 10, 115, 30);
		contentPane.add(lblListaJogos);

		JScrollPane scrollPaneListaJogos = new JScrollPane();
		scrollPaneListaJogos.setBounds(449, 45, 275, 305);
		contentPane.add(scrollPaneListaJogos);

		JList listJogos = new JList();
		listJogos.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		scrollPaneListaJogos.setViewportView(listJogos);
		
		DefaultListModel<String> listaModel = new DefaultListModel<String>();
		listJogos.setModel(listaModel);

		JogoRepository jogos = new JogoRepository();

		
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Jogo meuJogo = new Jogo();
				Fabricante fabrica = new Fabricante();

				meuJogo.setTitulo(txtTituloJogo.getText());
				meuJogo.setObservacoes(txtObservacoes.getText());
				
				

				jogos.salvarJogos(meuJogo, posicao);

				meuJogo.setConsole(definirConsole(comboConsoles.getSelectedIndex()));
				
				posicao++;
				
				listaModel.addElement(meuJogo.getTitulo());
				
				txtTituloJogo.setText("");
				txtObservacoes.setText("");
				comboConsoles.setSelectedIndex(0);

			}
		});
		
		listJogos.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				Jogo jogo = jogos.listarJogo(listJogos.getSelectedIndex());
				txtTituloJogo.setText(jogo.getNome());
				txtObservacoes.setText(jogo.getObservacoes());
				
				comboConsoles.setSelectedIndex(jogo.getConsole().ordinal());
				comboFabricantes.setSelectedItem(jogo.getFabricante());
				
			}
		});

	}

	private Console definirConsole(int consoleSelecionado) {

		if (consoleSelecionado == 0) {
			return Console.ATARI;
		} else if (consoleSelecionado == 1) {
			return Console.GAMEBOY;
		} else if (consoleSelecionado == 2) {
			return Console.MASTERSYSTEM;
		} else if (consoleSelecionado == 3) {
			return Console.MEGADRIVE;
		} else if (consoleSelecionado == 4) {
			return Console.NINTENDO;
		} else if (consoleSelecionado == 5) {
			return Console.PLAYSTATION;
		} else {
			return Console.XBOX;
		}
	}
	

}

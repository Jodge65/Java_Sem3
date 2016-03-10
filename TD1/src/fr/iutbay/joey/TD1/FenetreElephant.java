package fr.iutbay.joey.TD1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class FenetreElephant extends JFrame
{
	private static final long serialVersionUID = 1L;

	public JLabel img = null;
	public JTextArea text;
	public JComboBox listeDeroulante;
	public JLabel auteur;
	
	public FenetreElephant()
	{
		super("Présentation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BorderLayout decoupage = new BorderLayout();
		getContentPane().setLayout(decoupage);
		
		img = new JLabel(new ImageIcon("img/test.png"));

		text = new JTextArea("Représentation de Tempora.\n\n Dessiné par Lumic4", 10, 20);

		JSplitPane divise = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, img, text);
		getContentPane().add(divise, BorderLayout.CENTER);

		JPanel divideBot = new JPanel();
		divideBot.setLayout(new GridLayout(1, 2, 5, 5));
		listeDeroulante = new JComboBox();
		listeDeroulante.add(new JLabel("test"));
		listeDeroulante.add(new JLabel("Play"));
		listeDeroulante.add(new JLabel("Pause"));
		listeDeroulante.add(new JLabel("Stop"));
		divideBot.add(listeDeroulante);

		auteur = new JLabel("Auteur : ");
		divideBot.add(auteur);
		
		getContentPane().add(divideBot, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}
}

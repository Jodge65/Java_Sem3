package fr.iutbay.joey.TD1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FenetreAeroport extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	protected JLabel titleText, paysText, villeText, lgPisteText, altPisteText;
	protected JButton valider;
	protected JTextField titleValue, paysValue, villeValue, lgPisteValue, altPisteValue, commentaire;
	protected JScrollPane commentairePanel;
	protected JCheckBox metre;
	
	public float PIED_IN_METER = 0.3048F;
	
	public FenetreAeroport()
	{
		super("A la recherche de l'aéroport parfait !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		titleText = new JLabel("Cote Aéroport : ");
		paysText = new JLabel("Pays : ");
		villeText = new JLabel("Ville : "); 
		lgPisteText = new JLabel("Longuer piste : "); 
		altPisteText = new JLabel("Altitude piste : "); 
		valider = new JButton("Chercher");
		titleValue = new JTextField(20); 
		paysValue = new JTextField(10);
		villeValue = new JTextField(10);
		lgPisteValue = new JTextField(10);
		altPisteValue = new JTextField(10);
		commentaire = new JTextField();
		commentairePanel = new JScrollPane(commentaire, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		metre = new JCheckBox();
		
		commentairePanel.setPreferredSize(new Dimension(300, 400));
		
		JPanel top = new JPanel();
		top.setLayout(new GridLayout(1, 3, 2, 2));
		top.add(titleText);
		top.add(titleValue);
		top.add(valider);
		
		JPanel mid = new JPanel();
		top.setLayout(new GridLayout(2, 4, 2, 2));
		mid.add(paysText);
		mid.add(paysValue);
		mid.add(villeText);
		mid.add(villeValue);
		mid.add(lgPisteText);
		mid.add(lgPisteValue);
		mid.add(altPisteText);
		mid.add(altPisteValue);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(top, BorderLayout.NORTH);
		getContentPane().add(mid, BorderLayout.CENTER);
		getContentPane().add(commentairePanel, BorderLayout.SOUTH);
		
		
		
		pack();
		setVisible(true);
	}
	
	
	public synchronized void actionPerformed(ActionEvent a)
	{
		Requete req = new Requete(titleValue.getText(), metre.isSelected());
		Reponse rep = new Reponse("?", "?", 0, 0);

			Socket lien;
			try
			{
				lien = new Socket("server", 64000);
				ObjectOutputStream q = new ObjectOutputStream(lien.getOutputStream());
				q.writeObject(req);
				q.flush();
				
				ObjectInputStream qq = new ObjectInputStream(lien.getInputStream());
				rep = (Reponse)qq.readObject();
				q.close();
				qq.close();
				lien.close();
			}
			catch (Exception e){}


	}
	
	
}

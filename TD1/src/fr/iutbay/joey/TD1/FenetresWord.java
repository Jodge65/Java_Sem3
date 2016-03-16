package fr.iutbay.joey.TD1;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FenetresWord extends JFrame
{
	private static final long serialVersionUID = 1L;

	public static JTextArea text;
	public static JTextField motCle, balise;
	public static JComboBox<String> listeDeroulante;
	public static JScrollPane textScrollBar;
	
	public static List<String> mapKey;
	
	public FenetresWord()
	{
		super("Word");
		addWindowListener(new ActionClose());
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		text = new JTextArea();
		motCle = new JTextField(15);
		balise = new JTextField(15);
		
		loadLog();
		//for(String i : mapKey)
		//	listeDeroulante.add(i);
		
		textScrollBar = new JScrollPane(text, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		textScrollBar.setPreferredSize(new Dimension(300, 400));
		
		JMenuBar menu = new JMenuBar();
		JMenu menuFichier = new JMenu("Fichier");
		menu.add(menuFichier);
		JMenuItem menuItemOuvrir = new JMenuItem("Ouvrir");
		menuFichier.add(menuItemOuvrir);
		JMenuItem menuItemSauvegarder = new JMenuItem("Sauvegarder");
		menuFichier.add(menuItemSauvegarder);
		
		

		/*// BORDER LAYOUT
		BorderLayout decoupage = new BorderLayout();
		getContentPane().setLayout(decoupage);
		

		getContentPane().add(textScrollBar, BorderLayout.CENTER);

		JPanel menuBottom = new JPanel();
		menuBottom.setLayout(new GridLayout(2, 1, 2, 2));
		
		JSplitPane divise = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, motCle, balise);
		menuBottom.add(divise);
		menuBottom.add(listeDeroulante);
		
		getContentPane().add(menuBottom, BorderLayout.SOUTH);
		*/

		// GridBagLayout
		GridBagLayout placement = new GridBagLayout();
		getContentPane().setLayout(placement);
		GridBagConstraints rule = new GridBagConstraints();
		rule.gridx = 0; rule.gridy = 0;
		rule.gridwidth = 2; rule.gridheight = 1;
		rule.weightx = 100; rule.weighty = 100;
		rule.fill = GridBagConstraints.BOTH;
		rule.insets = new Insets(1, 1, 1, 1);
		rule.ipadx = 2; rule.ipady = 2;
		placement.setConstraints(textScrollBar, rule);
		getContentPane().add(textScrollBar);

		rule.gridx = 0; rule.gridy = 1;
		rule.gridwidth = 1; rule.gridheight = 1;
		rule.weightx = 50; rule.weighty = 0;
		placement.setConstraints(motCle, rule);
		getContentPane().add(motCle);
	
		rule.gridx = 1; rule.gridy = 1;
		placement.setConstraints(balise, rule);
		getContentPane().add(balise);
		
		rule.gridx = 0; rule.gridy = 2;
		rule.gridwidth = 2; rule.gridheight = 1;
		placement.setConstraints(listeDeroulante, rule);
		getContentPane().add(listeDeroulante);	

		
		motCle.addActionListener(new ActionEntre());
		balise.addActionListener(new ActionEntre());
		listeDeroulante.addActionListener(new ActionList());
		
		pack();
		setVisible(true);
	}
	
	public boolean addKey(String key, String value)
	{
		if(key == null || value == null)
			return false;
		/*if(mapKey.containsValue(value) || mapKey.containsKey(key))
			return false;*/
		
		mapKey.add(value);
		System.out.println("### List : " + mapKey);
		return true;
	}
	
	public String getValue(int key)
	{
		return mapKey.get(key);
	}	
	
	public void saveLog(String nom)
	{
		System.out.println("[INFORMATION] Debut de la sauvegarde.");

		boolean succes = true;
		File file = new File(nom);
		ObjectOutputStream flotEcriture = null;
		if(file.exists())
			file.delete();
		
		try
		{
			file.createNewFile();
		}
		catch (IOException e)
		{
			succes = false;
			System.out.println("[ERREUR] création impossible du fichis " + nom + ".");
		}
		if(succes)
		{
			try
			{
				 flotEcriture = new ObjectOutputStream(new FileOutputStream(file));
			}
			catch (IOException e)
			{
				succes = false;
				System.out.println("[ERREUR] Impossible d'ouvrir " + nom + " en lecture / écriture.");
			}
			if(succes)
			{
				try
				{
					flotEcriture.writeObject(mapKey);
					flotEcriture.writeObject(listeDeroulante);
				}
				catch (IOException e)
				{
					succes = false;
					System.out.println("[ERREUR] Impossible d'écrire dans le fichier " + nom + ".");
				}
				
				if( flotEcriture != null)
				{
					try
					{
						flotEcriture.flush();
						flotEcriture.close();
					}
					catch (IOException e)
					{
						succes = false;
						System.out.println("[ERREUR] Impossible de fermer le fichier " + nom + ". La sauvegarde a peu être réussis.");
					}
				}
			}
		}

	}
	
	@SuppressWarnings("unchecked")
	public void loadLog()
	{
		try
		{
			ObjectInputStream flotLecture = new ObjectInputStream(new FileInputStream(new File("historique.log")));
			try
			{
				mapKey = (List<String>) flotLecture.readObject();
				listeDeroulante = (JComboBox<String>) flotLecture.readObject();
			}
			catch (ClassNotFoundException e)
			{
				mapKey = new ArrayList<String>();
				listeDeroulante = new JComboBox<String>();
			}

		}
		catch (IOException e)
		{
			listeDeroulante = new JComboBox<String>();
			mapKey = new ArrayList<String>();
		}
	}
	
	public File choisirFichier()
	{
		JFileChooser choix = new JFileChooser(".");
		choix.setFileFilter(new FileNameExtensionFilter("Fichier .txt", "txt"));
		return (choix.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)? choix.getSelectedFile() : null;
	}
	
	private class ActionSave implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			File file = choisirFichier();
			try
			{
				PrintWriter sortie = new PrintWriter(new FileOutputStream(file));
				sortie.print(text.getText());
			}
			catch (IOException er)
			{
				
			}
		}
	}
	
	private class ActionLoad implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			try
			{
				String line;
				ObjectInputStream flotLecture = new ObjectInputStream(new FileInputStream(choisirFichier()));
				while((line = flotLecture.readLine()) != null) 
				{
					text.setText(text.getText() + line);
				}
			}
			catch (FileNotFoundException er)
			{
				
			}
			catch (IOException er)
			{

			}
			
			
		}
	}
	
	private class ActionEntre implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			if(addKey(motCle.getText(), balise.getText()))
			{
				listeDeroulante.addItem(motCle.getText());
				motCle.setText("");
				balise.setText("");
			}
		}
	}
	
	private class ActionList implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			String temps = getValue(listeDeroulante.getSelectedIndex());
			text.insert(temps, text.getCaretPosition());
		}
	}

	private class ActionClose extends WindowAdapter
	{
		//@Override
		public synchronized void windowClosing()
		{
			saveLog("historique.log");
		}
	}
}
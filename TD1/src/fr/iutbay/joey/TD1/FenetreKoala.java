package fr.iutbay.joey.TD1;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FenetreKoala extends JFrame
{

	/**	*/
	private static final long serialVersionUID = 1L;
	/** Image de fond */
	public JLabel fond = null;
	
	public FenetreKoala (String name)
	{
		super(name);
		FlowLayout placeur = new FlowLayout(FlowLayout.CENTER, 2, 2);
		getContentPane().setLayout(placeur);
		
		fond = new JLabel(new ImageIcon(name));
		getContentPane().add(fond);
		
		pack();
		setVisible(true);
	}
}

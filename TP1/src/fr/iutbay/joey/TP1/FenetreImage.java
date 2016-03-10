package fr.iutbay.joey.TP1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FenetreImage extends JFrame
{

	/**	*/
	private static final long serialVersionUID = 1L;
	/** Image de fond */
	public JLabel fond = null;
	
	public FenetreImage (String name)
	{
		super("Fenêtres Image");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayout placeur = new FlowLayout(FlowLayout.CENTER, 2, 2);
		getContentPane().setLayout(placeur);
		
		fond = new JLabel(new ImageIcon(name));
		getContentPane().add(fond);
		fond.setPreferredSize(new Dimension(400, 400));

		pack();
		setVisible(true);
	}
	
	public FenetreImage setImage(String name)
	{
		fond.setIcon(new ImageIcon(name));
		return this;
	}


}

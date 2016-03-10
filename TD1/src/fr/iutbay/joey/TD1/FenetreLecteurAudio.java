package fr.iutbay.joey.TD1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class FenetreLecteurAudio extends JFrame
{
	/** */
	private static final long serialVersionUID = 1L;

	public JButton play, pause, stop;
	public JLabel title;
	public JProgressBar avance;
	
	public FenetreLecteurAudio()
	{
		super("Lecteur Audio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout decoupage = new GridLayout(3, 1, 2, 2);
		getContentPane().setLayout(decoupage);

		title = new JLabel("Lecteur Audio");
		title.setFont(new Font("Serif", Font.BOLD,18));
		title.setHorizontalAlignment(JLabel.CENTER);
		getContentPane().add(title);
		
		JPanel centre = new JPanel();
		getContentPane().add(centre);
		//centre.setLayout(new GridLayout(1, 3, 2, 2));
		centre.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
		
		play = new JButton(new ImageIcon("img/Play.png"));
		centre.add(play);
		pause = new JButton(new ImageIcon("img/Pause.png"));
		centre.add(pause);
		stop = new JButton(new ImageIcon("img/Stop.png"));
		centre.add(stop);

		avance = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		avance.setValue(30);
		getContentPane().add(avance);

		pack();
		setVisible(true);
	}
}

package fr.iutbay.joey.TD1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class FenetreMDP extends JFrame
{
	private static final long serialVersionUID = 1L;

	public JLabel title;
	public JTextField mdp;
	public JProgressBar avance;
	public Thread avanceGestion;
	public final int DURATION = 10;
	
	public FenetreMDP()
	{
		super("Log-in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mdp = new JTextField(15);

		title = new JLabel("Taper le mdp");
		avance = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		avanceGestion = new GestionTimer(DURATION, this.avance, this);
		getContentPane().setLayout(new GridLayout(3,1,1,1));
		getContentPane().add(title);
		getContentPane().add(mdp);
		getContentPane().add(avance);

		mdp.addActionListener(new ActionValideMDP());

		pack();
		setVisible(true);
		avanceGestion.run();

	}
	
	private class ActionValideMDP implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{

			if(mdp.getText().equalsIgnoreCase("azerty"))
			{
				setVisible(false); //you can't see me!
				dispose();
				new FenetresWord();
			}
			else
			{
				mdp.setText("");
			}
		}
	}
	
}

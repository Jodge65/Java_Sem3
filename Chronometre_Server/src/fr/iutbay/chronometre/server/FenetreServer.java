package fr.iutbay.chronometre.server;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FenetreServer extends JFrame
{
	private static final long serialVersionUID = 1L;
	public static JTextField time;
	public static JButton start, stop, capture;
	public static MainClient client;
	
	public FenetreServer() {
		getContentPane().setLayout(new GridLayout(0, 2, 2, 0));
		
		start = new JButton("Start");
		getContentPane().add(start);
		
		stop = new JButton("Stop");
		getContentPane().add(stop);
		
		time = new JTextField();
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setText("00:00");
		getContentPane().add(time);
		time.setColumns(10);
		
		capture = new JButton("Capture");
		getContentPane().add(capture);
		
		client = new MainClient();
		client.start();
		
		start.addActionListener(new ClicStart());
		stop.addActionListener(new ClicStop());
		capture.addActionListener(new ClicCapture());
		
		pack();
		setVisible(true);
	}
	
	private class ClicStart implements ActionListener
	{ // now start
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			client.sortie.write(1);
			client.sortie.flush();
		}
	}
	private class ClicStop implements ActionListener
	{ // now start
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			client.sortie.write(2);
			client.sortie.flush();
		}
	}
	private class ClicCapture implements ActionListener
	{ // now start
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			client.sortie.write(3);
			client.sortie.flush();

			try
			{
				time.setText(client.entree.readLine());
			}
			catch (IOException e1)
			{
				System.out.println("[SERVEUR]~ Erreur lors de la récéption de la valeur.");	
			}
			
		}
	}

}

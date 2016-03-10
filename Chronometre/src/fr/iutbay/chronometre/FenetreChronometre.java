package fr.iutbay.chronometre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FenetreChronometre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField nbMinutes, nbSecondes, minuteur;
	private JButton plus, moins, reset, capture;
	private JLabel textMinutes, textSecondes;
	private JComboBox<String> choixMesure;
	protected boolean onSeconde = true;
	protected boolean isOn = false;
	protected Thread t;
	protected int seconde, minutes;
	
	public FenetreChronometre() {
		super("Chronomètre");
		getContentPane().setLayout(new BorderLayout());
	 
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 0, 0, 3));
	  
		plus = new JButton("Start");
		panel.add(plus);
		  
		moins = new JButton("Stop");
		moins.setEnabled(false);
		panel.add(moins);
		  
		reset = new JButton("Reset");
		panel.add(reset);
		  
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 3));
		  
		minuteur = new JTextField();
		minuteur.setHorizontalAlignment(SwingConstants.CENTER);
		minuteur.setFont(new Font("Tahoma", Font.ITALIC, 20));
		minuteur.setText("00:00");
		panel_1.add(minuteur);
		minuteur.setColumns(5);
		  
		capture = new JButton("Capture");
		panel_1.add(capture);
	
		choixMesure = new JComboBox<String>();
		choixMesure.addItem("Min:Sec");
		choixMesure.addItem("Sec:1/100");
		panel_1.add(choixMesure);
		  
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 20));
		
		nbMinutes = new JTextField();
		nbMinutes.setHorizontalAlignment(SwingConstants.CENTER);
		nbMinutes.setEditable(false);
		nbMinutes.setFont(new Font("Tahoma", Font.PLAIN, 36));
		nbMinutes.setForeground(Color.RED);
		nbMinutes.setText("00");
		panel_2.add(nbMinutes);
		nbMinutes.setColumns(2);
		
		textMinutes = new JLabel("Min");
		panel_2.add(textMinutes);
		
		nbSecondes = new JTextField();
		nbSecondes.setHorizontalAlignment(SwingConstants.CENTER);
		nbSecondes.setEditable(false);
		nbSecondes.setFont(new Font("Tahoma", Font.PLAIN, 36));
		nbSecondes.setForeground(Color.RED);
		nbSecondes.setText("00");
		panel_2.add(nbSecondes);
		nbSecondes.setColumns(2);
		
		textSecondes = new JLabel("Sec");
		panel_2.add(textSecondes);
		  
		onSeconde = true;
		
		plus.addActionListener(new ClicPlus());
		moins.addActionListener(new ClicMoins());
		capture.addActionListener(new ClicCapture());
		reset.addActionListener(new ClicReset());
		choixMesure.addActionListener(new ClicChoixMesure());
		
		seconde = 0;
		minutes = 0;
		pack();
		setVisible(true);
	}
	
	private class ClicChoixMesure implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			if(isOn)
			{
				isOn = false;
				plus.setEnabled(false);
				moins.setEnabled(true);	
			}
			if(choixMesure.getSelectedIndex()==0)
			{
				onSeconde = true;
				textMinutes.setText("min");
				textSecondes.setText("sec");
			}
			else
			{
				onSeconde = false;
				textMinutes.setText("sec");
				textSecondes.setText("1/100");				
			}
				
			nbMinutes.setText("00");
			nbSecondes.setText("00");
		}
	}
	
	public class TimerThread extends Thread
	{
	
		@Override
		public void run()
		{
			int rule = 10 * (onSeconde?100:1);

			try{Thread.sleep(rule);}
			catch (InterruptedException e){}


			while(isOn)
			{
				addTime();
				try{Thread.sleep(rule);}
				catch (InterruptedException e){}
				
			}
		}
	}
	

	public void addTime()
	{
		 int rule = (onSeconde?60:100);
		 seconde ++;
		 if (seconde == rule)
		 {
			 seconde = 0;
			 minutes++;
			 if (minutes == rule)
				 minutes = 0;
			 nbMinutes.setText(getValueOf(minutes));
		 }
		 nbSecondes.setText(getValueOf(seconde));
	}
	
	public void subTime()
	{
		 int rule = (onSeconde?59:99);
		 seconde--;
		 if (seconde < 0)
		 {
			 seconde = rule;
			 minutes--;
			 if (minutes < 0)
				 minutes = rule;
			 nbMinutes.setText(getValueOf(minutes));
		 }
		 nbSecondes.setText(getValueOf(seconde));
	}
	
	private class ClicPlus implements ActionListener
	{ // now start
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			if(!isOn)
			{
				isOn = true;
				Thread t = new TimerThread();
				t.start();
				plus.setEnabled(false);
				choixMesure.setEnabled(false);
				moins.setEnabled(true);
			}
		}
	}
	
	private class ClicMoins implements ActionListener
	{ // now stop
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			if(isOn)
			{
				isOn = false;
				plus.setEnabled(true);
				choixMesure.setEnabled(true);
				moins.setEnabled(false);
				t.stop();
			}
		}
	}

	private class ClicCapture implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			minuteur.setText(nbMinutes.getText() + ":" + nbSecondes.getText());
		}
	}
	
	private class ClicReset implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			seconde = 0;
			minutes = 0;
			minuteur.setText("00:00");
			nbMinutes.setText("00");
			nbSecondes.setText("00");
		}
	}
	
	public String getValueOf(int value)
	{
		String temps ="";
		if(value < 10)
			temps+="0";
		temps+=String.valueOf(value);
		return temps;
	}
	
}
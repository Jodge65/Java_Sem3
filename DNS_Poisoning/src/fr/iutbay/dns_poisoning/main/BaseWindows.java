package fr.iutbay.dns_poisoning.main;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;

import fr.iutbay.dns_poisoning.dns.DNS;
import fr.iutbay.dns_poisoning.hacker.FunctionHacker;
import fr.iutbay.dns_poisoning.hacker.JColorTextPane;

public class BaseWindows extends JFrame implements ComponentListener
{
	private static final long serialVersionUID = 1L;
	public static JColorTextPane hackerScreen;
	public static JPanel leftPanel, mapMonde, rightPanel;
	public static JLabel horloge, victimScreen, imageMap;
	public static JScrollPane hackerScrollBar;
	public static JComboBox<String> siteChooser;
	private static JPanel victimPanel;
	private static JPanel hackerPanel;
	private static JTextField hackerWriter;
	public static int WIDTH = 640/2;
	public static int HEIGHT = 347/2;
	public static List<String> oldCommand;
	public static int indexList;
	public static TimerThread timer;
	
	public BaseWindows()
	{
		super("DNS Poisonning");
		
		createWindow();
		setVisible(true);
		oldCommand = new ArrayList<String>();
		indexList = 0;
		timer = new TimerThread(horloge, 10);
		timer.run();
	}
	
	public void createWindow()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		leftPanel = new JPanel();
		getContentPane().add(leftPanel);
		leftPanel.setLayout(new BorderLayout(0, 0));
		
		mapMonde = new JPanel();
		mapMonde.setPreferredSize(new Dimension(WIDTH, HEIGHT*2 + 20));
		leftPanel.add(mapMonde, BorderLayout.CENTER);
		
		imageMap = new JLabel("");
		imageMap.setHorizontalAlignment(SwingConstants.CENTER);
		imageMap.setIcon(new StretchIcon(this.getClass().getResource("img/mapMonde.png")));
		imageMap.setPreferredSize(new Dimension(WIDTH, HEIGHT*2));
		leftPanel.add(imageMap, BorderLayout.CENTER);
		
		horloge = new JLabel("Jeudi 9 F\u00E9vrier 2016");
		horloge.setVerticalAlignment(SwingConstants.BOTTOM);
		leftPanel.add(horloge, BorderLayout.SOUTH);
		
		rightPanel = new JPanel();
		getContentPane().add(rightPanel);
		rightPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		hackerScreen = new JColorTextPane();
		hackerScreen.setEditable(false);
		hackerScreen.styleDoc();

		hackerScreen.setForeground(Color.WHITE);
		hackerScreen.setBackground(Color.BLACK);
		writeOnScreen("Bienvenu sur HackOs.\n", false, Color.CYAN);
		writeOnScreen("Taper \"help\" pour plus de renseignement ou \"tutorial\" pour une description de la procédure\n");
				
		
		victimPanel = new JPanel();
		rightPanel.add(victimPanel);
		victimPanel.setLayout(new BorderLayout(0, 0));
		
		siteChooser = new JComboBox<String>();
		victimPanel.add(siteChooser, BorderLayout.NORTH);
		
		victimScreen = new JLabel("");
		victimPanel.add(victimScreen);
		victimScreen.setIcon(new StretchIcon(this.getClass().getResource("img/www.google.fr.png")));
		victimScreen.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		hackerPanel = new JPanel();
		rightPanel.add(hackerPanel);
		hackerPanel.setLayout(new BorderLayout(0, 0));
		
		hackerScrollBar = new JScrollPane(hackerScreen, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		hackerPanel.add(hackerScrollBar);
		hackerScrollBar.setPreferredSize(new Dimension(WIDTH, HEIGHT));
				
		hackerWriter = new JTextField();
		hackerWriter.setForeground(Color.WHITE);
		hackerWriter.setBackground(Color.BLACK);
		hackerPanel.add(hackerWriter, BorderLayout.SOUTH);
		hackerWriter.setColumns(10);

		siteChooser.addItem("www.google.fr");
		siteChooser.addItem("www.facebook.com");
		siteChooser.addItem("www.youtube.fr");
		siteChooser.addItem("www.wikipedia.org");

		hackerWriter.addKeyListener(new KeyHackerValidate());
		hackerWriter.addActionListener(new ActionHackerValidate());
		siteChooser.addActionListener(new ActionSiteChoose());
		
		
		this.addComponentListener(this);
		pack();
	}
	public static void writeOnScreen(String line)
	{
		writeOnScreen(line, false);
	}
	public static void writeOnScreen(String line, boolean isUser)
	{
		writeOnScreen(line, isUser, Color.WHITE);
	}
	public static void writeOnScreen(String line, boolean isUser, Color c)
	{
		if(isUser)
			hackerScreen.appendDoc("@user> ", Color.LIGHT_GRAY);
		hackerScreen.appendDoc(line, c);
	}

	private class KeyHackerValidate implements KeyListener
	{

		@Override
		public void keyPressed(KeyEvent arg0)
		{
			boolean somethinkToDo = false;
			int key = arg0.getKeyCode();
			switch (key)
			{
				case 38: // haut
					indexList--;
					somethinkToDo = true;
					break;
				case 40: // bas
					indexList++;
					somethinkToDo = true;
					break;
			}
			
			if(somethinkToDo)
			{
				if(!oldCommand.isEmpty())
				{
					if(indexList < 0)
						indexList = 0;
					else if (indexList > oldCommand.size()-1)
						indexList = oldCommand.size()-1;

					hackerWriter.setText(oldCommand.get(indexList));
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0)
		{
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ActionHackerValidate implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			String line = hackerWriter.getText();
			hackerWriter.setText("");
			oldCommand.add(line);
			indexList = oldCommand.size();
			writeOnScreen(line + "\n", true);
			FunctionHacker.performCommand(line);
		}
	}
	
	private class ActionSiteChoose implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			String url = (String) siteChooser.getSelectedItem();
			String temps = DNS.myDNS.requestIP(url);
			try
			{
				victimScreen.setIcon(new StretchIcon(this.getClass().getResource("img/" + temps + ".png")));
			}
			catch(Exception erreur)
			{
				victimScreen.setIcon(new StretchIcon(this.getClass().getResource("img/404.png")));
			}
		}
	}

	@Override
	public void componentHidden(ComponentEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent e)
	{
		// TODO Auto-generated method stub
		WIDTH = this.getWidth() / 2 - 15;
		HEIGHT = this.getHeight() / 2 - 49;

		mapMonde.setPreferredSize(new Dimension(WIDTH, HEIGHT*2 + 20));
		imageMap.setPreferredSize(new Dimension(WIDTH, HEIGHT*2));
		victimScreen.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		hackerScrollBar.setPreferredSize(new Dimension(WIDTH, HEIGHT));

		mapMonde.revalidate();
		victimScreen.revalidate();
		imageMap.revalidate();
		hackerScrollBar.revalidate();

		mapMonde.repaint();
		victimScreen.repaint();
		imageMap.repaint();
		hackerScrollBar.repaint();



		this.revalidate();
		this.repaint();
	}

	@Override
	public void componentShown(ComponentEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}

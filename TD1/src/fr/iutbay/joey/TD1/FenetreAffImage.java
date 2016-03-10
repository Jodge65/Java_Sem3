package fr.iutbay.joey.TD1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetreAffImage extends JFrame
{
	private static final long serialVersionUID = 1L;

	public JButton prev, next;
	public JTextField url;
	public JLabel img = null;
	public List<ImageIcon> listImage;
	protected int imgCourrant = 0;
	
	public FenetreAffImage()
	{
		super("Affiche Image");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		listImage = new ArrayList<ImageIcon>();
		prev = new JButton("Précédent");
		next = new JButton("Suivant");
		url = new JTextField(50);
		img = new JLabel();
		img.setPreferredSize(new Dimension(400, 400));
		BorderLayout decoupage = new BorderLayout();
		JPanel menuBottom = new JPanel();
		menuBottom.setLayout(new GridLayout(1, 2, 2, 2));
		menuBottom.add(prev);
		menuBottom.add(next);
		getContentPane().setLayout(decoupage);
		getContentPane().add(url, BorderLayout.NORTH);
		getContentPane().add(img, BorderLayout.CENTER);
		getContentPane().add(menuBottom, BorderLayout.SOUTH);
		
		url.addActionListener(new lireURL());
		next.addActionListener(new nextImg());
		prev.addActionListener(new prevImg());
		Properties env = System.getProperties();
			env.put("proxyHost", "cache");
			env.put("proxyPort", "3128");
			env.put("proxySet", "true");
		
		pack();
		setVisible(true);
	}
	
	protected void rafraichirImg()
	{
		if(imgCourrant > 0)
			img.setIcon(listImage.get(imgCourrant));
	}
	
	public List<ImageIcon> getListUrlImage(String stringUrl)
	{
		List<ImageIcon> listOfUrl = new ArrayList<ImageIcon>();
		URL link;
		try 
		{ 
			link = new URL(stringUrl);
		}
		catch(MalformedURLException e) 
		{ 
			System.out.print("[WARNING] L'url \"" + stringUrl + "\" semble incorrecte...");
			link = null; 
			url.setText(""); 
			return listOfUrl;
		}

		
		BufferedReader line;
		try
		{
			line = new BufferedReader(new InputStreamReader(link.openStream()));
		}
		catch (IOException e)
		{
			System.out.print("[DANGER] Impossible d'ouvrir un buffer en lecture...");
			line = null; 
			url.setText("");
			return listOfUrl;
		}
		
		try
		{
			String interneLine;
			while((interneLine = line.readLine()) != null)
			{
				System.out.print(interneLine);
				int curseur = 0;
				int debut;
				while((debut = interneLine.indexOf("img scr=", curseur)) != -1)
				{
					int debutLien = interneLine.indexOf('"', debut) + 1;
					int finLien = interneLine.indexOf('"', debutLien);
					String lienImg = interneLine.substring(debutLien, finLien);
					curseur = finLien;
					

					if(!lienImg.startsWith("http"))
						lienImg = stringUrl + lienImg;
					try
					{
						URL linkImg = new URL(lienImg);
						listOfUrl.add(new ImageIcon(linkImg));

					}
					catch (MalformedURLException e) 
					{
						System.out.print("[WARNING] L'image \"" + lienImg + "\" semble ne pas exister");
					}
				}
			}
		}
		catch (IOException e)
		{
			System.out.print("[WARNING] Impossible de parcourir le fichier.");
		}
		//System.out.print(listOfUrl);

		return listOfUrl;
	}
	
	private class lireURL implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			listImage = getListUrlImage(url.getText());
			rafraichirImg();
			
		}
	}
	
	private class nextImg implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			if(imgCourrant < listImage.size()-1 ) 
				imgCourrant++;
			rafraichirImg();
		}
	}
	
	private class prevImg implements ActionListener
	{
		@Override
		public synchronized void actionPerformed(ActionEvent e)
		{
			if(imgCourrant > 0 ) 
				imgCourrant--;
			rafraichirImg();
		}
	}
}

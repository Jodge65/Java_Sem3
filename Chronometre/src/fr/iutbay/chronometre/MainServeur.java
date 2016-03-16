package fr.iutbay.chronometre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServeur extends Thread
{
	public ServerSocket socketServeur;
	public BufferedReader entree;
	public PrintStream sortie;
	public int port = 2001;
	
	MainServeur()
	{	
		boolean isConnect = false;
		while(!isConnect)
		try
		{
			socketServeur = new ServerSocket(port);
			//socketServeur.setSoTimeout(5000);
			isConnect = true;
			System.out.println("[SERVEUR]~ Connection à la socket de serveur sur le port  " + port);

		}
		catch (IOException e)
		{
			System.out.println("[SERVEUR]~ Impossible d'initialisé la socket de serveur sur le port  " + port);
			port++;
		}		
	}

	public void run ()
	{
		boolean work = true;
		while(work)
		{
			Socket client = null;
			if(entree == null)
			{
				try
				{
					client = socketServeur.accept();
					entree = new BufferedReader(new InputStreamReader(client.getInputStream()));
					sortie = new PrintStream(client.getOutputStream());

				}
				catch (IOException e1){}
			}
			else
			{
				try
				{
					switch(entree.read())
					{
						case 1: // start
							FenetreChronometre.plus.doClick();
							break;
						case 2: // stop
							FenetreChronometre.moins.doClick();
							break;
						case 3: // capture
							String chaine = FenetreChronometre.textMinutes.getText() + ":" + FenetreChronometre.textSecondes.getText();
							sortie.write(chaine.getBytes());
							sortie.flush();
							break;
						default:
					}

				}
				catch (IOException e){}		
			}	
		}
		
	    try
		{
			socketServeur.close();
		    entree.close();
		    sortie.close();
		}
		catch (IOException e){}
	}

	
}

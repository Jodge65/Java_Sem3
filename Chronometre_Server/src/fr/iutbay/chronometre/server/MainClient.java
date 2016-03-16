package fr.iutbay.chronometre.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MainClient  extends Thread
{
	public static Socket client;
	public BufferedReader entree;
	public PrintStream sortie;
	public int port = 2002;

	public MainClient()
	{
		boolean isConnect = false;
		while(!isConnect)
		try
		{
			client = new Socket ("127.0.0.1", port);
			sortie = new PrintStream(client.getOutputStream());
			entree = new BufferedReader(new InputStreamReader(client.getInputStream()));

			isConnect = true;
		}
		catch (Exception e)
		{
			System.out.println("[CLIENT]~ Impossible d'initialisé la socket de serveur sur le port  " + port);
		}

	}
	
	public void run()
	{
		while(true)
		{

		}
		//sortie.close();

	}
}

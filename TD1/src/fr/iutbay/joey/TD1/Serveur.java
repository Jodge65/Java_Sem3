package fr.iutbay.joey.TD1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		new Serveur();

		//new FenetreMDP();
		//new FenetreKoala("img/test.png");
		//new FenetreLecteurAudio();
		//new FenetreElephant();
		//new FenetresWord();
		//new FenetreAffImage();
		new FenetreAeroport();
	}
	
	public Serveur()
	{
		try
		{
			ServerSocket serv = new ServerSocket(64000);
			while(true)
			{
				try
				{
					Socket lien = serv.accept();
					ObjectInputStream line = new ObjectInputStream(lien.getInputStream());
					Requete req = (Requete)line.readObject();
					Reponse rep = traiterDemande(req);
					ObjectOutputStream env = new ObjectOutputStream(lien.getOutputStream());
					env.writeObject(rep);
					env.flush();
					env.close();
					lien.close();
					line.close();	
				}
				catch(Exception e){}
			}
		}
		catch(Exception e){}
	}
	
	protected Reponse traiterDemande(Requete req)
	{
		Reponse rep = new Reponse(null, null, 0, 0);
		
		return rep;
	}
	
}

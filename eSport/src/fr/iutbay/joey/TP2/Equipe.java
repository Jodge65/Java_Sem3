package fr.iutbay.joey.TP2;

/**
 * 
 * @author Joey
 * 
 */
public class Equipe
{
	protected String name;
	protected final static int NB_MAX_JOUEUR = 10;
	protected Joueur[] joueurs = new Joueur[NB_MAX_JOUEUR];
	
	protected int identifiant;
	protected static int nbOcc = 0;


	Equipe(String name)
	{
		identifiant = nbOcc;
		nbOcc++;
		setName(name);
	}

	Equipe(String name, Joueur... player)
	{
		this(name);

		int i = 0;
		for (Joueur j : player)
		{
			joueurs[i] = j;
			i++;
			if (i >= NB_MAX_JOUEUR)
				break;
		}
	}

	// ----- ----- METHODE SET ----- ----- //
	/**
	 * Définis le nom du joueur
	 * 
	 * @param nom String du joueur
	 */
	public Equipe setName(String name)
	{
		if (!name.isEmpty())
		{
			this.name = name;
			return this;
		}
		else
		{
			return null;
		}
	}
	
	public boolean addJoueur(Joueur player)
	{
		boolean isAdd = false;
		
		int pos = 0;
		while (joueurs[pos] != null)
		{
			pos++;
			if(pos >= NB_MAX_JOUEUR)
				break;
		}
			
		if(!(pos >= NB_MAX_JOUEUR))
		{
			joueurs[pos] = player;
			isAdd = true;
		}
			
		return isAdd;
	}
	
	
	public boolean subJoueur(int pos)
	{
		if(pos < NB_MAX_JOUEUR)
		{
			joueurs[pos] = null;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean subJoueur(Joueur j)
	{
		int i = 0;
		do
		{
			if(joueurs[i] != null)
				if(joueurs[i].equals(j))
					break;
			i++;
		}while(i <= NB_MAX_JOUEUR);
		return subJoueur(i);
	}
	
	// ----- ----- METHODE GET ----- ----- //
	public String getName()
	{
		return this.name;
	}

	public int getIdentifiant()
	{
		return this.identifiant;
	}

	// ----- ----- METHODE ALL ----- ----- //

	public String toString()
	{
		String temps = "Nom : " + name + ", Identifiant : " + identifiant + "\nListe des Joueurs : \n";
		for(int i=0; i < NB_MAX_JOUEUR; i++)
			if(joueurs[i] != null)
				temps += (joueurs[i] + "\n");
		return temps; 
	}
	
	public String listOfTitulaire()
	{
		String temps = "Liste des Joueurs Titulaire : \n";
		for(int i=0; i < NB_MAX_JOUEUR; i++)
			if(joueurs[i] != null)
				if(joueurs[i].isTitulaire())
					temps += (joueurs[i] + "\n");
		return temps;
	}
	
	public String listOfRemplacant()
	{
		String temps = "Liste des Joueurs Remplacant : \n";
		for(int i=0; i < NB_MAX_JOUEUR; i++)
			if(joueurs[i] != null)
				if(joueurs[i].isRemplacant())
					temps += (joueurs[i] + "\n");
		return temps;
	}
	
	
}

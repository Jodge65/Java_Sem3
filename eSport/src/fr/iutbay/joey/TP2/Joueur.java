package fr.iutbay.joey.TP2;

/**
 * 
 * @author Joey
 * 
 */
public class Joueur
{
	enum Poste
	{
		mid("Mid"), 
		top("Top"), 
		adc("Adc"), 
		support("Support"), 
		jungler("Jungler");

		private String name;

		Poste(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return name;
		}

		public String toString()
		{
			return getName();
		}
	}

	/** nomdu joueur */
	protected String name;
	/** prenom du joueur */
	protected String subname;
	/** numéro du maillot */
	protected int number;
	/** poste du joueur */
	protected Poste poste;
	/** true si le joueur est titulaire, false sinon */
	protected boolean titulaire;
	/** identifiantdu joueur */
	protected int identifant;
	
	private static int nbOcc = 0;

	/**
	 * Constructeur normal de la classe Joueur
	 * 
	 * @param name String du nom
	 * @param subname String du prenom
	 * @param number Int du numero maillot
	 * @param poste Poste du poste
	 * @param titulaire Boolean. true = tituralire, false = remplacant
	 */
	Joueur(String name, String subname, int number, Poste poste, boolean titulaire)
	{
		identifant = nbOcc;
		nbOcc++;
		setName(name).setSubname(subname).setNumber(number).setPoste(poste).setTitulaire(titulaire);
	}

	// ----- ----- METHODE SET ----- ----- //
	/**
	 * Définis le nom du joueur
	 * 
	 * @param nom String du joueur
	 */
	public Joueur setName(String name)
	{
		if (!name.isEmpty())
		{
			this.name = name;
		}
		return this;
	}

	/**
	 * Définis le prenom du joueur
	 * 
	 * @param prenom String du joueur
	 */
	public Joueur setSubname(String subname)
	{
		this.subname = subname;
		return this;
	}

	/**
	 * Définis le nombre du joueur
	 * 
	 * @param prenom Int du numéro du maillot
	 */
	public Joueur setPoste(Poste poste)
	{
		this.poste = poste;
		return this;
	}

	/**
	 * Définis le nombre du joueur
	 * 
	 * @param prenom Int du numéro du maillot
	 */
	public Joueur setNumber(int number)
	{
		if (number > 0)
		{
			this.number = number;
		}
		return this;

	}

	/**
	 * Définis le joueur comme étant titulaire
	 */
	public Joueur setTitulaire()
	{
		this.titulaire = true;
		return this;
	}

	/**
	 * Définis le joueur comme étant remplacant
	 */
	public Joueur setRemplacant()
	{
		this.titulaire = false;
		return this;
	}

	/**
	 * Définis le joueur comme étant titulaire ou remplacent
	 * 
	 * @param titulaire true = titulaire, false = remplacant;
	 */
	public Joueur setTitulaire(boolean titulaire)
	{
		if (titulaire)
			setTitulaire();
		else
			setRemplacant();
		return this;
	}

	// ----- ----- METHODE GET ----- ----- //
	public String getName()
	{
		return this.name;
	}

	public String getSubname()
	{
		return this.subname;
	}

	public int getNumber()
	{
		return this.number;
	}

	public Poste getPoste()
	{
		return this.poste;
	}

	public boolean isTitulaire()
	{
		return this.titulaire;
	}

	public boolean isRemplacant()
	{
		return !isTitulaire();
	}
	
	public int getIdentifiant()
	{
		return this.identifant;
	}

	// ----- ----- METHODE ALL ----- ----- //

	public String toString()
	{
		return identifant + " : Nom : " + name + ", Prénom : " + subname + ", N° maillot : " + number + ", Poste : " + poste + (titulaire ? ", Titulaire" : ", Remplacant");
	}

}

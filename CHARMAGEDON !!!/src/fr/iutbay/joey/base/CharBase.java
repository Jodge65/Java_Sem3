package fr.iutbay.joey.base;

import java.util.Random;

import fr.iutbay.joey.interfaceTank.CharFunction;

/**
 * 
 * @author Joey
 * 
 */
public class CharBase implements CharFunction
{
	public enum Armes
	{
		canon_Infini("Canon infini", Float.MAX_VALUE),
		canon_10("Simple canon", 10.0F),
		canon_1("Faible canon", 1.0F),
		canon_30("Canon moine", 30.0F),
		canon_100("Canon kamikaze", 100.0F),
		canon_0("Canon neutre", 0.0F),	
		canon_N15("Canon soin", -15.0F),
		canon_N10("Canon soin", -10.0F),
		canon_N30("Canon soin", -30.0F),
		canon_N100("Canon soin", -100.0F),
		canon_15("Canon moyen", 15.0F);
		

		
		String nom;
		float degat;
		Armes(String nom, float degat)
		{
			this.nom = nom;
			this.degat= degat;
		}
		
		public String getNom()
		{
			return nom;
		}
		public float getDegat()
		{
			return degat;
		}
		public static Armes getRandomWeapon()
		{
			Armes weapon = null;
			Random rand = new Random();
			switch(rand.nextInt(10))
			{
				case 0: weapon = canon_10; 		break;
				case 1: weapon = canon_1; 		break;
				case 2: weapon = canon_30;		break;
				case 3: weapon = canon_100;		break;
				case 4: weapon = canon_0;		break;
				case 5: weapon = canon_N15;		break;
				case 6: weapon = canon_15;		break;
				case 7: weapon = canon_10;		break;
				case 8: weapon = canon_30;		break;
				case 9: weapon = canon_100;		break;
			}
			
			return weapon;
		}
	}
	
	/**	Identifiant unique */
	protected int id;
	// --- Obligatoire --- //

	/** Nom du tank */
	protected String nom;
	/** Arme actuel du Tank */
	protected Armes arme;
	/** Carburant actuel du tank */
	protected float carburant;


	
	// --- Optionnel --- //
	/** Carburant max du tank */
	protected float carburantMax;
	/** Description du tank */
	protected String description;
	/** Initiative du tank. Plus cette valeurs est grande, plus le tank sera prio.*/
	protected float initiative;
	/** true si le tank est encore en vie, false sinon.*/
	protected boolean isAlive;
	
	// --- Malus --- //
	/** Si > 0 alors chaque tour, la cible subit des dégats.*/
	public int nbTourOnFire;
	
	// --- Static --- //
	/** Permet de définir un ID automatiquement.*/
	private static int identifiant = 0;
	
	/**
	 * Constructeur
	 */
	public CharBase()
	{
		id = identifiant;
		identifiant++;
		arme = Armes.canon_10;
		carburant = 100.0F;
		carburantMax = carburant;
		nom = "Char Basique";
		description = "Char d'assaut basique.";
		initiative = 50.0F;
		isAlive = true;
		
		nbTourOnFire = 0;
	}
	
// --- SET --- //	
	/**
	 * @param value (Armes) Armes par défaut du char (définis sa puissance d'attaque)
	 * @return (CharBase) retourne lui même
	 */
	public CharBase setArme(Armes value)
	{
		arme = value;
		return this;
	}
	
	/**
	 * Ne peut pas être supérieur a carburantMax
	 * @param value (float) carburant par défaut du char (définis sa vie)
	 * @return (CharBase) retourne lui même
	 */
	public CharBase setCarburant(float value)
	{
		if (value > carburantMax)
			value = carburantMax;
		
		carburant = value;
		return this;
	}
	
	/**
	 * @param value (float) carburant max du char (définis sa vie max en cas de soin)
	 * @return (CharBase) retourne lui même
	 */
	public CharBase setCarburantMax(float value)
	{
		carburantMax = value;
		return this;
	}
	
	/**
	 * @param value (String) nom par défaut du char (définis son nom)
	 * @return (CharBase) retourne lui même
	 */
	public CharBase setNom(String value)
	{
		nom = value;
		return this;
	}
	
	/**
	 * @param value (String) Description par défaut du char (décrit ses effets)
	 * @return (CharBase) retourne lui même
	 */
	public CharBase setDescription(String value)
	{
		description = value;
		return this;
	}
	
	/**
	 * @param value (Float) Initiative par défaut (plus la valeur est faible, plus l'attaque sera prioritaire, mais la séléction comme cible aussi)
	 * @return (CharBase) retourne lui même
	 */
	public CharBase setInitiative(float value)
	{
		initiative = value;
		return this;
	}
	
// --- GET --- //	
	public int getID()
	{
		return id;
	}
	public Armes getArme()
	{
		return arme;
	}
	public float getCarburant()
	{
		return carburant;
	}
	public float getCarburantMax()
	{
		return carburantMax;
	}
	public String getNom()
	{
		return nom;
	}
	public String getDescription()
	{
		return description;
	}
	public float getInitiative()
	{
		return initiative;
	}

// --- ALL --- //
	@Override
	public float attaquer(CharBase cible)
	{
		float dommage = FightFunction.calculerDamage(this, cible);
		cible.etreToucher(dommage);
		return dommage;
	}

	@Override
	public boolean etreToucher(float value)
	{
		if(value != 0)
		{
			carburant -= value;
			if(carburant <= 0)
				setDead();
			else if (carburant > carburantMax)
				carburant = carburantMax;
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void setDead()
	{
		isAlive = false;
	}
	
	@Override
	public boolean isDead()
	{
		return !isAlive;
	}
	
	@Override
	public String toString()
	{
		return "CharBase [id=" + id + ", nom=" + nom + ", arme=" + arme + ", carburant=" + carburant + ", carburantMax=" + carburantMax + ", description=" + description + ", initiative=" + initiative + ", isAlive=" + isAlive + ", nbTourOnFire=" + nbTourOnFire + "]";
	}

	@Override
	public void onUpdate(ChampDeBatail a, ChampDeBatail b)
	{
		if(this.isAlive)
		{
			if(nbTourOnFire > 0)
			{
				int x = (int) (carburant / 10);
				carburant -= x;
				nbTourOnFire --;
				System.out.println(this.nom + " est brulé : " + (-x));
			}
		}
	}
	
}

package fr.iutbay.joey.base;

import java.util.List;

import fr.iutbay.joey.TP3.CharAgile;
import fr.iutbay.joey.TP3.CharBouclier;
import fr.iutbay.joey.TP3.GrosChar;
import fr.iutbay.joey.TankNoob.SparaChar;
import fr.iutbay.joey.tankMMO.CharDK;
import fr.iutbay.joey.tankMMO.CharKamikaze;
import fr.iutbay.joey.tankMMO.CharMoine;
import fr.iutbay.joey.tankMMO.CharWabbajack;
import fr.iutbay.joey.tankNorris.charckNorris;
import fr.iutbay.joey.tankPokemon.Charmander;
import fr.iutbay.joey.tankYouTube.charIsme;

/**
 * 
 * @author Joey
 *
 */
public class Main
{
	public static void main (String [] args)
	{


		
		ChampDeBatail a = new ChampDeBatail(new CharBase(), new CharAgile(), new SparaChar(), new CharBouclier(), new CharWabbajack(), new charIsme(), new CharKamikaze(), new CharMoine(), new Charmander(), new GrosChar(), new CharDK(), new CharBase(), new CharAgile(), new SparaChar(), new CharBouclier(), new CharWabbajack(), new charIsme(), new CharKamikaze(), new CharMoine(), new Charmander(), new GrosChar(), new CharDK(), new CharBase(), new CharAgile(), new SparaChar(), new CharBouclier(), new CharWabbajack(), new charIsme(), new CharKamikaze(), new CharMoine(), new Charmander(), new GrosChar(), new CharDK(), new CharBase(), new CharAgile(), new SparaChar(), new CharBouclier(), new CharWabbajack(), new charIsme(), new CharKamikaze(), new CharMoine(), new Charmander(), new GrosChar(), new CharDK());
		ChampDeBatail b = new ChampDeBatail(new CharBase(), new CharAgile(), new SparaChar(), new CharBouclier(), new CharWabbajack(), new charIsme(), new CharKamikaze(), new CharMoine(), new Charmander(), new GrosChar(), new CharDK(), new CharBase(), new CharAgile(), new SparaChar(), new CharBouclier(), new CharWabbajack(), new charIsme(), new CharKamikaze(), new CharMoine(), new Charmander(), new GrosChar(), new CharDK(), new CharBase(), new CharAgile(), new SparaChar(), new CharBouclier(), new CharWabbajack(), new charIsme(), new CharKamikaze(), new CharMoine(), new Charmander(), new GrosChar(), new CharDK(), new CharBase(), new CharAgile(), new SparaChar(), new CharBouclier(), new CharWabbajack(), new charIsme(), new CharKamikaze(), new CharMoine(), new Charmander(), new GrosChar(), new CharDK());
		
		//ChampDeBatail a = new ChampDeBatail(test1);
		//ChampDeBatail b = new ChampDeBatail(test4);
		
		List<CharBase> tankA = a.tank;
		List<CharBase> tankB = b.tank;
		
		int NB_TANK_A = tankA.size();
		int NB_TANK_B = tankB.size();
		
		
		boolean combatIsOver = ((NB_TANK_A == 0) || (NB_TANK_B == 0)); // si A ou B est vide alors true
		
		System.out.println("---------- EQUIPE ----------");

		for(int i = 0; i < NB_TANK_A; i++)
		{
			System.out.println("EQUIPE BLEU : " + tankA.get(i));
		}
		for(int i = 0; i < NB_TANK_B; i++)
		{
			System.out.println("EQUIPE ROUGE : " + tankB.get(i));
		}
		System.out.println("---------- LET'S FIGHT ! ----------");

		int tour = 0;
		
		while(!combatIsOver)
		{

			int x = 0;
			int y = 0;
			
			tour++;
			
			do
			{		
				CharBase attaquant;
				CharBase cible;
				List<CharBase> listCible;
				int z;
				
				if(x < NB_TANK_A)
				{ // Séléction du prochain char encore en vie
					while(x < NB_TANK_B && tankA.get(x).isDead())
					{
						x++;
					}
				}
		
				if(y < NB_TANK_B)
				{ // idem pour l'autre équipe
					while(y < NB_TANK_B && tankB.get(y).isDead())
					{
						y++;
					}
				}

				if(x < NB_TANK_A || y < NB_TANK_B)
				{ // si les deux équipes on encore des joueurs
					float iniA = x >= NB_TANK_A ? Float.MAX_VALUE : tankA.get(x).getInitiative(); // si tout le monde à déjà attaqué dans une équipe, alors on met l'initiative
					float iniB = y >= NB_TANK_B ? Float.MAX_VALUE : tankB.get(y).getInitiative(); // de telle sorte qu'il n'attaque plus jusqu'a la fin du tour (Float.MAX_VALUE)

					// Séléction de l'attaquant
					if(iniA < iniB)
					{ // si A attaque avant
						attaquant = tankA.get(x);
						listCible = tankB;
						x++;
					}
					else
					{ // si B attaque avant
						attaquant = tankB.get(y);
						listCible = tankA;
						y++;
					}
					
					// Séléction de la cible
					z = 0;
					cible = null;

					while(z < listCible.size())
					{ // on cherche la premier cible encore en vie
						if(!listCible.get(z).isDead())
						{
							cible = listCible.get(z);
							break;
						}
						z++;
					}

					if(cible == null)
					{ // si aucune cible
						combatIsOver = true;
						break;
					}
					else
					{ // si une cible
						float dommage = attaquant.attaquer(cible);
						
						String phrase = "Tour " + tour + " : " + attaquant.getNom();
						
						if(attaquant.isDead())
							phrase += " ( MORT )";
						else
							phrase += " (" + attaquant.getCarburant() + "/" + attaquant.getCarburantMax() + ")";
						phrase +=  " attaque " + cible.getNom();
						
						if(cible.isDead())
							phrase += " ( MORT )";
						else
							phrase += " (" + cible.getCarburant() + "/" + cible.getCarburantMax() + ")";
						
						phrase += ": " + (dommage>=0 ? -dommage : "+" + -dommage);
						System.out.println(phrase);
					}
				}
				
				
				
			}while(x < NB_TANK_A || y < NB_TANK_B);
			
			System.out.println("MALUS");
			for(int i = 0; i < NB_TANK_A; i++)
			{
				tankA.get(i).onUpdate(a, b);
			}
			for(int i = 0; i < NB_TANK_B; i++)
			{
				tankB.get(i).onUpdate(b, a);
			}
			System.out.println("FIN TOUR");

		} // fin du combat
		
		System.out.println("---------- RESULTAT BLEU ----------");
		for(int i = 0; i < NB_TANK_A; i++)
		{
			System.out.println((tankA.get(i).isDead()? " MORT " : " SURVIVANT ") + tankA.get(i));
		}
		System.out.println("---------- RESULTAT ROUGE ----------");
		for(int i = 0; i < NB_TANK_B; i++)
		{
			System.out.println((tankB.get(i).isDead()? " MORT " : " SURVIVANT ") + tankB.get(i));
		}
	}
}

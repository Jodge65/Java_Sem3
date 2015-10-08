package fr.iutbay.joey.TP1;

public class TableauControle
{
	public static void main (String [] args)
	{
		/* QUESTION :
		 *  1 ) scr : les classes que l'on a créer (et les packages) en .java (fichier éditable)
		 *  2 ) bin : les classes que l'on a créer (et les packages) en .class (compilé, et protegé)
		 * 
		 */
		int[] tab = { 5, 8, 9, 4, 2, 8, 4, 1, 6, 10 };
		int choix = 0;
		
		do{
			System.out.println("#" + choix + "# --------------------------------------------------------------------");
			switch(choix)
			{
				case 0: // Afficher le tableau
					afficherTableau(tab);
					choix++;
					break;
				case 1: // afficher la somme du tableau complet
					System.out.println("La valeur de toute les case est de : " + sommeValeurTableau(tab));
					choix++;
					break;
				case 2: // afficher le tableau trié dans l'ordre croissant
					System.out.println("TRIE CROISSANT : ");
					trierTableau(tab);
					afficherTableau(tab);
					choix++;
					break;
				case 3: // afficher le tableau trié dans l'ordre décroissant
					System.out.println("TRIE DECROISSANT : ");
					trierTableau(tab, false);
					afficherTableau(tab);
					choix++;
					break;
				default:
					choix = 0;
					break;
			}
			System.out.println("#" + choix + "# --------------------------------------------------------------------");
		}while(choix != 0);

		




	}
	
	/**
	 * Afficher chaque ligne d'un tableau
	 * 
	 * @param tab tableau d'entier
	 */
	public static void afficherTableau(int[] tab)
	{
		for(int i = 0; i < tab.length; i++)
		{
			System.out.println("La valeur de la case : " + i + " est de : " + tab[i]);
		}
	}
	
	/**
	 * Additionne chaque valeur d'un tableau
	 * 
	 * @param tab tableau d'entier
	 * @return int somme des valeurs du tableau
	 */
	public static int sommeValeurTableau(int[] tab)
	{
		int somme = 0;
		for(int i = 0; i < tab.length; i++)
		{
			somme += tab[i];
		}
		return somme;
	}
	
	/**
	 * Trie le tableau dans l'ordre croissant ou décroissant celon un Boolean
	 * 
	 * @param tab tableau d'entier
	 * @param croissant boolean. true = croissant, false = décroissant
	 */
	public static void trierTableau(int[] tab)
	{
		trierTableau(tab, true);
	}
	public static void trierTableau(int[] tab, boolean croissant)
	{
		for(int x = 0; x < tab.length; x++)
		{
			int pos = x;
			
			for(int y = x + 1; y < tab.length; y++)
			{
				if((!croissant && tab[y] > tab[pos])||(croissant && tab[y] < tab[pos]))
				{
					pos = y;
				}
			}
			int temps = tab[x];
			tab[x] = tab[pos];
			tab[pos] = temps;
		}
	}
}

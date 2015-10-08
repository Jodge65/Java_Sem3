package fr.iutbay.joey.TP2;

import fr.iutbay.joey.TP2.Joueur.Poste;

public class Main
{
	public static void main (String [] args)
	{
		Joueur florian = new Joueur("Pelerin", "Florian", 17, Poste.jungler, true);
		Joueur aurel = new Joueur("Martini", "Aurel", 8, Poste.support, true);
		Joueur joey = new Joueur("Sarie", "Joey", 2, Poste.adc, true);
		Joueur matthieu = new Joueur("Garcia", "Matthieu", 66, Poste.top, true);
		Joueur damien = new Joueur("Hamoudi", "Damien", 7, Poste.mid, true);
		Joueur sonia = new Joueur("Valencia", "Sonia", 8, Poste.support, false);
		
		Joueur twilight = new Joueur("Twilight", "Sparkle", 1, Poste.mid, true);
		Joueur pinkie = new Joueur("Pinkie", "Pie", 8, Poste.top, true);
		Joueur fluttershy = new Joueur("Fluttershy", "???", 3, Poste.support, true);
		Joueur rarity = new Joueur("Rarity", "???", 4, Poste.adc, false);
		Joueur rainbow = new Joueur("Rainbow Dash", "???", 9, Poste.adc, true);
		Joueur applejack = new Joueur("AppleJack", "???", 9, Poste.jungler, true);
		

		
		System.out.println(florian + "\n" + aurel + "\n" + joey + "\n" + matthieu + "\n" + damien);
		
		Equipe angletMuffinForce = new Equipe("Anglet Muffin Force !", florian, aurel, joey, matthieu, damien);
		System.out.println(angletMuffinForce);
		System.out.println(angletMuffinForce.listOfRemplacant());
		System.out.println(angletMuffinForce.listOfTitulaire());
		
		angletMuffinForce.addJoueur(sonia);
		angletMuffinForce.addJoueur(twilight);
		angletMuffinForce.addJoueur(pinkie);
		angletMuffinForce.addJoueur(fluttershy);
		angletMuffinForce.addJoueur(rarity);
		angletMuffinForce.addJoueur(rainbow);
		angletMuffinForce.addJoueur(applejack);
		
		System.out.println(angletMuffinForce);

		angletMuffinForce.subJoueur(pinkie);
		angletMuffinForce.subJoueur(rarity);
		angletMuffinForce.subJoueur(damien);
		System.out.println(angletMuffinForce);

		
		Equipe wonderbolt = new Equipe("The Wonderbolt");
		wonderbolt.addJoueur(twilight);
		wonderbolt.addJoueur(pinkie);
		wonderbolt.addJoueur(fluttershy);
		wonderbolt.addJoueur(rarity);
		wonderbolt.addJoueur(rainbow);
		wonderbolt.addJoueur(applejack);
		
		System.out.println(wonderbolt);
		System.out.println(wonderbolt.listOfRemplacant());
		System.out.println(wonderbolt.listOfTitulaire());

	}
}

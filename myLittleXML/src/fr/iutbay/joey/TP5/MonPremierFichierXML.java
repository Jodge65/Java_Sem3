package fr.iutbay.joey.TP5;

import java.io.FileOutputStream;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * 
 * @author Joey
 * 
 */
public class MonPremierFichierXML
{
	/** racine de l'arbre XML. */
	static Element racine = new Element("personnes");
	/** document XML lui même. */
	static Document document = new Document(racine);

	public static void main(String[] args)
	{
		Element etudiant = new Element("etudiant");
		racine.addContent(etudiant);

		Attribute classe = new Attribute("classe", "P2");
		etudiant.setAttribute(classe);

		Element nom = new Element("nom");
		nom.setText("CynO");
		etudiant.addContent(nom);

		Element prenoms = new Element("prenoms");
		etudiant.addContent(prenoms);

		Element prenom1 = new Element("prenoms");
		prenoms.addContent(prenom1);
		prenom1.setText("Nicolas");

		Element prenom2 = new Element("prenom");
		prenoms.addContent(prenom2);
		prenom2.setText("Laurent");

		Element etudiant2 = new Element("etudiant");
		racine.addContent(etudiant2);

		Attribute classe2 = new Attribute("classe", "P1");
		etudiant2.setAttribute(classe2);

		Element nom1 = new Element("nom");
		etudiant2.addContent(nom1);
		nom1.setText("SuperWoman");

		Element etudiant3 = new Element("etudiant");
		racine.addContent(etudiant3);

		Attribute classe3 = new Attribute("classe", "P1");
		etudiant3.setAttribute(classe3);

		Element nom2 = new Element("nom");
		etudiant3.addContent(nom2);
		nom2.setText("Don  Corleone");

		affiche();
		enregistre("Exercice1.xml");
	}

	/**
	 * fonction afficher
	 */
	public static void affiche()
	{
		try
		{
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, System.out);
		}
		catch (java.io.IOException e)
		{
		}
	}

	/**
	 * 
	 * @param fichier
	 *            (String) nom du fichier à enregistrer
	 */
	public static void enregistre(String fichier)
	{
		try
		{
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, new FileOutputStream(fichier));
		}
		catch (java.io.IOException e)
		{
		}
	}

}

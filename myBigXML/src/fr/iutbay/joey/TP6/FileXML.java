package fr.iutbay.joey.TP6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * 
 * @author Joey
 * 
 */
public class FileXML
{
	/** racine de l'arbre XML. */
	// static Element racine = new Element("personnes");
	static Element racine;
	/** document XML lui même. */
	static Document document = new Document(racine);
	static Document docTemps;

	public static void main(String[] args) throws JDOMException, IOException
	{

		SAXBuilder sxb = new SAXBuilder();
		try
		{
			document = sxb.build(new File("Source.xml"));
		}
		catch (Exception e)
		{
		}

		affiche();
		System.out.println("### ----------------------------------------------");
		afficherTexteDePetitsFilsDeLaRacine("etudiant", "nom");
		System.out.println("### ----------------------------------------------");
		afficherAttributDeFilsDeLaRacine("classe", "etudiant");
		System.out.println("### ----------------------------------------------");
		supprimerPetitFilsDansFils("etudiant", "prenoms");
		affiche();

		docTemps = sxb.build(new File("Source.xml"));
		Element root = docTemps.getRootElement();
		List<Element> listFils = root.getChildren("etudiant");
		for (int i = 0; i < listFils.size(); i++)
		{
			Element courant = listFils.get(i);
			if (!courant.getChild("nom").getText().equalsIgnoreCase("superwoman"))
			{
				System.out.println("TEST");

				courant.removeChild("nom");
			}
		}
		try
		{
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(docTemps, new FileOutputStream("ResultatFinal.xml"));
		}
		catch (java.io.IOException e)
		{
		}
		/*
		 * Element etudiant = new Element("etudiant");
		 * racine.addContent(etudiant);
		 * 
		 * Attribute classe = new Attribute("classe", "P2");
		 * etudiant.setAttribute(classe);
		 * 
		 * Element nom = new Element("nom");
		 * nom.setText("LeJardinier");
		 * etudiant.addContent(nom);
		 * 
		 * Element prenoms = new Element("prenoms");
		 * etudiant.addContent(prenoms);
		 * 
		 * Element prenom1 = new Element("prenoms");
		 * prenoms.addContent(prenom1);
		 * prenom1.setText("Nicolas");
		 * 
		 * Element prenom2 = new Element("prenom");
		 * prenoms.addContent(prenom2);
		 * prenom2.setText("Laurent");
		 * 
		 * Element etudiant2 = new Element("etudiant");
		 * racine.addContent(etudiant2);
		 * 
		 * Attribute classe2 = new Attribute("classe", "P1");
		 * etudiant2.setAttribute(classe2);
		 * 
		 * Element nom1 = new Element("nom");
		 * etudiant2.addContent(nom1);
		 * nom1.setText("SuperWoman");
		 * 
		 * Element etudiant3 = new Element("etudiant");
		 * racine.addContent(etudiant3);
		 * 
		 * Attribute classe3 = new Attribute("classe", "P3");
		 * etudiant3.setAttribute(classe3);
		 * 
		 * Element nom2 = new Element("nom");
		 * etudiant3.addContent(nom2);
		 * nom2.setText("Don  Corleone");
		 * 
		 * affiche();
		 * enregistre("Source.xml");
		 */
	}

	/**
	 * 
	 * @param nomDeFils
	 *            (String)
	 * @param nomDePetitFils
	 *            (String)
	 */
	public static void afficherTexteDePetitsFilsDeLaRacine(String nomDeFils, String nomDePetitFils)
	{
		Element racine = document.getRootElement();

		List<Element> listFils = racine.getChildren(nomDeFils);
		for (int i = 0; i < listFils.size(); i++)
		{
			Element courant = listFils.get(i);
			System.out.println(courant.getChild(nomDePetitFils).getText());
		}
	}

	/**
	 * 
	 * @param nomDeFils
	 *            (String)
	 * @param nomAttribut
	 *            (String)
	 */
	public static void afficherAttributDeFilsDeLaRacine(String nomAttribut, String nomDeFils)
	{
		Element racine = document.getRootElement();

		List<Element> listFils = racine.getChildren(nomDeFils);
		for (int i = 0; i < listFils.size(); i++)
		{
			Element courant = listFils.get(i);
			System.out.println(courant.getAttributeValue(nomAttribut));
		}
	}

	/**
	 * 
	 * @param fils
	 *            (String)
	 * @param petitFils
	 *            (String)
	 */
	static void supprimerPetitFilsDansFils(String fils, String petitFils)
	{
		Element racine = document.getRootElement();
		List<Element> listFils = racine.getChildren(fils);
		Iterator<Element> i = listFils.iterator();
		while (i.hasNext())
		{
			Element courant = (Element) i.next();
			if (courant.getChild(petitFils) != null)
			{
				courant.removeChild(petitFils);
				courant.setName(courant.getName() + "_modifie");
			}
		}
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

package fr.iutbay.dns_poisoning.main;

import fr.iutbay.dns_poisoning.dns.DNS;

/**
 * @author Florian & Joey
 * @version A0.0.6
 * Creation : 15/02/2016
 * Last modification : 15/02/2016
 * 
 * 1480 lignes
 * Main Class of the program.
 */
public class Main
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		DNS.onInit();
		new BaseWindows();
	}

}

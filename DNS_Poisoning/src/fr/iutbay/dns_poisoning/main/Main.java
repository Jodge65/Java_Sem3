package fr.iutbay.dns_poisoning.main;

import fr.iutbay.dns_poisoning.dns.DNS;

/**
 * @author Florian & Joey
 * @version A0.0.2
 * Creation : 15/02/2016
 * Last modification : 15/02/2016
 * 
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

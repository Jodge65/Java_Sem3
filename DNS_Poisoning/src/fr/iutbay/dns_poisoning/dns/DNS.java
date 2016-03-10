package fr.iutbay.dns_poisoning.dns;

public class DNS
{
	/** DNS server in charge of .com domain */
	public static DNS_simulator com = new DNS_simulator("com", 12);
	/** DNS server in charge of .fr domain */
	public static DNS_simulator fr = new DNS_simulator("fr", 12);
	/** DNS server in charge of .org domain */
	public static DNS_simulator org = new DNS_simulator("org", 12);

	/** DNS server in charge of .facebook domain */
	public static DNS_simulator facebook = new DNS_simulator("facebook", 12);
	/** DNS server in charge of .google domain */
	public static DNS_simulator google = new DNS_simulator("google", 12);
	
	public static DNS_simulator pirate = new DNS_simulator("pirate", 12);

	/** DNS where is connect user */
	public static DNS_simulator myDNS = new DNS_simulator("myDNS", 12);

	/**
	 * is call on launch. Initialize value of url <=> ip in DNS
	 */
	public static void onInit()
	{
		facebook.addUrlOwner("www.facebook.com", "www.facebook.com");
		google.addUrlOwner("www.google.fr", "www.google.fr");
		google.addUrlOwner("www.youtube.fr", "www.youtube.fr");
		google.addUrlOwner("www.wikipedia.org", "www.wikipedia.org");
	}
	
	/**
	 * give the first ip find for the url given.
	 * Your not suppose to use this. If you looking for a specific url, use "requestIp" from the class DNS_simulator
	 * @param name <i>(String)</i> name is the DNS where you want to request.
	 * @param url <i>(String)</i> the url you want to request
	 * @param lastIndex <i>(int)</i> the index of the name on the url (www.google.com => com = 0; google = 1; www = 2)
	 * @return <i>(String)</i> return the ip where you looking for, or a string "404" (not found)
	 */
	public static String askIpTo(String name, String url, int lastIndex)
	{
		String ip;
		if(name.equalsIgnoreCase("myDNS"))
			ip = myDNS.requestIP(url, lastIndex);
		else if(name.equalsIgnoreCase("com"))
			ip = com.requestIP(url, lastIndex);
		else if (name.equalsIgnoreCase("fr"))
			ip = fr.requestIP(url, lastIndex);
		else if (name.equalsIgnoreCase("org"))
			ip = org.requestIP(url, lastIndex);
		else if (name.equalsIgnoreCase("facebook"))
			ip = facebook.requestIP(url, lastIndex);
		else if (name.equalsIgnoreCase("google"))
			ip = google.requestIP(url, lastIndex);
		else if (name.equalsIgnoreCase("youtube"))
			ip = google.requestIP(url, lastIndex);
		else if (name.equalsIgnoreCase("wikipedia"))
			ip = google.requestIP(url, lastIndex);
		else if (name.equalsIgnoreCase("pirate"))
			ip = pirate.requestIP(url, lastIndex);
		else
			ip = "404";
		
		return ip;
	}
}

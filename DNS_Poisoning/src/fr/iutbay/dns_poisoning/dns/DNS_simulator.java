package fr.iutbay.dns_poisoning.dns;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Florian & Joey
 * @version A0.0.0
 * Creation : 29/02/2016
 * Last modification : 29/02/2016
 * 
 * Class of a DNS.
 */
public class DNS_simulator
{
	/** Name of the DNS */
	protected String name;
	/** hashmap of <i>< url, ip ></i> on string their are never erase and are always use on first */
	protected Map<String, String> urlOwner;
	/** hashmap of <i>< url, ip ></i> on string their are often erase and replace by newest value */
	protected Map<String, String> cache;

	/** int of the time (in hour) when the cache is clean*/
	protected int timeBetweenTwoClean;
	/** int of the actual tic time*/
	private int actualTic;

	public DNS_simulator(String name)
	{
		this(name, 24);
	}
	/**
	 * Default constructor. You must use "addurlOwner" if you want to add some value
	 * @param name <i>(String)</i> name of the DNS
	 * @param interval <i>(int)</i> time (in hour) between two clean of DNS (default = 24)
	 * 
	 * @see addUrlOwner
	 */
	public DNS_simulator(String name, int interval)
	{
		this.name = name;
		cache = new HashMap<String, String>();
		urlOwner = new HashMap<String, String>();
		timeBetweenTwoClean = interval;
		actualTic = 0;
	}
	
	/**
	 * return the name of the DNS
	 * @return <i>(String)</i> name of the dns
	 */
	public String getName()
	{
		return name;
	}

	
	/**
	 * add an url & ip on the urlOwner
	 * 
	 * @param url <i>(String)</i> url of target (www.XXX.com)
	 * @param ip <i>(String)</i> ip of target ("XXX.XXX.XXX.XXX")
	 * @return <i>(DNS_simulator)</i> return itself
	 */
	public DNS_simulator addUrlOwner(String url, String ip)
	{
		urlOwner.put(url, ip);
		return this;
	}
	
	/**
	 * add all the url & ip on the list in UrlOwner
	 * 
	 * @param list <i>(HashMap< String, String >)</i>
	 * @return <i>(DNS_simulator)</i> return itself
	 */
	public DNS_simulator addUrlOwner(HashMap<String, String> list)
	{
		urlOwner.putAll(list);
		return this;
	}
	
	/**
	 * add an url & ip on the cache. Cache is often purge so data can 
	 * 
	 * @param url <i>(String)</i> url of target (www.XXX.com)
	 * @param ip <i>(String)</i> ip of target ("XXX.XXX.XXX.XXX")
	 * @return <i>(DNS_simulator)</i> return itself
	 */
	public DNS_simulator addOnCache(String url, String ip)
	{
		cache.put(url, ip);
		return this;
	}
	
	/**
	 * onUptade is call eachHours
	 */
	public void onUptade()
	{
		actualTic ++;
		if(actualTic == timeBetweenTwoClean)
		{
			actualTic = 0;
			cache.clear();
		}
	}
	
	public String requestIP(String url)
	{
		return requestIP(url, 0);
	}
	/**
	 * Find the ip of the url request. All data are put in cache.
	 * @param url <i>(String)</i> url of target (www.XXX.com)
	 * @param lastIndexOfUrl <i>(int)</i> use for recursivity. Ignore if you just want to find.
	 * @return <i>(String)</i> ip of the url
	 */
	public String requestIP(String url, int lastIndexOfUrl)
	{
		lastIndexOfUrl++;
		if(urlOwner.containsKey(url))
		{
			return urlOwner.get(url);
		}
		else if(cache.containsKey(url))
		{
			return cache.get(url);
		}
		else if (url.equalsIgnoreCase("404"))
		{
			return url;
		}
		else
		{
			String[] temps = url.split("\\.");

			String dns;

			if(temps.length > lastIndexOfUrl)
				dns = temps[temps.length-lastIndexOfUrl];
			else
				dns = "404";

			String ip = DNS.askIpTo(dns, url, lastIndexOfUrl);
			addOnCache(url, ip);
			return ip;
		}
	}
	
	
}

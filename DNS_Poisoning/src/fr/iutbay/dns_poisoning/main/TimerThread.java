package fr.iutbay.dns_poisoning.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JLabel;

import fr.iutbay.dns_poisoning.dns.DNS;
import fr.iutbay.dns_poisoning.hacker.Exploit;

public class TimerThread extends Thread
{
	/** <i>int</i> define internal clock speed. 1 = 333 tick per seconds, 333 = 1 tick per seconds. each tick add 1 minutes to the current time*/
	public int horlogeInterne;
	/** <i>JLabel</i> label where th etime will be display*/
	public JLabel timer;
	/** <i>int</i> actual tick. Each 60 tick (60minutes in game) index come back to 0, and and hour update */
	public int indexTimer = 0;
	
	/** actual minutes in game */
	public int minutes;
	/** actual hour in game */
	public int heure;
	/** actual day in game */
	public int jour;
	/** actual index of the day (0 = lundi, 6 = dimanche) */
	public int jourSemaine;
	/** actual month in game */
	public int moisAnnee;
	/** actual year in game */
	public int annee;
	/** tab referencing all the day name from 0 = lundi, to 6 = dimanche */
	public static String[] CONTANTE_JOUR = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
	/** tab referencing all the month name from 0 = Janvier, to 11 = Décembre */
	public static String[] CONTANTE_MOIS = {"Janvier", "Févirer", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Décembre"};
	
	/**
	 * Default constructor
	 * @param timer <i>Jlabel</i> jlabel where is write actual time
	 * @param horloge <i>int</i> index of internal speed. at 1 : 333 tick per second. at 100 : 3 tick per second.
	 */
	public TimerThread(JLabel timer, int horloge)
	{
		this.horlogeInterne = horloge;
		this.timer = timer;
		
		
		// on crée l'objet en passant en paramétre une chaîne representant le format
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy.MM.dd" );
		//récupération de la date courante
		Date currentTime = new Date();
		//on crée la chaîne à partir de la date  
		String dateString = formatter.format(currentTime);
		String[] tabDate = dateString.split("\\.");
		Calendar cal = Calendar.getInstance();
		
        heure = cal.get(Calendar.HOUR_OF_DAY);
        minutes = cal.get(Calendar.MINUTE);
		jour = Integer.parseInt(tabDate[2]);
		jourSemaine = getIndexOfToday(new GregorianCalendar());
		moisAnnee = Integer.parseInt(tabDate[1]);
		annee = Integer.parseInt(tabDate[0]);

	}
	
	/**
	 * give index of the name of the actual day in reality
	 * @param calendar <i>GregorianCalendar</i> Calendar to use
	 * @return <i>(int)</i> index of the day in tab
	 */
	public static int getIndexOfToday(GregorianCalendar calendar) 
	{ 
        calendar.setTime(new Date());
        int today = calendar.get(calendar.DAY_OF_WEEK);
        int indexOfToday = 0;
      
        switch (today) {
        case GregorianCalendar.MONDAY:
            indexOfToday = 0;
            break;
        case GregorianCalendar.TUESDAY:
            indexOfToday = 1;
            break;
        case GregorianCalendar.WEDNESDAY:
            indexOfToday = 2;
            break;
        case GregorianCalendar.THURSDAY:
            indexOfToday = 3;
            break;
        case GregorianCalendar.FRIDAY:
            indexOfToday = 4;
            break;
        case GregorianCalendar.SATURDAY:
            indexOfToday = 5;
            break;
        case GregorianCalendar.SUNDAY:
            indexOfToday = 6;
            break;
        }
        
        return indexOfToday;
    }
	
	@Override
	public void run()
	{
		while(true)
		{
			try	{Thread.sleep(3 * horlogeInterne);}
			catch (InterruptedException e){}
			indexTimer++;
			if(indexTimer > 60)
			{
				Exploit.onUptade();
				DNS.com.onUptade();
				DNS.fr.onUptade();
				DNS.org.onUptade();
				DNS.facebook.onUptade();
				DNS.google.onUptade();
				DNS.pirate.onUptade();
				DNS.myDNS.onUptade();
				indexTimer = 0;
			}

			
			timer.setText(uptadeDate());
		}
	}

	/**
	 * Function
	 * @return
	 */
	public String uptadeDate()
	{
		minutes += 1;
		if(minutes >= 60)
		{
			minutes -= 60;
			heure++;
			if(heure >= 24)
			{
				heure -= 24;
				jour++;
				if(jour > getNbJour())
				{
					jour = 1;
					moisAnnee++;
					if(moisAnnee > 12)
					{
						moisAnnee = 1;
						annee++;
					}
				}
				jourSemaine++;
				if(jourSemaine > 6)
					jourSemaine = 0;
			}
		}
						
		return getDate();
	}
	
	public String getDate()
	{
		return CONTANTE_JOUR[jourSemaine] + " " + jour + " " + CONTANTE_MOIS[moisAnnee] + " " + annee  + " - " + heure  + ":" + (minutes<10?"0"+minutes:minutes) ;

	}
	private int getNbJour()
	{
		switch(moisAnnee)
		{
			case 0: case 2: case 4: case 6: case 7: case 9: case 11:
				return 31;
			case 3: case 5: case 8: case 10:
				return 30;
			case 1:
				if(annee % 4 == 0)
					return 28;
				else
					return 27;
		}
		return 0;
	}
	

}

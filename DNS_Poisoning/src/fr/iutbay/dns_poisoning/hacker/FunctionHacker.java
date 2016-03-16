package fr.iutbay.dns_poisoning.hacker;

import java.awt.Color;

import fr.iutbay.dns_poisoning.dns.DNS;
import fr.iutbay.dns_poisoning.main.BaseWindows;

/**
 * @author Florian & Joey
 * @version A0.0.1
 * Creation : 15/02/2016
 * Last modification : 10/03/2016
 * 
 * List of function execute by command.
 */
public class FunctionHacker
{
	public static void w(String line)
	{
		w(line, Color.WHITE);
	}
	public static void w(String line, Color c)
	{
		BaseWindows.writeOnScreen(line, false, c);
	}
	public static void wl(String line)
	{
		wl(line, Color.WHITE);
	}

	public static void wl(String line, Color c)
	{
		w("   > " + line + "\n", c);
	}
	public static void performCommand(String commande)
	{
		
		
		if(commande.equalsIgnoreCase("pony"))
		{
			w("____________________", Color.BLACK);w("▄▄▄███████████████▄▄\n", Color.BLUE);
			w("__________________", Color.BLACK);w("▅▀█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▄\n", Color.BLUE);
			w("_______________________", Color.BLACK);w("▄▄▄█████▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓███▄▄\n", Color.BLUE);
			w("____________________", Color.BLACK);w("▄██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓██▄_____▓▓\n", Color.BLUE);
			w("_________________", Color.BLACK);w("▄█▒▒▓__▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓██▓___▓▓\n", Color.BLUE);
			w("______________", Color.BLACK);w("▄█▒▒▒▒▒▓__▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓_______▓\n", Color.BLUE);
			w("____________", Color.BLACK);w("▄█▒▒▒▒▒▒▒▓_▓___▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓_________▓\n", Color.BLUE);
			w("__________", Color.BLACK);w("▄█▒▒▒▒▒▒▒▒▒▓______▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓___________▓\n", Color.BLUE);
			w("_________", Color.BLACK);w("██▒▒▒████▓▓▓▓▓____▓____▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓________▓____▓\n", Color.BLUE);
			w("________", Color.BLACK);w("███▀▀██▓▓▓▓▓▓▓▓▓_▓_______▓▓▀▀▀▀▀▀██▓▓▓▓▓▓▓__________▓____▓█\n", Color.BLUE);
			w("______", Color.BLACK);w("█▀", Color.BLUE);w("___", Color.BLACK);w("▄█▓▓▓▓▓▓▓▓▓▓▓▓________▓_______██▓▓▓▓▓▓▓▓▓__________▓", Color.BLUE);w("___", Color.BLACK);w("▓██\n", Color.BLUE);
			w("_________", Color.BLACK);w("▄█▓▓▓▓▓▓▓▓█████▓▓______________██▓▓▓▓██▀▀▀▓__________▓___▓▓▓█\n", Color.BLUE);
			w("_______", Color.BLACK);w("▄█▓▓▓▓▓▓███▓███▓▓__▓____________█▓██▀▀▀_________________▓___▓▒▓▓█\n", Color.BLUE);
			w("_____", Color.BLACK);w("▄█▓▓▓▓▓███▒▒▓██▓██▓______________█▀▀__▓▓▓▓▓▓▓___________▓___▓▒▒▓▓█\n", Color.BLUE);
			w("____", Color.BLACK);w("██▓▓▓███▒▒▒▒▓██▓▓██▓_______________▓▓▓▓██████▓▓▀______▓_____▓▒▒▒▓▓█\n", Color.BLUE);
			w("___", Color.BLACK);w("█▓▓████▒▒▒▒▒▓██▓▓▒██▓____________▓▓███▒▒▓▓▓▓██▓_____________▓▒▒▒▒▓▓█\n", Color.BLUE);
			w("__", Color.BLACK);w("█▓█▀", Color.BLUE);w("_", Color.BLACK);w("██▒▒▒▒▒▒▓██▓▒▒██▓__________▓▓██▒▒▒▒▓▓▓▓▓██▓▄▀_________▓▓▓▒▒▒▓▓█\n", Color.BLUE);
			w("_", Color.BLACK);w("██", Color.BLUE);w("____", Color.BLACK);w("██▒▒▒▒▒▒▓██▒▒▓▓█▓▓________▓▓██▓▒▒▒▓▓▓▓▓▓██▓__________▓█▓▓▒▒▒▒▓█\n", Color.BLUE);
			w("▀", Color.BLUE);w("_____", Color.BLACK);w("██▒▒▒▒▒▒▒▓██▒▒▓▓█▓▓_______▓▓██▓▓▓▒▒▒▓▓▓▓██▓▄▄▀______▓_█▓▓▒▒▒▒▓▓█\n", Color.BLUE);
			w("_____", Color.BLACK);w("██▒▒▒▒▒▒▒▒▓██▒▒▓▓█▓▓▓____▓▓██▓▓▓▓▒▒▒▒▓▓▓██▓____________█▓▓▒▒▒▒▒▓█\n", Color.BLUE);
			w("_____", Color.BLACK);w("██▒▒▒▒▒▒▒▒▓██▒▒▒▓██████▓▓▓██▓▓▓▒▒▒▒▒▓▓▓██▓___________█▓▓▓▒▒▒▒▒▓▓█\n", Color.BLUE);
			w("____", Color.BLACK);w("██▒▒▒▒▒▒▒▒▒▓██▒▓▓██▓▓▓▓▓████▓▓▓▒▒▒▒▒▓▓▓██▓___________█▓▓▓▒▒▒▒▒▒▓▓█\n", Color.BLUE);
			w("____", Color.BLACK);w("█▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓█▓▓______▓▓█▓▓▒▒▒▒▒▓▓▓▓██▓___________█▓▓▓▓▒▒▒▒▒▓▓█\n", Color.BLUE);
			w("___", Color.BLACK);w("█▒▒▒▒▒▒▒▒▒▒▒▓▓█▓▓██▓_______▓▓█▓▓▒▒▒▒▓▓▓▓██▓___________█▓▓▓▓█▒▒▒▒▒▓▓█\n", Color.BLUE);
			w("___", Color.BLACK);w("█▒▒▒▒▒▒█▒▒▒▒▓▓▓▓▓▓__________▓▓█▓▒▒▒▒▓▓▓▓██▓___________█▓▓▓▓█▒▒▒▒▒█▓▓█\n", Color.BLUE);
			w("__", Color.BLACK);w("█▒▒▒▒▒▒█▒▒▒▒▓▓▓▓____▄▄___▄___▓▓██▒▒▒▒▓▓███▓____________█▓▓▓██▒▒▒▒▒██▓█\n", Color.BLUE);
			w("__", Color.BLACK);w("█▒▒▒▒▒██▒▒▒▓▓▓▓▓▓________█▐___▓▓████████▓▓____________█▓▓▓█_█▒█▒▒▒█_█▓█\n", Color.BLUE);
			w("__", Color.BLACK);w("█▒▒▒██", Color.BLUE);w("_", Color.BLACK);w("█▒▒▒▓▓▓▓▓▓▓▓▓▄▄▄▀_▐____▓▓▓▓███▓▓_________▓▓▓▓█▓▓█_█▒▒█▒▒▒█", Color.BLUE);w("__", Color.BLACK);w("██\n", Color.BLUE);
			w("_", Color.BLACK);w("█▒▒▒█", Color.BLUE);w("___", Color.BLACK);w("█▒▒▒▓▓▓▓▓▓▓▓▓▓_____▐________▓▓▓▓________▓▓▓___████___█▒▒█▒▒█", Color.BLUE);w("____", Color.BLACK);w("█\n", Color.BLUE);
			w("_", Color.BLACK);w("█▒▒█", Color.BLUE);w("____", Color.BLACK);w("█▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▄▀_______________▓▓▓▓▓_____██______█▒▒██▒▒█", Color.BLUE);w("____", Color.BLACK);w("█\n", Color.BLUE);
			w("_", Color.BLACK);w("█▒█", Color.BLUE);w("______", Color.BLACK);w("█▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓___________________█▒▒███▒█\n", Color.BLUE);
			w("_", Color.BLACK);w("██", Color.BLUE);w("_______", Color.BLACK);w("█▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█____________________________█▒▒█", Color.BLUE);w("_", Color.BLACK);w("█▒█\n", Color.BLUE);
			w("_", Color.BLACK);w("█", Color.BLUE);w("_________", Color.BLACK);w("█▒▒▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓█_____________________________█▒█", Color.BLUE);w("___", Color.BLACK);w("█▒█\n", Color.BLUE);
			w("____________", Color.BLACK);w("█▒▓▓▓▓▓▓▓█▓▓▓▓▓██▓▓█____________________________█▒█", Color.BLUE);w("_____", Color.BLACK);w("██\n", Color.BLUE);
			w("____________", Color.BLACK);w("█▒▓▓▓▓▓▓▓██▓▓▓█__███____________________________██", Color.BLUE);w("_______", Color.BLACK);w("█\n", Color.BLUE);
			w("_____________", Color.BLACK);w("█▓▓▓▓▓▓▓█", Color.BLUE);w("_", Color.BLACK);w("█▓▓▓█", Color.BLUE);w("___", Color.BLACK);w("█", Color.BLUE);w("____________________________", Color.BLACK);w("█", Color.BLUE);w("_________", Color.BLACK);w("▀\n", Color.BLUE);
			w("______________", Color.BLACK);w("█▓▓▓▓▓▓█", Color.BLUE);w("__", Color.BLACK);w("█▓▓▓█\n", Color.BLUE);
			w("______________", Color.BLACK);w("█▓▓▓▓▓▓█", Color.BLUE);w("___", Color.BLACK);w("██▓█\n", Color.BLUE);
			w("_______________", Color.BLACK);w("█▓▓▓▓▓█", Color.BLUE);w("______", Color.BLACK);w("██\n", Color.BLUE);
			w("________________", Color.BLACK);w("█▓▓▓▓▓█", Color.BLUE);w("_______", Color.BLACK);w("█\n", Color.BLUE);
			w("_________________", Color.BLACK);w("█▓▓▓▓█\n", Color.BLUE);
			w("__________________", Color.BLACK);w("██▓▓▓█\n", Color.BLUE);
			w("____________________", Color.BLACK);w("█▓▓▓█\n", Color.BLUE);
			w("_____________________", Color.BLACK);w("██▓▓█\n", Color.BLUE);
			w("________________________", Color.BLACK);w("██\n", Color.BLUE);
			w("__________________________", Color.BLACK);w("█\n", Color.BLUE);
		}
		else if(commande.equalsIgnoreCase("ping"))
		{
			wl("Pong ! \n", Color.GREEN);
		}
		else
		if(commande.equalsIgnoreCase("dns"))
		{
			int dif = DNS.myDNS.timeBetweenTwoClean - DNS.myDNS.actualTic;
			w("   > Prochaine purge du cache dans ");
			w(""+dif, dif>6?Color.GREEN:dif>3?Color.YELLOW:Color.RED);
			w("h\n");


		}
		else if(commande.equalsIgnoreCase("credit"))
		{
			w("   > \"");
			w("Florian Pellerin", Color.CYAN);
			w("\"");
			w(" - Programmation du simulateur \n");
			w("   > \"");
			w("Joey Sarie", Color.CYAN);
			w("\"");
			w(" - Programmation du simulateur \n");
			w("   > \"");
			w("pctronique", Color.CYAN);
			w("\"");
			w(" - Classe du 'HackerScreen' (terminal couleur)\n");
			w("   > \"");
			w("Darryl", Color.CYAN);
			w("\"");
			w(" - Classe du 'StretchIcon' (image auto-redimensionné)\n");
			w("   > \"");
			w("Dan Kaminisky", Color.CYAN);
			w("\"");
			w(" - Découverte de la méthode actuelle de DNS Poisoning \n");
			w("   > \"");
			w("Lilian Darribeyros", Color.CYAN);
			w("\"");
			w(" - Enseignement \n");
			w("   > \"");
			w("Sophie Laplace", Color.CYAN);
			w("\"");
			w(" - Enseignement \n");
		}
		else if(commande.equalsIgnoreCase("exploit"))
		{		
			w("   > Exploit.conf ", Color.CYAN);
			w("Version : ");
			w(" 1.0.0 \n\n",Color.YELLOW);
			
			w("   > Etat : ", Color.LIGHT_GRAY);
			if(Exploit.isOn())
			{
				int dif = Exploit.interval - Exploit.actuel;

				w("Démarré\n", Color.GREEN);
				w(" prochaine injection dans ");
				
				w(""+dif, dif>Exploit.actuel/2+1?Color.RED:dif>Exploit.actuel/4+1?Color.YELLOW:Color.GREEN);
				w("h\n");
			}
			else
				w("Arreté\n", Color.RED);

			w("   > Target actuel : ", Color.LIGHT_GRAY);
			if(DNS.myDNS.requestIP(Exploit.url).equalsIgnoreCase("404"))
			{
				w(Exploit.url, Color.ORANGE);
				w(" (erreur dans url)\n");
			}
			else
			{
				w(Exploit.url, Color.GREEN);
				w(" (url existant)\n");
			}

			w("   > Target redirection : ", Color.LIGHT_GRAY);
			if(DNS.myDNS.requestIP(Exploit.ip).equalsIgnoreCase("404"))
			{
				w(Exploit.ip, Color.ORANGE);
				w(" (erreur dans url)\n");
			}
			else
			{
				w(Exploit.ip, Color.GREEN);
				w(" (url existant)\n");
			}
			
			w("   > Intervalle d'activation : ", Color.LIGHT_GRAY);
			w("toutes les ");
			w(Exploit.interval+"h\n", Color.ORANGE);
			
			boolean somethinkToUptade = false;
			w("   > Donnée(s) en attente de redémarrage : ", Color.LIGHT_GRAY);
		
			if(Exploit.getTempsUrl() != null)
			{
				somethinkToUptade = true;
				w("\n       Target actuel : ", Color.LIGHT_GRAY);
				if(DNS.myDNS.requestIP(Exploit.getTempsUrl()).equalsIgnoreCase("404"))
				{
					w(Exploit.getTempsUrl(), Color.YELLOW);
					w(" (erreur dans url)");
				}
				else
				{
					w(Exploit.getTempsUrl(), Color.GREEN);
					w(" (url existant)");
				}
			}
			if(Exploit.getTempsIp() != null)
			{
				somethinkToUptade = true;
				w("\n       Target redirection : ", Color.LIGHT_GRAY);
				if(DNS.myDNS.requestIP(Exploit.getTempsIp()).equalsIgnoreCase("404"))
				{
					w(Exploit.getTempsIp(), Color.YELLOW);
					w(" (erreur dans url)");
				}
				else
				{
					w(Exploit.getTempsIp(), Color.GREEN);
					w(" (url existant)");
				}
			}
			if(Exploit.tempsInterval != 0)
			{
				somethinkToUptade = true;
				w("\n       Intervalle d'activation : ", Color.LIGHT_GRAY);
				w("toutes les ");
				w(Exploit.tempsInterval+"h", Color.YELLOW);
			}
			if(!somethinkToUptade)
			{
				w("rien\n");
			}
			else
			{
				w("\n");
			}
		}
		else if(commande.equalsIgnoreCase("tutorial"))
		{
			wl("Tutoriel : \n");
			w("Pour empoisonner le cache d'un serveur DNS, il faut préalablement configurer un fichier nommé ");
			w("exploit",Color.YELLOW);
			w(" (Le fichier est pré-configuré pour une utilisation plus rapide, et la méthode a été simplifiée).\n");
			w("Notez la présence d'une date en bas à droite. en tapant la commande ");
			w("dns ",Color.CYAN);
			w("vous pourrez savoir quand sera purgé le cache du serveur dns cible");

			w("Pour cela, vous devez suivre les étapes suivantes :\n");
			w("\n0 : ", Color.LIGHT_GRAY);
			w("A chaque fois que vous voudrez connaitre l'état de l'exploit, utilisez  ");
			w("exploit",Color.CYAN);
			w(".\nUn rapide résumé de la situation sera donné.\n");
			
			w("\n1 : ", Color.LIGHT_GRAY);
			w("Commencez par utiliser la commande ");
			w("exploit.setTarget",Color.CYAN);
			w(" url",Color.YELLOW);
			w(".\nGrâce à cette ligne, vous pourrez choisir le site dont vous voulez interdire l'accès.\n");

			w("\n2 : ", Color.LIGHT_GRAY);
			w("Utilisez ensuite la commande ");
			w("exploit.setRedirection",Color.CYAN);
			w(" url",Color.YELLOW);
			w(".\nGrâce à cette ligne, vous pourrez choisir vers quoi sera redirigé le site.\n");
			w("Si vous y notez l'url d'un autre site, alors la personne sera redirigée vers l'autre site.\n");
			w("Généralement, le pirate redirige la victime sur une copie du site afin d'obtenir les informations confidentielles qu'elle pourrait y rentrer (n°carte bleu, ...)\n");

			w("\n3 : ", Color.LIGHT_GRAY);
			w("Puis enchainez eventuellement avec la commande ");
			w("exploit.setInterval",Color.CYAN);
			w(" durée",Color.YELLOW);
			w("(h)");
			w(".\nUn cache DNS est régulièrement purgé. Les données sont généralement stockées une trentaine d'heure.\n");
			w("Il est donc important de régulièrement renouveler les informations en cache.\n");
			w("Dans cette simulation, nous supponsons que les données arrivent forcément dans le cache et ce du premier coup.");
			w("Néamoins, dans la réalité, certains DNS sont mieux protegés, et il faut parfois plus d'une centaine de milliers de tentatives pour y faire rentrer les données.\n");

			w("\n4 : ", Color.LIGHT_GRAY);
			w("Pour finir, utilisez la commande ");
			w("exploit.start",Color.CYAN);
			w(".\nL'exploit sera alors lancé.\n");
			w("Régulièrement, les fausses données de redirection seront transmises au cache, et l'utilisateur ne pourra plus naviguer.\n");

			w("\n5 : ", Color.LIGHT_GRAY);
			w("Toute modification de l'exploit n'est effective que lorsque ce dernier est éteint. Les changements effectués en cours de marche seront effectif lorsque l'exploit sera éteint.\n");
			w("Dans ce 2nd cas, vous pouvez utiliser ");
			w("exploit.stop ", Color.CYAN);
			w("ou bien ");
			w("exploit.restart ", Color.CYAN);
			w(".\n");

			w("\n6 : ", Color.LIGHT_GRAY);
			w("Il peut arriver que vous vouliez forcer l'ajout des données. Pour cela, utilisez ");
			w("exploit.forceHack", Color.CYAN);
			w(".\n");
		}
		else if(commande.equalsIgnoreCase("exploit.forceHack")) 
		{
			if(Exploit.isOn())
			{
				if(Exploit.url != null && Exploit.ip != null)
				{
					wl("Introduction des données réussis. L'adresse " + Exploit.url + " redirige désormais sur l'adresse " + Exploit.ip + ".", Color.GREEN);
					Exploit.uptadeDNS();
				}
				else
				{
					wl("Les valeurs ne sont pas initialisées. Impossible d'effectuer une empoisonnement", Color.RED);
				}
			}
			else
			{
				wl("L'exploit n'est pas en fonctionnement. Impossible de forcer l'introduction des données.", Color.RED);
			}
		}
		else if(commande.equalsIgnoreCase("exploit.start"))
		{
			if(Exploit.isOn())
				wl("L'exploit est déjà en cours d'exécution", Color.ORANGE);
			else
				wl("Démarrage de l'exploit", Color.GREEN);
			Exploit.start();
		}
		else if(commande.equalsIgnoreCase("clear"))
		{
			BaseWindows.hackerScreen.setText("");
			BaseWindows.writeOnScreen("Bienvenue sur HackOs.\n", false, Color.CYAN);
			BaseWindows.writeOnScreen("Tapez \"help\" pour plus de renseignements ou \"tutorial\" pour une description détaillée de la procédure à suivre\n");
		}
		else if(commande.equalsIgnoreCase("exploit.stop"))
		{
			if(Exploit.isOff())
				wl("L'exploit est déjà éteint", Color.ORANGE);
			else
				wl("Extinction de l'exploit", Color.GREEN);
			if(Exploit.majNeeded())
			{
				wl("Application des mises à jour", Color.CYAN);
				wl("La nouvelle valeur de la cible est : '" + Exploit.getTempsUrl() + "'");
				wl("La nouvelle valeur de la redirection est : '" + Exploit.getTempsIp() + "'");
			}
			Exploit.stop();
		}
		else if(commande.equalsIgnoreCase("exploit.restart"))
		{
			if(Exploit.isOn())
				wl("Extinction de l'exploit", Color.GREEN);
			if(Exploit.majNeeded())
			{
				wl("Application des mises à jour", Color.CYAN);
				if(Exploit.getTempsUrl() != null)
				{
					wl("La nouvelle valeur de la cible est : '" + Exploit.getTempsUrl() + "'");
				}
				if(Exploit.getTempsIp() != null)
				{
					wl("La nouvelle valeur de la redirection est : '" + Exploit.getTempsIp() + "'");
				}

			}
			wl("Démarrage de l'exploit", Color.GREEN);
			Exploit.restart();
		}
		else if(commande.equalsIgnoreCase(""))
		{
			// do nothing. just and empty line
		}
		else // commande avec argument
		{
			if(commande.startsWith("exploit.setTarget"))
			{
				if(commande.length() == "exploit.setTarget".length())
				{
					afficherNoArg(commande);
				}
				else
				{
					String arg = commande.substring("exploit.setTarget".length()+1);
					if(Exploit.isOn())
					{
						wl("L'exploit est déjà en cours d'exécution.", Color.ORANGE);
						wl("La Mise à jour sera effectuée au prochain lancement", Color.ORANGE);
					}
					else
					{
						wl("La nouvelle valeur de la cible est désormais : '" + arg + "'", Color.GREEN);
					}
					Exploit.setUrl(arg);
				}
			}
			else if(commande.startsWith("exploit.setRedirection"))
			{
				if(commande.length() == "exploit.setRedirection".length())
				{
					afficherNoArg(commande);
				}
				else
				{
					String arg = commande.substring("exploit.setRedirection".length()+1);
					if(Exploit.isOn())
					{
						wl("L'exploit est déjà en cours d'exécution.", Color.ORANGE);
						wl("La Mise à jour sera effectuée au prochain lancement", Color.ORANGE);
					}
					else
					{
						wl("La nouvelle valeur de la redirection est désormais : '" + arg + "'", Color.GREEN);
					}
					Exploit.setIp(arg);
				}
			}
			else if(commande.startsWith("exploit.setInterval"))
			{
				if(commande.length() == "exploit.setInterval".length())
				{
					afficherNoArg(commande);
				}
				else
				{
					String arg = commande.substring("exploit.setInterval".length()+1);
					try
					{
						int value = Integer.parseInt(arg);
						Exploit.setInterval(value);

						if(Exploit.isOn())
						{
							wl("L'exploit est déjà en cours d'exécution.", Color.ORANGE);
							wl("La Mise à jour sera effectuée au prochain lancement", Color.ORANGE);
						}
						else
						{
							wl("La nouvelle valeur de l'intervalle est désormais : '" + arg + "'", Color.GREEN);
						}

					}
					catch(Exception e)
					{
						wl("Impossible de définir l'intervalle. Assurez vous d'avoir spécifié une valeur entière.", Color.RED);
					}
				}
			}
			else if(commande.startsWith("links"))
			{
				if(commande.length() == "links".length())
				{
					afficherNoArg(commande);
				}
				else
				{
					String arg = commande.substring("links".length()+1);
					String url = DNS.myDNS.requestIP(arg);
					
					wl("L'url \"" + arg + "\" renvoie sur la page : \"" + url + "\"" , (arg.equalsIgnoreCase(url)?Color.GREEN:Color.RED));
				}
			}
			else if(commande.startsWith("help"))
			{
				if(commande.length() == "help".length())
				{
					 w("Mode d'emploi : ", Color.LIGHT_GRAY);
					 w(" : Sélectionnez un site dont vous voulez changer l'adresse puis sa nouvelle adresse "
							+ "et un intervalle d'attente entre chaque renvoi de la requête de redirection. "
							+ "Une fois ceci fait lancez l'exploit. Il est possible de forcer un renvoi de la "
							+ "requête sans modification ou de renvoyer une nouvelle requête avec des valeurs "
							+ "modifiées en relançant l'exploit.\n \n");
					 w("Commandes : \n", Color.LIGHT_GRAY);
					wl("clear", Color.CYAN);
					 w("	Efface le terminal \n");
					wl("tutorial", Color.CYAN);
					 w("	Affiche le mode d'emploi détaillé, ainsi que la procédure à suivre \n");
					 w("   > links ", Color.CYAN);
					 w("url\n", Color.YELLOW);
					 w("	Donne l'ip correspondant a cette url sur le serveur DNS empoisonné \n");
					wl("help", Color.CYAN);
					 w("	Affiche le mode d'emploi de la simulation et les commandes disponibles \n");
					 w("   > exploit.setTarget ", Color.CYAN);
					 w(" urlSiteTarget\n", Color.YELLOW);
					 w("	Selectionne le site dont on veut changer l'IP \n");
					 w("   > exploit.setRedirection ", Color.CYAN);
					 w(" urlRedirection\n", Color.YELLOW);
					 w("	Selectionne la nouvelle adresse du site cible \n");
					 w("   > exploit.setInterval", Color.CYAN);
					 w(" value\n", Color.YELLOW);
					 w("	Ddéfinit le nombre d'heures entre chaque envoi de la requête de redirection \n");
					wl("exploit", Color.CYAN);
					 w("	Affiche un résumé de la situation de l'exploit \n");
					wl("exploit.forceHack", Color.CYAN);
					 w("	Force le renvoi de fausses informations, nécessite que l'exploit soit démarré \n");
					wl("exploit.start", Color.CYAN);
					 w("	Démarre l'exploit en prenant en compte les derniers paramètres entrés \n");
					wl("exploit.stop", Color.CYAN);
					 w("	Arrête l'exploit \n");
					wl("exploit.restart", Color.CYAN);
					 w("	Relance l'exploit en prenant en compte les changements de paramètres \n");
					wl("dns", Color.CYAN);
					 w("	Indique la durée avant la prochaine purge du cache.\n");
					 
					 
					 w("\n\n\n* Pour des raisons de simplification, l'IP est textualisée en tant qu'URL.\n");

				}
				else
				{
					String arg = commande.substring("help".length()+1);
					if(arg.equalsIgnoreCase("help"))
					{
						wl("help", Color.CYAN);
						 w("	Affiche le mode d'emploi de la simulation et les commandes disponibles.\n");
						 w("Vous pouvez aussi taper ");
						 w("help ", Color.CYAN);
						 w("'nomFonction' ", Color.YELLOW);
						 w("pour obtenir plus de détails.\n");

					}
					else if(arg.equalsIgnoreCase("clear"))
					{
						wl("clear", Color.CYAN);
						 w("	Efface le terminal \n");
					}
					else if(arg.equalsIgnoreCase("tutorial"))
					{
						wl("tutorial", Color.CYAN);
						 w("	Affiche le mode d'emploi détaillé, ainsi que la procédure à suivre \n");
					}
					else if(arg.equalsIgnoreCase("links"))
					{
						 w("   > links ", Color.CYAN);
						 w("url\n", Color.YELLOW);
						 w("	Donne l'ip correspondant a cette url sur le serveur DNS empoisonné ");
						 w("    Notez que pour des raisons pratiques, les adresses ip utilisées ici ne seront pas des suites de chiffre (");
						 w("192.168.1.1", Color.YELLOW);
						 w(") mais des adresses url (");
						 w("www.localhost.com", Color.YELLOW);
						 w(").\n");


					}
					else if(arg.equalsIgnoreCase("exploit"))
					{
						wl("exploit", Color.CYAN);
						 w("	Affiche un résumé de la situation de l'exploit \n");
					}
					else if(arg.equalsIgnoreCase("exploit.setTarget"))
					{
						 w("   > exploit.setTarget ", Color.CYAN);
						 w("urlSiteTarget\n", Color.YELLOW);
						 w("	Selectionne le site dont on veut changer l'IP \n");
						 w("	La valeur prend la forme ");
						 w("www.adresse.extension\n", Color.YELLOW);
					}
					else if(arg.equalsIgnoreCase("exploit.setRedirection"))
					{
						 w("   > exploit.setRedirection ", Color.CYAN);
						 w("urlRedirection\n", Color.YELLOW);
						 w("	selectionne la nouvelle adresse du site cible \n");
						 w("	La valeur prend la forme ");
						 w("www.adresse.extension\n", Color.YELLOW);
					}
					else if(arg.equalsIgnoreCase("exploit.setInterval"))
					{
						w("   > exploit.setInterval", Color.CYAN);
						 w(" value\n", Color.YELLOW);
						 w("	définit le nombre d'heures entre chaque envoi de la requête de redirection \n");
						 w("	La valeur prend la forme d'un entier ex : ");
						 w("24 ", Color.YELLOW);
						 w("est egale à une journée.\n");

					}
					else if(arg.equalsIgnoreCase("exploit.forceHack"))
					{
						wl("exploit.forceHack", Color.CYAN);
						 w("	force le renvoi de fausses informations, nécessite que l'exploit soit démarré \n");
						 w("	Une fois exécuté, les données sont ajoutées dans le cache du serveur DNS jusqu'à suppression de ces dernières\n");
					}
					else if(arg.equalsIgnoreCase("exploit.start"))
					{
						wl("exploit.start", Color.CYAN);
						 w("	Démarre l'exploit en prenant en compte les derniers paramètres entrés \n");
						 w("	Si des valeurs ont été modifiées, alors elles seront mises à jour.\n");
					}
					else if(arg.equalsIgnoreCase("exploit.stop"))
					{
						wl("exploit.stop", Color.CYAN);
						 w("	Arrête l'exploit \n");
						 w("	Une fois dans cet état, tous modification aura lieu sans encombre.\n");
						 w("	De plus les données ne seront pas re-injecté dans les serveurs DNS, et finiront par disparaitre.\n");
					}
					else if(arg.equalsIgnoreCase("exploit.restart"))
					{
						wl("exploit.restart", Color.CYAN);
						 w("	Relance l'exploit en prenant en compte les éventuels changements de paramètres \n");
					}
					else if(arg.equalsIgnoreCase("dns"))
					{
						wl("dns", Color.CYAN);
						 w("	Indique la durée avant la prochaine purge du cache.\n");
					}
					else
					{
						wl("La commande \"" + arg + "\" n'existe pas, ou n'a pas de doc associée.\n", Color.RED);
					}
				}


			}
			else
			{
				wl("La commande \"" + commande + "\" n'est pas valide.", Color.RED);
			}
		}
		

	}
	
	public static void afficherNoArg(String commande)
	{
		w("   > La commande ", Color.RED);
		w(commande, Color.YELLOW); 
		w(" n'as pas les arguments nécessaires.\n", Color.RED);
		w("	Essayez ", Color.RED);
		w("help ", Color.CYAN );
		w(commande + " ", Color.YELLOW);
		w("pour plus de détails", Color.RED);

	}
}

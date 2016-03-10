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
			w("____________________▄▄▄███████████████▄▄\n");
			w("__________________▅▀█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▄\n");
			w("_______________________▄▄▄█████▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓███▄▄\n");
			w("____________________▄██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓██▄_____▓▓\n");
			w("_________________▄█▒▒▓__▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓██▓___▓▓\n");
			w("______________▄█▒▒▒▒▒▓__▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓_______▓\n");
			w("____________▄█▒▒▒▒▒▒▒▓_▓___▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓_________▓\n");
			w("__________▄█▒▒▒▒▒▒▒▒▒▓______▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓___________▓\n");
			w("_________██▒▒▒████▓▓▓▓▓____▓____▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓________▓____▓\n");
			w("________███▀▀██▓▓▓▓▓▓▓▓▓_▓_______▓▓▀▀▀▀▀▀██▓▓▓▓▓▓▓__________▓____▓█\n");
			w("______█▀___▄█▓▓▓▓▓▓▓▓▓▓▓▓________▓_______██▓▓▓▓▓▓▓▓▓__________▓___▓██\n");
			w("_________▄█▓▓▓▓▓▓▓▓█████▓▓______________██▓▓▓▓██▀▀▀▓__________▓___▓▓▓█\n");
			w("_______▄█▓▓▓▓▓▓███▓███▓▓__▓____________█▓██▀▀▀_________________▓___▓▒▓▓█\n");
			w("_____▄█▓▓▓▓▓███▒▒▓██▓██▓______________█▀▀__▓▓▓▓▓▓▓___________▓___▓▒▒▓▓█\n");
			w("____██▓▓▓███▒▒▒▒▓██▓▓██▓_______________▓▓▓▓██████▓▓▀______▓_____▓▒▒▒▓▓█\n");
			w("___█▓▓████▒▒▒▒▒▓██▓▓▒██▓____________▓▓███▒▒▓▓▓▓██▓_____________▓▒▒▒▒▓▓█\n");
			w("__█▓█▀_██▒▒▒▒▒▒▓██▓▒▒██▓__________▓▓██▒▒▒▒▓▓▓▓▓██▓▄▀_________▓▓▓▒▒▒▓▓█\n");
			w("_██____██▒▒▒▒▒▒▓██▒▒▓▓█▓▓________▓▓██▓▒▒▒▓▓▓▓▓▓██▓__________▓█▓▓▒▒▒▒▓█\n");
			w("▀_____██▒▒▒▒▒▒▒▓██▒▒▓▓█▓▓_______▓▓██▓▓▓▒▒▒▓▓▓▓██▓▄▄▀______▓_█▓▓▒▒▒▒▓▓█\n");
			w("_____██▒▒▒▒▒▒▒▒▓██▒▒▓▓█▓▓▓____▓▓██▓▓▓▓▒▒▒▒▓▓▓██▓____________█▓▓▒▒▒▒▒▓█\n");
			w("_____██▒▒▒▒▒▒▒▒▓██▒▒▒▓██████▓▓▓██▓▓▓▒▒▒▒▒▓▓▓██▓___________█▓▓▓▒▒▒▒▒▓▓█\n");
			w("____██▒▒▒▒▒▒▒▒▒▓██▒▓▓██▓▓▓▓▓████▓▓▓▒▒▒▒▒▓▓▓██▓___________█▓▓▓▒▒▒▒▒▒▓▓█\n");
			w("____█▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓█▓▓______▓▓█▓▓▒▒▒▒▒▓▓▓▓██▓___________█▓▓▓▓▒▒▒▒▒▓▓█\n");
			w("___█▒▒▒▒▒▒▒▒▒▒▒▓▓█▓▓██▓_______▓▓█▓▓▒▒▒▒▓▓▓▓██▓___________█▓▓▓▓█▒▒▒▒▒▓▓█\n");
			w("___█▒▒▒▒▒▒█▒▒▒▒▓▓▓▓▓▓__________▓▓█▓▒▒▒▒▓▓▓▓██▓___________█▓▓▓▓█▒▒▒▒▒█▓▓█\n");
			w("__█▒▒▒▒▒▒█▒▒▒▒▓▓▓▓____▄▄___▄___▓▓██▒▒▒▒▓▓███▓____________█▓▓▓██▒▒▒▒▒██▓█\n");
			w("__█▒▒▒▒▒██▒▒▒▓▓▓▓▓▓________█▐___▓▓████████▓▓____________█▓▓▓█_█▒█▒▒▒█_█▓█\n");
			w("__█▒▒▒██_█▒▒▒▓▓▓▓▓▓▓▓▓▄▄▄▀_▐____▓▓▓▓███▓▓_________▓▓▓▓█▓▓█_█▒▒█▒▒▒█__██\n");
			w("_█▒▒▒█___█▒▒▒▓▓▓▓▓▓▓▓▓▓_____▐________▓▓▓▓________▓▓▓___████___█▒▒█▒▒█____█\n");
			w("_█▒▒█____█▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▄▀_______________▓▓▓▓▓_____██______█▒▒██▒▒█____█\n");
			w("_█▒█______█▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓___________________█▒▒███▒█\n");
			w("_██_______█▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█____________________________█▒▒█_█▒█\n");
			w("_█_________█▒▒▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓█_____________________________█▒█___█▒█\n");
			w("____________█▒▓▓▓▓▓▓▓█▓▓▓▓▓██▓▓█____________________________█▒█_____██\n");
			w("____________█▒▓▓▓▓▓▓▓██▓▓▓█__███____________________________██_______█\n");
			w("_____________█▓▓▓▓▓▓▓█_█▓▓▓█___█____________________________█_________▀\n");
			w("______________█▓▓▓▓▓▓█__█▓▓▓█\n");
			w("______________█▓▓▓▓▓▓█___██▓█\n");
			w("_______________█▓▓▓▓▓█______██\n");
			w("________________█▓▓▓▓▓█_______█\n");
			w("_________________█▓▓▓▓█\n");
			w("__________________██▓▓▓█\n");
			w("____________________█▓▓▓█\n");
			w("_____________________██▓▓█\n");
			w("________________________██\n");
			w("__________________________█\n");
		}
		else if(commande.equalsIgnoreCase("ping"))
		{
			wl("Pong ! \n", Color.GREEN);
		}
		else
		
		if(commande.equalsIgnoreCase("credit"))
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
		else if(commande.equalsIgnoreCase("tutorial"))
		{
			wl("Tutoriel : \n");
			w("1: Choisissez le site dont il faut changer l'adresse avec la commande ");
			w("exploit.setCible",Color.CYAN);
			w(" 'url' \n",Color.YELLOW);
			w("2: Choisissez la nouvelle adresse de ce site avec la commande ");
			w("exploit.setredirection",Color.CYAN);
			w(" 'url' \n", Color.YELLOW);
			w("3: Choisissez le temps d'attendre entre deux envois avec ");
			w("exploit.setInterval",Color.CYAN);
			w(" 'temps' \n", Color.YELLOW);
			w("4: Lancez l'exploit afin d'effectuer les redirections avec la commande ");
			w("exploit.start \n", Color.CYAN);
			w("5: Arrêtez l'exploit afin que tout revienne à la normale avec la commande ");
			w("exploit.stop \n", Color.CYAN);
			w("6: Il est possible de forcer l'envoi avant la fin de l'intervalle avec ");
			w("exploit.forceHack \n", Color.CYAN);
			w("7: Il est également possible de relancer l'exploit après avoir modifié pendant une exécution grâce à la commande ");
			w("exploit.restart \n", Color.CYAN);
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
					wl("Les valeurs ne sont pas initialisé. Impossible d'effectuer une empoissonnement", Color.RED);
				}
			}
			else
			{
				wl("L'expoit n'est pas en fonctionnement. Impossible de forcé l'introduction des données.", Color.RED);
			}
		}
		else if(commande.equalsIgnoreCase("exploit.start"))
		{
			if(Exploit.isOn())
				wl("L'exploit est déjà en cours d'exécution", Color.ORANGE);
			else
				wl("Démarage de l'exploit", Color.GREEN);
			Exploit.start();
		}
		else if(commande.equalsIgnoreCase("clear"))
		{
			BaseWindows.hackerScreen.setText("");
			BaseWindows.writeOnScreen("Bienvenu sur HackOs.\n", false, Color.CYAN);
			BaseWindows.writeOnScreen("Taper \"help\" pour plus de renseignement ou \"tutorial\" pour une description de la procédure\n");
		}
		else if(commande.equalsIgnoreCase("exploit.stop"))
		{
			if(Exploit.isOff())
				wl("L'exploit est déjà éteind", Color.ORANGE);
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
			wl("Démarage de l'exploit", Color.GREEN);
			Exploit.restart();
		}
		else if(commande.equalsIgnoreCase(""))
		{
			// do nothing. just and empty line
		}
		else // commande avec argument
		{
			if(commande.startsWith("exploit.setCible"))
			{
				if(commande.length() == "exploit.setCible".length())
				{
					afficherNoArg(commande);
				}
				else
				{
					String arg = commande.substring("exploit.setCible".length()+1);
					if(Exploit.isOn())
					{
						wl("L'exploit est déjà en cours d'exécution.", Color.ORANGE);
						wl("La Mise à jours sera effectuer au prochain lancement", Color.ORANGE);
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
						wl("La Mise à jours sera effectuer au prochain lancement", Color.ORANGE);
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
						wl("La nouvelle valeur de l'interval est désormais : '" + arg + "'", Color.GREEN);
						Exploit.setInterval(value);
					}
					catch(Exception e)
					{
						wl("Impossible de définir l'interval. assurez vous d'avoir spécifier une valeur entière.", Color.RED);
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
					
					wl("L'url \"" + arg + "\" renvois sur la page : \"" + url + "\"" , (arg.equalsIgnoreCase(url)?Color.GREEN:Color.RED));
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
					 w("	efface le terminal \n");
					wl("tutorial", Color.CYAN);
					 w("	affiche le mode d'emploi détaillé, ainsi que la procédure à suivre \n");
					 w("   > links ", Color.CYAN);
					 w("url\n", Color.YELLOW);
					 w("	Donne l'ip* correspondant a cette url sur le serveur DNS empoisonné \n");
					wl("help", Color.CYAN);
					 w("	affiche le mode d'emploi de la simulation et les commandes disponibles \n");
					 w("   > exploit.setCible ", Color.CYAN);
					 w(" urlSiteCible\n", Color.YELLOW);
					 w("	selectionne le site dont on veut changer l'IP \n");
					 w("   > exploit.setRedirection ", Color.CYAN);
					 w(" urlRedirection\n", Color.YELLOW);
					 w("	selectionne la nouvelle adresse du site cible \n");
					 w("   > exploit.setInterval", Color.CYAN);
					 w(" value\n", Color.YELLOW);
					 w("	définit le nombre d'heures entre chaque envoi de la requête de redirection \n");
					wl("exploit.forceHack", Color.CYAN);
					 w("	force le renvoi de fausses informations, nécessite que l'exploit soit démarré \n");
					wl("exploit.start", Color.CYAN);
					 w("	démarre l'exploit en prenant en compte les derniers paramètres entrés \n");
					wl("exploit.stop", Color.CYAN);
					 w("	arrête l'exploit \n");
					wl("exploit.restart", Color.CYAN);
					 w("	relance l'exploit en prenant en compte les changements de paramètres \n");
					 w("\n\n\n* Pour des raisons de simplification, l'IP est textualisée en tant qu'URL.\n");
				}
				else
				{
					String arg = commande.substring("help".length()+1);
					if(arg.equalsIgnoreCase("help"))
					{
						wl("help", Color.CYAN);
						 w("	affiche le mode d'emploi de la simulation et les commandes disponibles.\n");
						 w("Vous pouvez aussi taper ");
						 w("help ", Color.CYAN);
						 w("'nomFonction' ", Color.YELLOW);
						 w("pour obtenir plus de détails.\n");

					}
					else if(arg.equalsIgnoreCase("clear"))
					{
						wl("clear", Color.CYAN);
						 w("	efface le terminal \n");
					}
					else if(arg.equalsIgnoreCase("tutorial"))
					{
						wl("tutorial", Color.CYAN);
						 w("	affiche le mode d'emploi détaillé, ainsi que la procédure à suivre \n");
					}
					else if(arg.equalsIgnoreCase("links"))
					{
						 w("   > links ", Color.CYAN);
						 w("url\n", Color.YELLOW);
						 w("	Donne l'ip correspondant a cette url sur le serveur DNS empoisonné ");
						 w("    Noté que pour des raisons pratiques, les adresses ip utilisé ici ne seront par des suites de chiffre (");
						 w("192.168.1.1", Color.YELLOW);
						 w(") mais des adresses url (");
						 w("www.localhost.com", Color.YELLOW);
						 w(").\n");


					}
					else if(arg.equalsIgnoreCase("exploit.setCible"))
					{
						 w("   > exploit.setCible ", Color.CYAN);
						 w("urlSiteCible\n", Color.YELLOW);
						 w("	selectionne le site dont on veut changer l'IP \n");
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
						 w("	Une fois exécuté, les données sont ajouté dans le cache du serveur DNS jusqu'a suppression de ces dernières\n");
					}
					else if(arg.equalsIgnoreCase("exploit.start"))
					{
						wl("exploit.start", Color.CYAN);
						 w("	démarre l'exploit en prenant en compte les derniers paramètres entrés \n");
						 w("	Si des valeurs ont été modifier, alors elles seront mise à jour.\n");
					}
					else if(arg.equalsIgnoreCase("exploit.stop"))
					{
						wl("exploit.stop", Color.CYAN);
						 w("	arrête l'exploit \n");
						 w("	Une fois dans cette état, tous modification aura lieu sans encombre.\n");
						 w("	De plus les données ne seront pas re injecté dans les serveurs DNS, et finiront pas disparaitre.\n");


					}
					else if(arg.equalsIgnoreCase("exploit.restart"))
					{
						wl("exploit.restart", Color.CYAN);
						 w("	relance l'exploit en prenant en compte les éventuels changements de paramètres \n");
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
		w(" n'as pas les arguments nécessaire.\n", Color.RED);
		w("	Essayer ", Color.RED);
		w("help ", Color.CYAN );
		w(commande + " ", Color.YELLOW);
		w("pour plus de détails", Color.RED);

	}
}

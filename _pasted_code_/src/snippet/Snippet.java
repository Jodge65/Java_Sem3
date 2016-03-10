package snippet;

public class Snippet
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


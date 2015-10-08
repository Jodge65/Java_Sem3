package fr.iutbay.joey.TP4;

public class Main
{
	public static void main (String[] arg)
	{
		FeuilleDeCalcul tab1 = new FeuilleDeCalcul("Tab 001");
		
		tab1.addCellule("A1", new Cellule(5.0D));
		tab1.addCellule("A2", new Cellule(2.0D));
		tab1.addCellule("A3", new CelluleFormule("A1+A2", tab1));
		tab1.addCellule("A4", new CelluleFormule("A1-A2", tab1));
		tab1.addCellule("A5", new CelluleFormule("A1*A2", tab1));
		tab1.addCellule("A6", new CelluleFormule("A1/A2", tab1));
		
		tab1.afficher();

	}
}

package fr.jodge.skillEditor.main;

import fr.jodge.skillEditor.attribut.Element;

public class Main
{

	public static void main(String[] args)
	{
		Element un = new Element();
		un.addElementFire(5.0F);
		System.out.println(un.getDamageFireVsWater());
	}

}

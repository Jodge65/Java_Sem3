package fr.iutbay.joey.base;

import java.util.ArrayList;
import java.util.List;

public class ChampDeBatail
{
	public List<CharBase> tank = new ArrayList<CharBase>();
	
	ChampDeBatail(CharBase... arg)
	{
		for(CharBase i : arg)
		{
			tank.add(i);
		}
		trierIni();
	}
	
	public void trierIni()
	{
		int nbTank = tank.size();
		int tankPos;
		for (int x = 0; x < nbTank; x++)
		{
			tankPos = x;

			for(int y = x + 1; y < nbTank; y++)
			{
				if(tank.get(y).getInitiative() < tank.get(tankPos).getInitiative())
					tankPos = y;	
			}
			CharBase tempsTank = tank.get(tankPos);
			tank.set(tankPos, tank.get(x));
			tank.set(x, tempsTank);
			
		}
	}
	
	@Override
	public String toString()
	{
		return "ChampDeBatail [tank=" + tank + "]";
	}


	

	
	
		
}

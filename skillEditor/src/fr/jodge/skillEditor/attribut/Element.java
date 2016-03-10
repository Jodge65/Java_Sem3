package fr.jodge.skillEditor.attribut;

import java.util.HashMap;
import java.util.Map;

public class Element
{
	public final static int FIRE = 1;
	public final static int WATER = 2;
	public final static int WIND = 3;
	public final static int DIRT = 4;
	public final static int WOOD = 5;
	public final static int THUNDER = 6;
	public final static int HOLY = 7;
	public final static int DARK = 8;
	
	public final static float[][] RESISTANCE_MATRIX = {
		  /*  ATK \ DEF  Fire   Water  Wind   Dirt   Wood   Thund  Holy   Dark */
	      /* Fire  */  { 0.75F, 0.50F, 1.50F, 1.00F, 1.00F, 1.00F, 1.00F, 1.00F },
	      /* Water */  { 1.50F, 0.75F, 1.00F, 1.00F, 1.00F, 1.00F, 1.00F, 1.00F },
	      /* Wind  */  { 0.50F, 1.00F, 0.75F, 1.00F, 1.00F, 1.00F, 1.00F, 1.00F },
	      /* Dirt  */  { 1.00F, 1.00F, 1.00F, 0.75F, 1.00F, 1.00F, 1.00F, 1.00F },
	      /* Wood  */  { 1.00F, 1.00F, 1.00F, 1.00F, 0.75F, 1.00F, 1.00F, 1.00F },
	      /* Thund */  { 1.00F, 1.00F, 1.00F, 1.00F, 1.00F, 0.75F, 1.00F, 1.00F },
	      /* Holy  */  { 1.00F, 1.00F, 1.00F, 1.00F, 1.00F, 1.00F, 0.75F, 1.00F },
	      /* Dark  */  { 1.00F, 1.00F, 1.00F, 1.00F, 1.00F, 1.00F, 1.00F, 0.75F }
	                        };
	
	public Map<String, Float> value;
	
	public Element()
	{
		value = new HashMap<String, Float>();
	}
	public Element(float fire, float water, float wind, float dirt, float wood, float thunder, float holy, float dark)
	{
		this();
		addElementFire(fire);
		addElementWater(water);
		addElementWind(wind);
		addElementDirt(dirt);
		addElementWood(wood);
		addElementThunder(thunder);
		addElementHoly(holy);
		addElementDark(dark);
	}
	
// damageCalculation --------------------------------------------------------------------------------------------------	
	public Float getDamageVs(int keyAtk, int keyDef)
	{
		System.out.println();
		return value.get(getKey(keyAtk)) * RESISTANCE_MATRIX[keyAtk][keyDef];
	}
	public Float getDamageVsFire(int keyAtk){return getDamageVs(keyAtk, FIRE);}
	public Float getDamageVsWater(int keyAtk){return getDamageVs(keyAtk, WATER);}
	public Float getDamageVsWind(int keyAtk){return getDamageVs(keyAtk, WIND);}
	public Float getDamageVsDirt(int keyAtk){return getDamageVs(keyAtk, DIRT);}
	public Float getDamageVsWood(int keyAtk){return getDamageVs(keyAtk, WOOD);}
	public Float getDamageVsThunder(int keyAtk){return getDamageVs(keyAtk, THUNDER);}
	public Float getDamageVsHoly(int keyAtk){return getDamageVs(keyAtk, HOLY);}
	public Float getDamageVsDark(int keyAtk){return getDamageVs(keyAtk, DARK);}

	public Float getDamageFireVsFire(){return getDamageVs(FIRE, FIRE);}
	public Float getDamageFireVsWater(){return getDamageVs(FIRE, WATER);}
	public Float getDamageFireVsWind(){return getDamageVs(FIRE, WIND);}
	public Float getDamageFireVsDirt(){return getDamageVs(FIRE, DIRT);}
	public Float getDamageFireVsWood(){return getDamageVs(FIRE, WOOD);}
	public Float getDamageFireVsThunder(){return getDamageVs(FIRE, THUNDER);}
	public Float getDamageFireVsHoly(){return getDamageVs(FIRE, HOLY);}
	public Float getDamageFireVsDark(){return getDamageVs(FIRE, DARK);}

	public Float getDamageWaterVsFire(){return getDamageVs(WATER, FIRE);}
	public Float getDamageWaterVsWater(){return getDamageVs(WATER, WATER);}
	public Float getDamageWaterVsWind(){return getDamageVs(WATER, WIND);}
	public Float getDamageWaterVsDirt(){return getDamageVs(WATER, DIRT);}
	public Float getDamageWaterVsWood(){return getDamageVs(WATER, WOOD);}
	public Float getDamageWaterVsThunder(){return getDamageVs(WATER, THUNDER);}
	public Float getDamageWaterVsHoly(){return getDamageVs(WATER, HOLY);}
	public Float getDamageWaterVsDark(){return getDamageVs(WATER, DARK);}
	
	public Float getDamageWindVsFire(){return getDamageVs(WIND, FIRE);}
	public Float getDamageWindVsWater(){return getDamageVs(WIND, WATER);}
	public Float getDamageWindVsWind(){return getDamageVs(WIND, WIND);}
	public Float getDamageWindVsDirt(){return getDamageVs(WIND, DIRT);}
	public Float getDamageWindVsWood(){return getDamageVs(WIND, WOOD);}
	public Float getDamageWindVsThunder(){return getDamageVs(WIND, THUNDER);}
	public Float getDamageWindVsHoly(){return getDamageVs(WIND, HOLY);}
	public Float getDamageWindVsDark(){return getDamageVs(WIND, DARK);}
	
	public Float getDamageDirtVsFire(){return getDamageVs(DIRT, FIRE);}
	public Float getDamageDirtVsWater(){return getDamageVs(DIRT, WATER);}
	public Float getDamageDirtVsWind(){return getDamageVs(DIRT, WIND);}
	public Float getDamageDirtVsDirt(){return getDamageVs(DIRT, DIRT);}
	public Float getDamageDirtVsWood(){return getDamageVs(DIRT, WOOD);}
	public Float getDamageDirtVsThunder(){return getDamageVs(DIRT, THUNDER);}
	public Float getDamageDirtVsHoly(){return getDamageVs(DIRT, HOLY);}
	public Float getDamageDirtVsDark(){return getDamageVs(DIRT, DARK);}
	
	public Float getDamageWoodVsFire(){return getDamageVs(WOOD, FIRE);}
	public Float getDamageWoodVsWater(){return getDamageVs(WOOD, WATER);}
	public Float getDamageWoodVsWind(){return getDamageVs(WOOD, WIND);}
	public Float getDamageWoodVsDirt(){return getDamageVs(WOOD, DIRT);}
	public Float getDamageWoodVsWood(){return getDamageVs(WOOD, WOOD);}
	public Float getDamageWoodVsThunder(){return getDamageVs(WOOD, THUNDER);}
	public Float getDamageWoodVsHoly(){return getDamageVs(WOOD, HOLY);}
	public Float getDamageWoodVsDark(){return getDamageVs(WOOD, DARK);}
	
	public Float getDamageThunderVsFire(){return getDamageVs(THUNDER, FIRE);}
	public Float getDamageThunderVsWater(){return getDamageVs(THUNDER, WATER);}
	public Float getDamageThunderVsWind(){return getDamageVs(THUNDER, WIND);}
	public Float getDamageThunderVsDirt(){return getDamageVs(THUNDER, DIRT);}
	public Float getDamageThunderVsWood(){return getDamageVs(THUNDER, WOOD);}
	public Float getDamageThunderVsThunder(){return getDamageVs(THUNDER, THUNDER);}
	public Float getDamageThunderVsHoly(){return getDamageVs(THUNDER, HOLY);}
	public Float getDamageThunderVsDark(){return getDamageVs(THUNDER, DARK);}
	
	public Float getDamageHolyVsFire(){return getDamageVs(HOLY, FIRE);}
	public Float getDamageHolyVsWater(){return getDamageVs(HOLY, WATER);}
	public Float getDamageHolyVsWind(){return getDamageVs(HOLY, WIND);}
	public Float getDamageHolyVsDirt(){return getDamageVs(HOLY, DIRT);}
	public Float getDamageHolyVsWood(){return getDamageVs(HOLY, WOOD);}
	public Float getDamageHolyVsThunder(){return getDamageVs(HOLY, THUNDER);}
	public Float getDamageHolyVsHoly(){return getDamageVs(HOLY, HOLY);}
	public Float getDamageHolyVsDark(){return getDamageVs(HOLY, DARK);}
	
	public Float getDamageDarkVsFire(){return getDamageVs(DARK, FIRE);}
	public Float getDamageDarkVsWater(){return getDamageVs(DARK, WATER);}
	public Float getDamageDarkVsWind(){return getDamageVs(DARK, WIND);}
	public Float getDamageDarkVsDirt(){return getDamageVs(DARK, DIRT);}
	public Float getDamageDarkVsWood(){return getDamageVs(DARK, WOOD);}
	public Float getDamageDarkVsThunder(){return getDamageVs(DARK, THUNDER);}
	public Float getDamageDarkVsHoly(){return getDamageVs(DARK, HOLY);}
	public Float getDamageDarkVsDark(){return getDamageVs(DARK, DARK);}
	
// addElement --------------------------------------------------------------------------------------------------
	public Element addElementFire(float value){return addElement(getKey(FIRE), value);}
	public Element addElementWater(float value){return addElement(getKey(WATER), value);}
	public Element addElementWind(float value){return addElement(getKey(WIND), value);}
	public Element addElementDirt(float value){return addElement(getKey(DIRT), value);}
	public Element addElementWood(float value){return addElement(getKey(WOOD), value);}
	public Element addElementThunder(float value){return addElement(getKey(THUNDER), value);}
	public Element addElementHoly(float value){return addElement(getKey(HOLY), value);}
	public Element addElementDark(float value){return addElement(getKey(DARK), value);}
	public Element addElement(int key, float value)
	{
		return addElement(getKey(key), value);		
	}
	protected Element addElement(String key, float value)
	{
		if(key != null)
		{
			this.value.put(key, value);
		}
		return this;
	}

// getElement --------------------------------------------------------------------------------------------------
	public Float getElementFire(float value){return getElement(getKey(FIRE), value);}
	public Float getElementWater(float value){return getElement(getKey(WATER), value);}
	public Float getElementWind(float value){return getElement(getKey(WIND), value);}
	public Float getElementDirt(float value){return getElement(getKey(DIRT), value);}
	public Float getElementWood(float value){return getElement(getKey(WOOD), value);}
	public Float getElementThunder(float value){return getElement(getKey(THUNDER), value);}
	public Float getElementHoly(float value){return getElement(getKey(HOLY), value);}
	public Float getElementDark(float value){return getElement(getKey(DARK), value);}
	public Float getElement(int key, float value)
	{
		return getElement(getKey(key), value);		
	}
	protected Float getElement(String key, float value)
	{
		if(key != null)
		{
			return this.value.get(key);
		}
		return  0.0F;
	}
	
// key --------------------------------------------------------------------------------------------------
	public static String getKey(int keyWord)
	{
		String key;
		switch(keyWord)
		{
			case 1: key = "fire"; break;
			case 2: key = "water"; break;
			case 3: key = "wind"; break;	
			case 4: key = "dirt"; break;			
			case 5: key = "wood"; break;			
			case 6: key = "thunder"; break;
			case 7: key = "holy"; break;	
			case 8: key = "dark"; break;	
			default: key = null; break;
		}
		return key;
	}
	
	


}

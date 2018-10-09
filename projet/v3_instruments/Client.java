package v3_instruments;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/**
 * Classe de test de l'inventaire, en interaction avec le client, permettant la recherche d'instruments
 * @author Groupe de Carmenou
 *
 */
public class Client {
	
	/**
	 * Fonction main, seule fonction test du programme
	 * @param args
	 * 			Chaîne de caractères non utilisée.
	 */
	public static void main(String[] args) {
	    
		// Set up Rick's guitar inventory
	    Inventory inventory = new Inventory();
	    initializeInventory(inventory);	    
	    
	    //System.out.println("\nL'inventaire complet :\n"+inventory.toString()) ;
	    
	    
	    HashMap propRecherchees = new HashMap() ;
		propRecherchees.put("instrument type", InstrumentType.GUITAR) ;
		InstrumentSpec recherche = new InstrumentSpec (propRecherchees) ; 
	    List<Instrument> listeRes = inventory.search(recherche) ;
	    
	    System.out.println("#######################################\n#######################################\n\n");
	    
	    if (listeRes.isEmpty()) {
	    	System.out.println("Malheureusement nous n'avons pas d'instrument pour vous.") ;
	    }
	    
	    else {
	    	System.out.println("Voici ce que nous avons pour vous :\n");
	    	for (Instrument i : listeRes) {
		    	System.out.println(i.toString() + "------------------\n") ;
		    }
	    }
	    
	  }
	
	
	/**
	 * Méthode qui initialise l'inventaire créé dans le main en créant des instruments ajoutés au fur et à mesure
	 * @param inventory
	 * 				Inventaire auquel on ajoute différents instruments
	 */
	public static void initializeInventory(Inventory inventory) {
		HashMap prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.GUITAR) ;
		inventory.addInstrument("4500000", 199.99, new InstrumentSpec(prop));
		
		prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.MANDOLIN) ;
		prop.put("style", Style.A) ;
		prop.put("back wood", Wood.ADIRONDACK) ;
		prop.put("top wood", Wood.ADIRONDACK) ;
		inventory.addInstrument("5A8BCC", 1990.99, new InstrumentSpec(prop));
		
		prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.MANDOLIN) ;
		prop.put("style", Style.F) ;
		prop.put("back wood", Wood.ADIRONDACK) ;
		prop.put("top wood", Wood.BRAZILIAN_ROSEWOOD) ;
		inventory.addInstrument("5ACD28C", 990.99, new InstrumentSpec(prop));
		
		prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.GUITAR) ;
		prop.put("type",Type.ACOUSTIC) ;
		prop.put("back wood", Wood.ADIRONDACK) ;
		prop.put("top wood", Wood.BRAZILIAN_ROSEWOOD) ;
		inventory.addInstrument("5ADDD28C", 999.99, new InstrumentSpec(prop));
		
		prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.VIOLON) ;
		prop.put("type",Type.ACOUSTIC) ;
		prop.put("back wood", Wood.ADIRONDACK) ;
		prop.put("top wood", Wood.BRAZILIAN_ROSEWOOD) ;
		inventory.addInstrument("5ADD55D28C", 99.99, new InstrumentSpec(prop));
		
		prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.BANJO) ;
		prop.put("type",Type.ACOUSTIC) ;
		prop.put("back wood", Wood.SITKA) ;
		prop.put("top wood", Wood.ALDER) ;
		inventory.addInstrument("5ADC", 899.99, new InstrumentSpec(prop));
	}
}

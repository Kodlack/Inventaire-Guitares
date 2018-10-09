package v3_instruments;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * Classe représentant un inventaire d'instruments
 * @author Groupe de Carmenou
 *
 */
public class Inventory {
	
	/**
	 * Liste des instruments contenus dans l'inventaire
	 */
	private List<Instrument> instruments;

	/**
	 * Constructeur de l'inventaire qui instancie la liste
	 */
	public Inventory() {
		instruments = new LinkedList<Instrument>();
	}

	/**
	 * Méthode qui ajoute un instrument à l'inventaire
	 * @param serialNumber
	 * 				Numéro de série de l'instrument à ajouter
	 * @param price
	 * 				Prix de l'instrument à ajouter
	 * @param spec
	 * 				Spécifications de l'instrument à ajouter
	 */
  	public void addInstrument(String serialNumber, double price,
                        InstrumentSpec spec) {
  		instruments.add(new Instrument(serialNumber, price, spec)) ;
	}

  	
  	/**
  	 * Méthode qui récupère l'instrument correspondant au numéro de série donné
  	 * @param serialNumber
  	 * 				Numéro de série de l'instrument recherché
  	 * @return
  	 * 				Soit l'instrument s'il est trouvé, null sinon
  	 */
  	public Instrument getInstrument(String serialNumber) {
  		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
	      
  			Instrument instrument = (Instrument) i.next();
	      
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
	    
		return null;
  	}

  	
  	
  	/**
  	 * Méthode qui recherche tous les instruments dont les spécifications correspondent à celles recherchées
  	 * @param searchInstrumentSpec
  	 * 				Spécifications recherchées
  	 * @return
  	 * 				La liste des instruments correspondants
  	 */
	public List<Instrument> search(InstrumentSpec searchInstrumentSpec) {
		 List<Instrument> matchingInstruments = new LinkedList<Instrument>();
	    
		 for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
			  Instrument instrument = (Instrument) i.next();
			
			  if (instrument.getSpec().matches(searchInstrumentSpec)) {
				  matchingInstruments.add(instrument);
						  //Si les spécifications sont les mêmes alors on ajoute l'instrument à la liste
			  }
		 }
			
		 return matchingInstruments;
	}
	  
	/**
	 * Méthode qui transforme l'inventaire en une chaîne de caractères affichable
	 * @return La chaîne de caractères correspondante  
	 */
	public String toString() {
		String affichage = new String() ;
			  
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext() ;) {
				  affichage+="\n----------------\n"+i.next().toString() ;
		}
		
		if (instruments.isEmpty()) {
			affichage = "Inventaire vide.\n" ;
		}
			  
		return affichage ;
	}
	
}

package v3_instruments;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * Classe repr�sentant un inventaire d'instruments
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
	 * M�thode qui ajoute un instrument � l'inventaire
	 * @param serialNumber
	 * 				Num�ro de s�rie de l'instrument � ajouter
	 * @param price
	 * 				Prix de l'instrument � ajouter
	 * @param spec
	 * 				Sp�cifications de l'instrument � ajouter
	 */
  	public void addInstrument(String serialNumber, double price,
                        InstrumentSpec spec) {
  		instruments.add(new Instrument(serialNumber, price, spec)) ;
	}

  	
  	/**
  	 * M�thode qui r�cup�re l'instrument correspondant au num�ro de s�rie donn�
  	 * @param serialNumber
  	 * 				Num�ro de s�rie de l'instrument recherch�
  	 * @return
  	 * 				Soit l'instrument s'il est trouv�, null sinon
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
  	 * M�thode qui recherche tous les instruments dont les sp�cifications correspondent � celles recherch�es
  	 * @param searchInstrumentSpec
  	 * 				Sp�cifications recherch�es
  	 * @return
  	 * 				La liste des instruments correspondants
  	 */
	public List<Instrument> search(InstrumentSpec searchInstrumentSpec) {
		 List<Instrument> matchingInstruments = new LinkedList<Instrument>();
	    
		 for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
			  Instrument instrument = (Instrument) i.next();
			
			  if (instrument.getSpec().matches(searchInstrumentSpec)) {
				  matchingInstruments.add(instrument);
						  //Si les sp�cifications sont les m�mes alors on ajoute l'instrument � la liste
			  }
		 }
			
		 return matchingInstruments;
	}
	  
	/**
	 * M�thode qui transforme l'inventaire en une cha�ne de caract�res affichable
	 * @return La cha�ne de caract�res correspondante  
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

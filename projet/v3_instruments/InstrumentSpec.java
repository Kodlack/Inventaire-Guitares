package v3_instruments;

import java.util.Iterator;
import java.util.Map;


/**
 * Classe des spécifications d'un instrument
 * @author Groupe de Carmenou
 *
 */
@SuppressWarnings("rawtypes")
public class InstrumentSpec {

	/**
	 * L'ensemble des propriétés de l'instrument, regroupées dans une Map 
	 */
	protected Map<String, Comparable> properties ;
	
	
	/**
	 * Constructeur de la classe
	 * @param parProperties
	 * 					Propriétés données par le créateur de l'instrument
	 */
	public InstrumentSpec (Map<String, Comparable> parProperties) {
		 properties = parProperties ;
	  }
	
	/**
	 * Méthode qui compare deux instruments (l'appelant et celui donné en paramètre)  
	 * @param spec
	 * 				Spécifications de l'instrument appelé
	 * @return
	 * 				True si les deux instruments sont identiques, False sinon
	 */
	public boolean matches(InstrumentSpec spec) {
		for (Iterator i = spec.getProperties().keySet().iterator(); i.hasNext(); ) {
			String key = (String) i.next() ;
			if (!this.getProperties().containsKey(key) || !this.getProperties().get(key).equals(spec.getProperties().get(key))) {
				return false ;
			}
		}
		return true ;
	  }
	  
	/**
	 * Méthode récupérant les propriétés de l'instrument appelant  
	 * @return
	 * 			La Map, c'est-à-dire l'ensemble des propriétés
	 */
	public Map<String, Comparable> getProperties() {
		return properties;
	}


		    
	/**
	 * Méthode qui convertit les propriétés en une chaîne de caractères, facilitant l'affichage des spécifications	  
	 * @return la chaîne de caractères
	 */
	public String toString() {
		String affichage = new String() ;
		for (Iterator i = getProperties().keySet().iterator(); i.hasNext();){
			String key = (String) i.next() ;
			affichage += key + " : " + getProperties().get(key) + "\n" ;
		}
		
		return affichage ;
	}

}

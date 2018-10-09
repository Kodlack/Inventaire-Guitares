package v3_instruments;

import java.util.Iterator;
import java.util.Map;


/**
 * Classe des sp�cifications d'un instrument
 * @author Groupe de Carmenou
 *
 */
@SuppressWarnings("rawtypes")
public class InstrumentSpec {

	/**
	 * L'ensemble des propri�t�s de l'instrument, regroup�es dans une Map 
	 */
	protected Map<String, Comparable> properties ;
	
	
	/**
	 * Constructeur de la classe
	 * @param parProperties
	 * 					Propri�t�s donn�es par le cr�ateur de l'instrument
	 */
	public InstrumentSpec (Map<String, Comparable> parProperties) {
		 properties = parProperties ;
	  }
	
	/**
	 * M�thode qui compare deux instruments (l'appelant et celui donn� en param�tre)  
	 * @param spec
	 * 				Sp�cifications de l'instrument appel�
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
	 * M�thode r�cup�rant les propri�t�s de l'instrument appelant  
	 * @return
	 * 			La Map, c'est-�-dire l'ensemble des propri�t�s
	 */
	public Map<String, Comparable> getProperties() {
		return properties;
	}


		    
	/**
	 * M�thode qui convertit les propri�t�s en une cha�ne de caract�res, facilitant l'affichage des sp�cifications	  
	 * @return la cha�ne de caract�res
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

package v3_instruments;


/**
 * Enumération des différents types d'instruments possibles
 * @author Groupe de Carmenou
 *
 */
public enum InstrumentType {
	GUITAR, MANDOLIN, BANJO, VIOLON ;
	
	
	 /**
	   * Méthode qui renvoie le texte correspondant à chaque type possible
	   */
	public String toString() {
		switch (this) {
			case GUITAR: return "Guitar" ;
			case MANDOLIN: return "Mandolin" ;
			case BANJO: return "Banjo" ;
			case VIOLON: return "Violon" ;
			default: return "Unspecified" ;
		}
	}
}

package v3_instruments;


/**
 * Enum�ration des diff�rents types d'instruments possibles
 * @author Groupe de Carmenou
 *
 */
public enum InstrumentType {
	GUITAR, MANDOLIN, BANJO, VIOLON ;
	
	
	 /**
	   * M�thode qui renvoie le texte correspondant � chaque type possible
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

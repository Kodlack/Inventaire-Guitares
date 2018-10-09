package v3_instruments;


/**
 * Enum�ration des diff�rents styles de Mandolines existants
 * @author Groupe de Carmenou
 *
 */
public enum Style {
	A, F ;
	
	/**
	   * M�thode qui renvoie le texte correspondant � chaque type possible
	   */
	 public String toString() {
		    switch(this) {
		    case A: return "Amande" ;
		    case F: return "Floentine" ;
		    default: return "Unspecified" ;
		    }
	 }
}

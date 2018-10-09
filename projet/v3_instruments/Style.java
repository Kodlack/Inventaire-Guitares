package v3_instruments;


/**
 * Enumération des différents styles de Mandolines existants
 * @author Groupe de Carmenou
 *
 */
public enum Style {
	A, F ;
	
	/**
	   * Méthode qui renvoie le texte correspondant à chaque type possible
	   */
	 public String toString() {
		    switch(this) {
		    case A: return "Amande" ;
		    case F: return "Floentine" ;
		    default: return "Unspecified" ;
		    }
	 }
}

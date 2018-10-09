package v3_instruments;

/**
 * Enumération regroupant les différents types (acoustique ou électrique)
 * @author mprevot
 *
 */
public enum Type { 

  ACOUSTIC, ELECTRIC;
  
  /**
   * Méthode qui renvoie le texte correspondant à chaque type possible
   */
  public String toString() {
    switch(this) {
      case ACOUSTIC: return "acoustic";
      case ELECTRIC: return "electric";
      default:       return "unspecified";
    }
  }
}

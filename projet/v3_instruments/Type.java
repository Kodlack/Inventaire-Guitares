package v3_instruments;

/**
 * Enum�ration regroupant les diff�rents types (acoustique ou �lectrique)
 * @author mprevot
 *
 */
public enum Type { 

  ACOUSTIC, ELECTRIC;
  
  /**
   * M�thode qui renvoie le texte correspondant � chaque type possible
   */
  public String toString() {
    switch(this) {
      case ACOUSTIC: return "acoustic";
      case ELECTRIC: return "electric";
      default:       return "unspecified";
    }
  }
}

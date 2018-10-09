package v3_instruments;

/**
 * Enumération de différents constructeurs d'instruments
 * @author Groupe de Carmenou
 *
 */
public enum Builder { 

  FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

  /**
   * Méthode qui renvoie le texte correspondant à chaque constructeur possible
   */
  public String toString() {
    switch(this) {
      case FENDER:   return "Fender";
      case MARTIN:   return "Martin";
      case GIBSON:   return "Gibson";
      case COLLINGS: return "Collings";
      case OLSON:    return "Olson";
      case RYAN:     return "Ryan";
      case PRS :     return "PRS";
      default:       return "Unspecified";
    }
  }
}

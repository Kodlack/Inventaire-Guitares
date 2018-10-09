package v3_instruments;

/**
 * Enum�ration de diff�rents constructeurs d'instruments
 * @author Groupe de Carmenou
 *
 */
public enum Builder { 

  FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

  /**
   * M�thode qui renvoie le texte correspondant � chaque constructeur possible
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

package v3_instruments;

/**
 * Enumération regroupant les différents bois possibles
 * @author mprevot
 *
 */
public enum Wood { 

  INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
  COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

  
  /**
   * Méthode qui renvoie le texte correspondant à chaque type possible
   */
  public String toString() {
    switch(this) {
      case INDIAN_ROSEWOOD:    return "Indian Rosewood";
      case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
      case MAHOGANY:           return "Mahogany";
      case MAPLE:              return "Maple";
      case COCOBOLO:           return "Cocobolo";
      case CEDAR:              return "Cedar";
      case ADIRONDACK:         return "Adirondack";
      case ALDER:              return "Alder";
      case SITKA:              return "Sitka";
      default:  return "unspecified";
    }
  }
}

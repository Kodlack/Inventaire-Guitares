package v3_instruments;

/**
 * Classe représentant un instrument de manière générale
 * 
 * @author Groupe Carmenou
 *
 */
public class Instrument {
	
	/**
	 * Le numéro de série de l'instument
	 */
	private String serialNumber;
	
	/**
	 * Le prix de l'instrument
	 */
	private double price;
	
	/**
	 * Les spécifications de l'instrument
	 * 
	 * @see InstrumentSpec
	 */
	private InstrumentSpec instrumentSpec ;
	
	
	/**
	 * Constructeur de la classe Instrument
	 * @param serialNumber
	 * 					le numéro de série de l'instrument à créer
	 * @param price
	 * 					son prix
	 * @param spec
	 * 					ses spécifications
	 */
	public Instrument(String serialNumber, double price,
                InstrumentSpec spec) {
		this.serialNumber = serialNumber;
	    this.price = price;
	    this.instrumentSpec = spec ;
		
	}
	
	
	/**
	 * Renvoie le numéro de série
	 * @return le numéro de série
	 */
	  public String getSerialNumber() {
	    return serialNumber;
	  }
	  
	  /**
		 * Renvoie le prix
		 * @return le prix
		 */
	  public double getPrice() {
	    return price;
	  }
	  
	  /**
	   * Modifie le prix de l'instrument appelant
	   * @param newPrice 
	   * 				Nouveau prix de l'instrument
	   */
	  public void setPrice(float newPrice) {
	    this.price = newPrice;
	  }
	  
	  
	  /**
	   * Donne les spécifications de l'instrument appelant
	   * @return les spécifications
	   */
	  public InstrumentSpec getSpec () {
		  return instrumentSpec ;
	  }
	  
	  
	  /**
	   * Méthode transcrivant l'instrument en chaîne de caractères, permettant son affichage
	   * @return la chaîne de caractères correspondante
	   * @see InstrumentSpec
	   */
	  public String toString() {

	      return getSpec().toString() + "Price : $" + getPrice() + "\n\n" ;

	  }
}

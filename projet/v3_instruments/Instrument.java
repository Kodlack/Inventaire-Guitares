package v3_instruments;

/**
 * Classe repr�sentant un instrument de mani�re g�n�rale
 * 
 * @author Groupe Carmenou
 *
 */
public class Instrument {
	
	/**
	 * Le num�ro de s�rie de l'instument
	 */
	private String serialNumber;
	
	/**
	 * Le prix de l'instrument
	 */
	private double price;
	
	/**
	 * Les sp�cifications de l'instrument
	 * 
	 * @see InstrumentSpec
	 */
	private InstrumentSpec instrumentSpec ;
	
	
	/**
	 * Constructeur de la classe Instrument
	 * @param serialNumber
	 * 					le num�ro de s�rie de l'instrument � cr�er
	 * @param price
	 * 					son prix
	 * @param spec
	 * 					ses sp�cifications
	 */
	public Instrument(String serialNumber, double price,
                InstrumentSpec spec) {
		this.serialNumber = serialNumber;
	    this.price = price;
	    this.instrumentSpec = spec ;
		
	}
	
	
	/**
	 * Renvoie le num�ro de s�rie
	 * @return le num�ro de s�rie
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
	   * Donne les sp�cifications de l'instrument appelant
	   * @return les sp�cifications
	   */
	  public InstrumentSpec getSpec () {
		  return instrumentSpec ;
	  }
	  
	  
	  /**
	   * M�thode transcrivant l'instrument en cha�ne de caract�res, permettant son affichage
	   * @return la cha�ne de caract�res correspondante
	   * @see InstrumentSpec
	   */
	  public String toString() {

	      return getSpec().toString() + "Price : $" + getPrice() + "\n\n" ;

	  }
}

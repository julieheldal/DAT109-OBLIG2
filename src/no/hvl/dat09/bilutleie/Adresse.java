package no.hvl.dat09.bilutleie;
/**
 * 
 * Klasse som definerer adresseobjekt
 * 
 * @author Julie, Vilde og Lasse
 *
 */

public class Adresse {
	
	private String gateAdresse;
	private int postNr;
	private String sted;
	
	/**
	 * konstruktør
	 * @param gateAdresse
	 * @param postNr
	 * @param sted
	 */
	public Adresse(String gateAdresse, int postNr, String sted) {
		super();
		this.gateAdresse = gateAdresse;
		this.postNr = postNr;
		this.sted = sted;
	}
	
	public Adresse() {
		//tom
	}
	
	


	public String getGateAdresse() {
		return gateAdresse;
	}


	public void setGateAdresse(String gateAdresse) {
		this.gateAdresse = gateAdresse;
	}


	public int getPostNr() {
		return postNr;
	}


	public void setPostNr(int postNr) {
		this.postNr = postNr;
	}





	public String getSted() {
		return sted;
	}





	public void setSted(String sted) {
		this.sted = sted;
	}





	@Override
	public String toString() {
		return  gateAdresse + ", " + postNr + " " + sted;
	}

}
	

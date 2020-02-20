package no.hvl.dat09.bilutleie;
/**
 * 
 * klasse som definerer bilobjekt
 * @author Julie, Vilde og Lasse
 *
 */
public class Bil {
	
	private String regnr;
	private String bilmerke;
	private String modell;
	private String farge;
	private String kmAvstand;
	private Utleiegruppe utleiegruppe;
	public String getKmAvstand() {
		return kmAvstand;
	}
	public void setKmAvstand(String kmAvstand) {
		this.kmAvstand = kmAvstand;
	}

	private boolean ledig;
	
	/**
	 * 
	 * @param regnr
	 * @param bilmerke
	 * @param modell
	 * @param farge
	 * @param kmAvstand
	 * @param utleiegruppe
	 * @param ledig
	 */
	
	public Bil(String regnr, String bilmerke, String modell, String farge, String kmAvstand, Utleiegruppe utleiegruppe,
			boolean ledig) {
		super();
		this.regnr = regnr;
		this.bilmerke = bilmerke;
		this.modell = modell;
		this.farge = farge;
		this.kmAvstand = kmAvstand;
		this.utleiegruppe = utleiegruppe;
		this.ledig = ledig;
		
		
	}
	public String getRegnr() {
		return regnr;
	}
	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}
	public String getBilmerke() {
		return bilmerke;
	}
	public void setBilmerke(String bilmerke) {
		this.bilmerke = bilmerke;
	}

	
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public String getFarge() {
		return farge;
	}
	public void setFarge(String farge) {
		this.farge = farge;
	}
	public Utleiegruppe getUtleiegruppe() {
		return utleiegruppe;
	}
	public void setUtleiegruppe(Utleiegruppe utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}
	public boolean isLedig() {
		return ledig;
	}
	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}
	
	@Override
	public String toString() {
		return " Registreringsnummer: " + regnr + ", Bilmerke: " + bilmerke + ", Modell: " + modell + ", Farge: " + farge
				+ ", Km Avstand= " + kmAvstand + ", Utleiegruppe: " + utleiegruppe;
	}
}

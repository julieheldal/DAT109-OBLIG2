/**
 * 
 */
package no.hvl.dat09.bilutleie;

import java.time.LocalDate;

/**
 * 
 * Klasse som definerer utleie objekt
 * @author Julie, Vilde og Lasse
 *
 */
public class Utleie {
	
	private String kredittkortnr;
	private String regnr;
	private String kmAvstand;
	private LocalDate datoUtleie;
	private LocalDate datoRetur;
	
	/**
	 * 
	 * @param kredittkortnr
	 * @param regnr
	 * @param kmAvstand
	 * @param datoUtleie
	 * @param datoRetur
	 */
	public Utleie(String kredittkortnr, String regnr, String kmAvstand, LocalDate datoUtleie, LocalDate datoRetur) {
		super();
		this.kredittkortnr = kredittkortnr;
		this.regnr = regnr;
		this.kmAvstand = kmAvstand;
		this.datoUtleie = datoUtleie;
		this.datoRetur = datoRetur;
		
		

	}
	/**
	 *  metode som returnerer bil
	 * @param kontor
	 */
	public void returnerBil(Kontor kontor) {
		Bil bil = kontor.finnBil(this.regnr);
		bil.setKmAvstand(bil.getKmAvstand() + this.kmAvstand);
		bil.setLedig(true);
		
		
		/**
		 * TODO sett bil til nytt kontor
		 */
		
	}

	public String getKredittkortnr() {
		return kredittkortnr;
	}

	public void setKredittkortnr(String kredittkortnr) {
		this.kredittkortnr = kredittkortnr;
	}

	public String getRegnr() {
		return regnr;
	}

	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}

	public String getKmAvstand() {
		return kmAvstand;
	}

	public void setKmAvstand(String kmAvstand) {
		this.kmAvstand = kmAvstand;
	}

	public LocalDate getDatoUtleie() {
		return datoUtleie;
	}

	public void setDatoUtleie(LocalDate datoUtleie) {
		this.datoUtleie = datoUtleie;
	}

	public LocalDate getDatoRetur() {
		return datoRetur;
	}

	public void setDatoRetur(LocalDate datoRetur) {
		this.datoRetur = datoRetur;
	}
	
	
	
	

}

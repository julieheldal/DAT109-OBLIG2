package no.hvl.dat09.bilutleie;
/*
 * Klasse som definerer kundeobjekt
 * 
 * @author Julie, Vilde og Lasse
 *
 */

public class Kunde {
	
	private String fornavn;
	private String etternavn;
	private Adresse adresse;
	private String telefonnr;
	
	/**
	 * 
	 * @param fornavn
	 * @param etternavn
	 * @param adresse
	 * @param telefonnr
	 */
	
	public Kunde(String fornavn, String etternavn, Adresse adresse, String telefonnr) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.telefonnr = telefonnr;
		
		
	}
	
	public Kunde() {
		//tom konstruktør
		
	}
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getTelefonnr() {
		return telefonnr;
	}
	public void setTelefonnr(String telefonnr) {
		this.telefonnr = telefonnr;
	}
	
	@Override
	public String toString() {
		return "\n Navn :" + fornavn + " "+ etternavn + "\n Adresse: " + adresse + "\n Telefonnummer: "
				+ telefonnr ;
	}
	

}

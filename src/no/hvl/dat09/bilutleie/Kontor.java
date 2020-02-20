package no.hvl.dat09.bilutleie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Klasse som definerer kontorobjekt
 * 
 * @author Julie, Vilde og Lasse
 *
 */
public class Kontor {
	
	private int kontorId;
	private static final AtomicInteger teller = new AtomicInteger(0);
	private Adresse adresse;
	private String telefonNr;
	
	private List<Bil> biler;
	
	/**
	 * 
	 * @param adresse
	 * @param telefonNr
	 */
	public Kontor(Adresse adresse, String telefonNr) {
		this.adresse=adresse;
		this.telefonNr=telefonNr;
		this.kontorId = teller.incrementAndGet();
		this.biler = leggTilBiler();
		
		
		
	}
	
	/**
	 * legger til biler i en liste av biler.
	 * @return
	 */
	
	public List<Bil >leggTilBiler() {
	//biler.add(bil);	
		List<Bil> biler = new ArrayList<Bil>();
		biler.add(new Bil("AZ1234", "VW", "Up", "Hvit", "10000", Utleiegruppe.Liten_BIL, true));
		biler.add(new Bil("BR1234", "VW", "Golf", "Grå", "30000", Utleiegruppe.MellomStor_BIL, true));
		biler.add(new Bil("GR1234", "Ford", "S-Max", "Blå", "40000", Utleiegruppe.Stor_BIL, false));
		biler.add(new Bil("PP1234", "Ford", "Focus", "Svart", "2000", Utleiegruppe.Stasjonsvogn, true));
		return biler;
	
	}
	/**
	 * sjekker om valgt bil er ledig
	 * @return ledige biler
	 */
	public List<Bil> ledigeBiler(){
		
		//TODO finn ut hvilke dager bilen er ledig, bruk stream. 
		
		return biler.stream().filter(b -> b.isLedig()==true).collect(Collectors.toList());
					 		
	}
	/**
	 * Henter ut bilen kunde vil velge ved registreringsnummer
	 * @param regnr
	 * @return
	 */
	
	public Bil finnBil (String regnr) {
		return biler.stream().filter(b -> b.getRegnr().contentEquals(regnr))
		.collect(Collectors.toList()).get(0);
		
		
	}

	public int getKontorId() {
		return kontorId;
	}

	public void setKontorId(int kontorId) {
		this.kontorId = kontorId;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	

	public String getTelefonNr() {
		return telefonNr;
	}

	public void setTelefonNr(String telefonNr) {
		this.telefonNr = telefonNr;
	}

	public List<Bil> getBiler() {
		return biler;
	}

	public void setBiler(List<Bil> biler) {
		this.biler = biler;
	}
	
	@Override
	public String toString() {
		return  kontorId + ", Adresse " + adresse + ", Telefon: "
				+ telefonNr;
	}

}

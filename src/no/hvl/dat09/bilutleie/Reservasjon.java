package no.hvl.dat09.bilutleie;

import java.time.LocalDate;

/**
 * Klasse som definerer reservasjonobjekt
 * 
 * @author Julie, Vilde og Lasse
 *
 */

public class Reservasjon {
	
	private Kunde kunde;
	private Bil bil;
	private LocalDate datoLeie;
	private Kontor utleieKontor;
	private Kontor returKontor;
	private int antDager;
	
	/**
	 * 
	 * @param kunde
	 * @param bil
	 * @param datoLeie
	 * @param utleieKontor
	 * @param returKontor
	 * @param antDager
	 */
	
	public Reservasjon(Kunde kunde, Bil bil, LocalDate datoLeie, Kontor utleieKontor, Kontor returKontor, int antDager) {
		this.kunde=kunde;
		this.bil = bil;
		this.datoLeie=datoLeie;
		this.utleieKontor=utleieKontor;
		this.returKontor=returKontor;
		this.antDager=antDager;
	
			
	}
	

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public Bil getBil() {
		return bil;
	}

	public void setBil(Bil bil) {
		this.bil = bil;
	}

	public LocalDate getDatoLeie() {
		return datoLeie;
	}

	public void setDatoLeie(LocalDate datoLeie) {
		this.datoLeie = datoLeie;
	}

	public Kontor getUtleieKontor() {
		return utleieKontor;
	}

	public void setUtleieKontor(Kontor utleieKontor) {
		this.utleieKontor = utleieKontor;
	}

	public Kontor getReturKontor() {
		return returKontor;
	}

	public void setReturKontor(Kontor returKontor) {
		this.returKontor = returKontor;
	}

	public int getAntDager() {
		return antDager;
	}

	public void setAntDager(int antDager) {
		this.antDager = antDager;
	}
	

}

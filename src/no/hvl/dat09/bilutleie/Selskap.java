package no.hvl.dat09.bilutleie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * klasse som definerer biluteleie-selskapet
 * 
 * @author Julie, Vilde og Lasse
 *
 */

public class Selskap {
	
	private String navn;
	private String telefonnr;
	private Adresse firmaAdresse;
	private List<Kontor> kontorer;
	private List<Reservasjon> reservasjoner;
	
	
	/**
	 * 
	 * @param navn
	 * @param telefonnr
	 * @param firmaAdresse
	 */
	
	public Selskap(String navn, String telefonnr, Adresse firmaAdresse) {
		this.navn=navn;
		this.telefonnr=telefonnr;
		this.firmaAdresse=firmaAdresse;
		this.reservasjoner = new ArrayList<Reservasjon>();
		this.kontorer = leggTilKontor();
		
	}
	/**
	 * Legger til kontor i liste
	 * @param kontor
	 */
	
	public List<Kontor> leggTilKontor() {
		//kontorer.add(kontor);
		
		List<Kontor> kontorer = new ArrayList<Kontor>();
		Kontor kontor = null;
		kontor = new Kontor(new Adresse("Lars Hilles gate 12 ", 5011, "Bergen"), "55937303");
		kontorer.add(kontor);
		kontor = new Kontor(new Adresse("Karl Johansgate 44 ", 1122, "Oslo"), "55933138");
		kontorer.add(kontor);
		
		return kontorer;
		
	}
	/**
	 * 
	 * @param kontorNr
	 * @return finner kontor ved gitt kontornummer
	 */
	
	public Kontor finnKontor(int kontorNr) {
		return kontorer.get(kontorNr-1);
		}
	
	/**
	 * 
	 * @param telefon (søker gjennom telefonnummer)
	 * @return returnerer en reservasjon i listen av reservasjoner.
	 */
	
	public Reservasjon finnReservasjon(String telefon) {
		return reservasjoner.stream().filter(t -> t.getKunde().getTelefonnr().contentEquals(telefon))
				.collect(Collectors.toList()).get(0);
				
			
		
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getTelefonnr() {
		return telefonnr;
	}

	public void setTelefonnr(String telefonnr) {
		this.telefonnr = telefonnr;
	}

	public Adresse getFirmaAdresse() {
		return firmaAdresse;
	}

	public void setFirmaAdresse(Adresse firmaAdresse) {
		this.firmaAdresse = firmaAdresse;
	}

	public List<Kontor> getKontorer() {
		return kontorer;
	}

	public void setKontorer(List<Kontor> kontorer) {
		this.kontorer = kontorer;
	}

	public List<Reservasjon> getReservasjoner() {
		return reservasjoner;
	}

	public void setReservasjoner(List<Reservasjon> reservasjoner) {
		this.reservasjoner = reservasjoner;
	}

	

}

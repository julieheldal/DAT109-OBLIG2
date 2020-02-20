package no.hvl.dat09.bilutleie;

import java.time.LocalDate;
import java.util.Scanner;
/**
 * klasse som styrer kommunikasjon mellom program og kunde
 * 
 * @author Julie, Vilde og Lasse
 *
 */

public class Brukergrensesnitt {
	
	private Selskap selskap;
	private Scanner sc = new Scanner(System.in);
	
	
	/**
	 * 
	 * @param selskap
	 */
	
	public Brukergrensesnitt(Selskap selskap) {
		this.selskap=selskap;
		
	}
	/**
	 * metode som bestemmer hvilket tilfelle som skal velge
	 */
	
	public void run() {
		System.out.println("               ");
		System.out.println("Skal du reservere, leie eller returnere");
		System.out.println("Trykk 1:reservasjon 2:leie 3: retur");
		int svar = sc.nextInt();
		
		switch(svar) {
		case 1: startReservasjon();
		break;
		case 2: startLeie();
		break;
		case 3: startRetur();
		break;
		default: System.out.println("ikke gyldig svar, velg på nytt");
			run();
		
		}
		
		sc.close();
		
	
	}
	
	
	/**
	 * metode som oppretter bilreservasjon
	 */
	
	private void startReservasjon() {
		
		
		
		System.out.println("Velkommen, Reserver bil her");
		System.out.println("Vennligst velg hvor du ønsker å leie fra");
		selskap.getKontorer().stream().forEach(System.out::println);
		int utleieSted = sc.nextInt();
		sc.nextLine();
		
		Kontor valgt = selskap.finnKontor(utleieSted);
		System.out.println("Takk for at du valgte vårt kontor i " + valgt.getAdresse().getSted());
		System.out.println("Hvor  ønsker du å returnere bilen?");
		int returSted = sc.nextInt();
		sc.nextLine();
		
		Kontor valgt2 = selskap.finnKontor(returSted);
		System.out.println("Du har valgt å returnere bilen til kontor " + valgt2.getAdresse().getSted());
		System.out.println(" ");
		System.out.println("Skriv inn ønsker dato for reservasjon (åååå-mm-dd) ");
		String datoLeie = sc.nextLine();
		LocalDate dato = LocalDate.parse(datoLeie);
		System.out.println("Skriv inn antall dager for reservasjon ");
		int dager = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ledige biler for dine datoer, velg bil ved å skrive inn registreringsnummer");
		valgt.ledigeBiler().forEach(System.out::println);
		String regnr = sc.nextLine();
		Bil bilvalg = valgt.finnBil(regnr);
		System.out.println("Du har valgt "+  bilvalg.getBilmerke() + " " + bilvalg.getModell() + " " + bilvalg.getUtleiegruppe());
		
		Kunde nyKunde = opprettKunde();
		Reservasjon reservasjon = new Reservasjon(nyKunde, bilvalg, dato, valgt, valgt2, dager);
		
		selskap.getReservasjoner().add(reservasjon);
		
		run();
	}
	
	/**
	 * metode som oppretter ny kunde til reservasjonen
	 * @return returnerer nyKunde til reservasjonen.
	 */
	
	private Kunde opprettKunde() {
	
	
		Kunde nyKunde = new Kunde();
		System.out.println("Opprett kundeinformasjon for å fullføre reservasjonen");
		System.out.println(" Oppgi Fornavn :");
		nyKunde.setFornavn(sc.nextLine());
		
		System.out.println(" Oppgi Etternavn : ");
		nyKunde.setEtternavn(sc.nextLine());
		
		System.out.println(" Oppgi gate adresse :");
		Adresse adresse = new Adresse();
		adresse.setGateAdresse(sc.nextLine());
		System.out.println("Post nummer: ");
		adresse.setPostNr(sc.nextInt());
		sc.nextLine();
		System.out.println("Post sted : ");
		adresse.setSted(sc.nextLine());
		nyKunde.setAdresse(adresse);
		
		System.out.println("Telefonnummer : ");
		nyKunde.setTelefonnr(sc.nextLine());
		
		System.out.println("Velkommen som ny kunde hos oss, " + nyKunde.toString());
		
		 return nyKunde;
		
	}
	
	/**
	 * Henter ut gitt reservasjon, og starter leien
	 */
	private void startLeie() {
		
		
		System.out.println("Hent ut din reservasjon ved å skrive inn Telefonnummer");
		sc.nextLine();
		String telefon = sc.nextLine();
		Reservasjon valgt = selskap.finnReservasjon(telefon);
		System.out.println("Velkommen " + valgt.getKunde().getFornavn() + " " + valgt.getKunde().getEtternavn());
		System.out.println("Oppgi kredittkortnummer for å få bilen");
		String kredittkort = sc.nextLine();
		
		Utleie utleie = new Utleie(kredittkort, valgt.getBil().getRegnr(),
				valgt.getBil().getKmAvstand(), valgt.getDatoLeie(),
				valgt.getDatoLeie().plusDays(valgt.getAntDager()));
		
		System.out.println("Du har nå leid bilen, vi snakkes!");
		
		run();
	
		/**
		 * 
		 * TODO lagre utleie i "database" eller liste 
		 * Her skjer det ting i skranken hos kontor
		 */
		
	}
	
	private void startRetur() {
		
		run();
		
		//utleie.returnerBil(kontor);
		
	}

}

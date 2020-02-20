/**
 * 
 */
package no.hvl.dat09.bilutleie;

/**
 * 
 * starter programmet 
 * @author Julie, Vilde og Lasse
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Selskap Bil = new Selskap("Julies Bilutleie", "55505442", new Adresse("Bilgate 123", 3423, "Oslo"));
		Brukergrensesnitt bg = new Brukergrensesnitt(Bil);
		bg.run();
		

	}

}

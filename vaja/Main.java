/**
 * Razred za prikaz delovanja objekta soba
 * @author Ana Skrbinšek
 * @version vaja 27
 */

public class Main{
	
	/**
	 * Glavna metoda programa. Zažene se vedno ob zagonu.
	 *
	 * @param args Seznam argumentov iz ukazne vrstice
	 */
	public static void main(String[] args) {
	
	Soba dnevnaSoba = new Soba(2,3,20);
	
	dnevnaSoba.odpriOkna();
	System.out.println("Po zračenju je temperatura v sobi " + dnevnaSoba.zracenje(30) + " °C.");
	
	dnevnaSoba.prizgiGretje();
	System.out.println("Po ogrevanju je temperatura v sobi " + dnevnaSoba.ogrevanje(30) + " °C");
	
	}	
	
}
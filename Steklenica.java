/**
 * Razred za prikaz modela steklenice, ki vsebuje tekočino
 *
 * @author Ana Skrbinšek
 * @version primer 19a - Implementacija vmesnika
*/

public class Steklenica {

	//deklariramo lastnosti
	
	/**
	 * Kapaciteta steklenice v mililitrih
	*/
	private int kapaciteta;
	
	/**
	 * Stanje odprtosti:
	 * true - odprta
	 * false - zaprta
	*/
	private boolean jeOdprta;
	
	/**
	 * Trenutna količina vsebine v mililitrih
	*/
	private int kolicinaVsebine;
	
	/**
	 * Trenutna vrsta vsebine
	*/
	private String vrstaVsebine;
	
	
	/**
	 * Konstruktor za inicializacijo nove steklenice, ki je polna in zaprta
	 * Inicializira vse lastnosti
	 * @param k Kapaciteta steklenice v ml
	 * @param v Vrsta vsebine steklenice
	 */
	public Steklenica(int k, String v) {
		
		//inicializiramo vse lastnosti
		this.kapaciteta = k;
		this.jeOdprta = false;
		this.kolicinaVsebine = k;
		this.vrstaVsebine = v;
		
		//izpišemo podatke o steklenici
		System.out.println("Ustvarjam steklenico " + v + " kapacitete " + k + " ml.");
	}

	/**
	 * Metoda, ki iz steklenice izprazni določeno količino vsebine
	 * @return Uspešnost odpiranja
	 * true - prej je bila zaprta
	 * false - že prej je bila odprta
	 */
	public boolean odpri() {
		
		//če je steklenica že odprta
		if(jeOdprta){
			return false;
		}
		
		//če steklenica še ni odprta
		else{
			//odpre steklenico
			jeOdprta = true;
			System.out.println("Odpiram steklenico " + vrstaVsebine + ".");
			return true;
		}
	}
	
	/**
	 * Metoda, ki iz steklenice izprazni določeno količino vsebine
	 * @param k Količina vsebine, ki jo želimo izprazniti v ml
	 * @return Količina vsebine, ki je ostala v steklenici po praznjenju
	 * @throws Exception će je steklenica zaprta, ko jo poskušamo izprazniti
	*/
	public int izprazni(int k) throws Exception {
		
		//če je steklenica odprta
		if(jeOdprta){
			
			//količino vsebine zmanjšamo za želeno količino
			System.out.println("Iz steklenice v kateri je " + kolicinaVsebine + " " + vrstaVsebine + " praznim " + k + " ml.");
			kolicinaVsebine -= k;			
			
			//preverimo, če se je količina slučajno preveč zmanjšala
			if(kolicinaVsebine<=0){
				
				//postavimo količino vsebine na 0
				kolicinaVsebine = 0;
				System.out.println("Steklenica " + vrstaVsebine + " je prazna.");
			}
		}
		
		//če je steklenica zaprta
		else{
			//Vrže izjemo
			throw new Exception("Ne morem izprazniti steklenice, ker je zaprta");
		}
		
		//vrnemo količino vsebine po praznjenju
		return kolicinaVsebine;
	}
}


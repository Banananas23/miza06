//Uvozimo razred za delo z vrsto (buffer) iz paket za delo z vhodno-izhodnimi operacijami
//import java.io.BufferedReader;
import java.io.*;
import java.util.*;

/**
 * Razred za prikaz delovanja objektno orientiranega programiranja
 * @author Ana Skrbinšek
 * @version primer 19a - Implementacija vmesnika
 */
public class HelloWorld {
	
	/**
	 * Statični atribut za branje vhoda iz konzole (tipkovnice)
	 */
	private static BufferedReader in;
	
	/**
	 * Seznam objektov tipa PivskaSteklenica
	 */
	private static ArrayList<PivskaSteklenica> pivskeSteklenice;
	
	/**
	 * Glavna metoda programa. Zažene se vedno ob zagonu.
	 *
	 * @param args Seznam argumentov iz ukazne vrstice
	 */
	public static void main(String[] args) {
		
		//Izpišemo pozdrav v konzolo
		System.out.println("Pozdravljen, svet!");
		
		//inicializiramo objekt in za zajem podatkov iz tipkovnice preko konzole
		in = new BufferedReader(new InputStreamReader(System.in));

		//inicializiramo seznam pivskih steklenic- kot lastnost/atribut razreda HelloWorld
		pivskeSteklenice = new ArrayList<>();		
		
		//deklariramo in inicializiramo lastnosti steklenice
		String znamkaPiva = "";
		int velikostSteklenice = 500;
		double temperaturaSteklenice = 5.0;

		//poskusimo prebrati iz ukazne konzole		
		try{
			//vnos podatkov o pivski steklenici - znamka
			System.out.print("Vnesi znamko piva: ");			
			znamkaPiva = in.readLine();

			// Če gre za malo pivo, nastavimo velikost steklenice na 330 ml; default = da
			System.out.print("Je pivo veliko (d/n)? ");	
			
			//preverimo, ali je vnešena vrednost enaka (in ne ista) kot n
			if(in.readLine().equals("n")) {
				velikostSteklenice = 330;
			}
			
			//vnos podatkov o pivski steklenici - temperatura
			System.out.print("Vnesi temperaturo piva: ");			
			temperaturaSteklenice = Double.parseDouble(in.readLine());
		}
		
		//lovljenje in obravnava izjeme pri branju vrstice
		catch(Exception e){
			System.out.println("Napaka pri branju podatkov o steklenici piva + " + e);
		}
		
		
		
		//ustvarimo objekt tipa Steklenica
		Steklenica plastenkaVode = new Steklenica(500, "Voda");
		
		//ustvarimo objekt tipa PivskaSteklenica, glede na vnešene podatke
		PivskaSteklenica mojePivo = new PivskaSteklenica(velikostSteklenice, znamkaPiva, temperaturaSteklenice);
		
		//objekt dodamo v seznam
		pivskeSteklenice.add(mojePivo);
		
		//v seznam dodamo še nekaj anonimnih objektov
		pivskeSteklenice.add(new PivskaSteklenica(500, "Laško", 8.0));
		pivskeSteklenice.add(new PivskaSteklenica(500, "Union", 8.0));
		pivskeSteklenice.add(new PivskaSteklenica(500, "Bevog", 8.0));	

		//izpišemo število steklenic na seznamu
		System.out.println("V seznamu je " + pivskeSteklenice.size() + " steklenic.");
		
		//odpremo vse steklenice na seznamu
		
		for(int c=0; c<pivskeSteklenice.size(); c++){
			
			//odpremo trenutno pivsko steklenico
			pivskeSteklenice.get(c).odpri();
		}
		
		//izpijemo požirek piva
		try{
			System.out.println("Po požirku je v steklenici še " + mojePivo.izprazni(50) + " ml.");
		}
		
		//lovljenje in obravnava izjeme pri branju vrstice		
		catch(Exception e){
			System.out.println("Izjema pri praznjenju steklenice + " + e);
		}
		mojePivo.odpri();
		
		try{
			System.out.println("Po požirku je v steklenici še " + mojePivo.izprazni(50) + " ml.");	
			//izpijemo požirek vode
			plastenkaVode.odpri();
			System.out.println("Po požirku vode je v steklenici še " + plastenkaVode.izprazni(30) + " ml.");	
		}
		
		catch(Exception e){
			System.out.println("Izjema pri praznjenju steklenice + " + e);
		}		
	}
}
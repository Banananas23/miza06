/**
 * Razred za prikaz uporabe dedovanja
 * Razširja razred steklenica
 *
 * @author Ana Skrbinšek
 * @version primer 19a - Implementacija vmesnika
 */

public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca{
	
	//vse lasnosti/atributi od nadrazreda Steklenica se prenesejo
	//deklariramo dodatne lastnosti, ki so skupne le pivskim steklenicam
	
	/**
	 * Znamka piva
	 */
	private String znamka;
	 
	/**
	 * Temperatura piva v steklenici (v stopinjah celzija)
	 */
	private double temperatura;

	/**
	 * Stopnja alkohola piva (v odstotkih, ne v deležih)
	 */
	private double stopnjaAlkohola;		
	  
	/**
	 * Konstruktor za inicializacijo nove pivske steklenice, ki je polna in zaprta
	 * Inicializira vse lastnosti
	 * @param k Kapaciteta steklenice v ml
	 * @param z Znamka piva
	 * @param t Začetna temperatura steklenice (v stopinjah celzija)
	 * @param s Stopnja alkohola (v odstotkih)
	 */
	 
	public PivskaSteklenica(int k, String z, double t, double s){
		 
		 //pokličemo konstruktor nadrazreda - Steklenica,
		 //ki bo inicializiral lastnosti nadrazreda
		super(k, "Pivo");
		 
		 //inicializiramo dodatne lastnosti razreda
		 
		this.znamka = z;
		this.temperatura = t;
		this.stopnjaAlkohola = s;
		System.out.println("Pivska steklenica je znamke " + z + " s stopnjo alkohola " + s + " %.");
	}
	
	/**
	 * Konstruktor za inicializacijo nove pivske steklenice, ki je polna in zaprta
	 * Inicializira vse lastnosti
	 * @param k Kapaciteta steklenice v ml
	 * @param z Znamka piva
	 * @param t Začetna temperatura steklenice (v stopinjah celzija)
	 */ 
	public PivskaSteklenica(int k, String z, double t){
		 
		//pokličemo drug konstruktor z default vrednostjo 
		this(k, z, t, 4.5);
	}
	
	/**
	 * Konstruktor za inicializacijo nove pivske steklenice, ki je polna in zaprta
	 * Inicializira vse lastnosti
	 * @param k Kapaciteta steklenice v ml
	 * @param z Znamka piva
	 */	
	public PivskaSteklenica(int k, String z){
		 
		//pokličemo drug konstruktor 
		this(k, z, 8.0);
	}
	
	/**
	 * Metoda, predpisana z vmesnikom AlkoholnaPijaca
	 * @return stopnjo alkohola v odstotkih
	 */
	public double getStopnjaAlkohola(){
		return stopnjaAlkohola;
	}
	
	/**
	 * Metoda vrne znamko piva
	 * @return znamka piva
	 */
	public String getZnamka(){
		return znamka;
	}	
}
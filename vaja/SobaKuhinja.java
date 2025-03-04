/**
 * Razred za prikaz uporabe dedovanja
 * Razširja razred soba
 *
 * @author Ana Skrbinšek
 * @version vaja 28
 */
 
public class SobaKuhinja extends Soba{
	
	/**
	 * tip štedilnik (idukcijski, plinski, električni ...)
	 */	
	private String tipStedilnika;
	
	/**
	 * ali ima kuhinja pečico ali ne
	 * true - kuhinja ima pečico
	 * false - kuhinja nima pečice
	 */
	private boolean jePecica;
	
	/**
	 * število kuhinjskih omaric
	 */
	private int stOmaric;
	
	/**
	 * ali ima hladilnik tudi zmrzovalni del
	 * true - ima zmrzovalnik
	 * false - nima zmrzovalnika
	 */
	private boolean imaZmrzovalnik;
	
	/**
	 * kapaciteta celotnega hladilnika (z zmrzovalnikom) v litrih
	 */
	private int kapacitetaHladilnika;
	
	/**
	 * ali je pipa v kuhinjskem umivalniku zaprta ali odprta
	 * true - pipa je odprta
	 * false - pipa je zaprta
	 */
	private int pipaOdprta;
	
	/**
	 * temperatura vode v °C
	 */
	private int temperaturaVode;

	
	/**
	 * Konstruktor za inicializacijo nove kuhinje
	 * Inicializira vse lastnosti za predvideno standardno kuhinjo
	 * @param v Število vrat v sobi
	 * @param o Število oken v sobi
	 * @param vs Velikost sobe (m2)
	 * @param t Temperatura (stopinje celzija)
	 */
	public SobaKuhinja(int stVrat, int stOken, double velikostSobe, int stOmaric){
		super(stVrat, stOken, velikostSobe, "kuhinja");
		this.stOmaric = stOmaric;
		this.tipStedilnika = "indukcijski";
		this.jePecica = true;
		this.imaZmrzovalnik = true;
		this.kapacitetaHladilnika = 300;
		this.pipaOdprta = false;
		this. temperaturaVode = 20;
	}
	
	/**
	 *************************************
	 * Setter metode za variabile objekta
	 *************************************
	 */
	
	public void setTipStedilnika(String tipStedilnika){
		this.tipStedilnika = tipStedilnika;
	}
	
	public void setJePecica(boolean jePecica){
		this.jePecica = jePecica;
	}
	
	public void setStOmaric(int stOmaric){
		this.stOmaric = stOmaric;
	}
	
	
}
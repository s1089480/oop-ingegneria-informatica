package Statistiche.covid.ConfrontoCovidNazioni.modello;

/**
 * Classe con le statistiche che permettono di confrontare i 3 paesi
 * @author Marco Cervigni
 *
 */
public class StatConfronto {

	
	private double percentMediaCasiSpagSve;
	private double percentMediaMortiSpagSve;
	
	private double percentDevStandCasiSpagSve;
	private double percentDevStandMortiSpagSve;
	
	private double percentMediaCasiItaSpag;
	private double percentMediaMortiItaSpag;
	
	private double percentDevStandCasiItaSpag;
	private double percentDevStandMortiItaSpag;
	
	private double percentMediaCasiSveIta;
	private double percentMediaMortiSveIta;
	
	private double percentDevStandCasiSveIta;
	private double percentDevStandMortiSveIta;
	
	
	
	public StatConfronto(double percentMediaCasiSpagSviz, double percentMediaMortiSpagSviz,
			 double percentDevStandCasiSpagSviz, double percentDevStandMortiSpagSviz,
			 double percentMediaCasiItaSpag, double percentMediaMortiItaSpag,
			 double percentDevStandCasiItaSpag, double percentDevStandMortiItaSpag,
			 double percentMediaCasiSvizIta, double percentMediaMortiSvizIta,
			 double percentDevStandCasiSvizIta, double percentDevStandMortiSvizIta) {
		super();
		this.percentMediaCasiSpagSve = percentMediaCasiSpagSviz;
		this.percentMediaMortiSpagSve = percentMediaMortiSpagSviz;		
		this.percentDevStandCasiSpagSve = percentDevStandCasiSpagSviz;
		this.percentDevStandMortiSpagSve = percentDevStandMortiSpagSviz;
		this.percentMediaCasiItaSpag = percentMediaCasiItaSpag;
		this.percentMediaMortiItaSpag = percentMediaMortiItaSpag;
		this.percentDevStandCasiItaSpag = percentDevStandCasiItaSpag;
		this.percentDevStandMortiItaSpag = percentDevStandMortiItaSpag;
		this.percentMediaCasiSveIta = percentMediaCasiSvizIta;
		this.percentMediaMortiSveIta = percentMediaMortiSvizIta;
		this.percentDevStandCasiSveIta = percentDevStandCasiSvizIta;
		this.percentDevStandMortiSveIta = percentDevStandMortiSvizIta;
	}
	
	public StatConfronto() {
		
		this.percentMediaCasiSpagSve = 0;
		this.percentMediaMortiSpagSve = 0;		
		this.percentDevStandCasiSpagSve = 0;
		this.percentDevStandMortiSpagSve = 0;
		this.percentMediaCasiItaSpag = 0;
		this.percentMediaMortiItaSpag = 0;
		this.percentDevStandCasiItaSpag = 0;
		this.percentDevStandMortiItaSpag = 0;
		this.percentMediaCasiSveIta = 0;
		this.percentMediaMortiSveIta = 0;
		this.percentDevStandCasiSveIta = 0;
		this.percentDevStandMortiSveIta = 0;
	}

	public double getPercentMediaCasiSpagSve() {
		return percentMediaCasiSpagSve;
	}

	public void setPercentMediaCasiSpagSve(double percentMediaCasiSpagSve) {
		this.percentMediaCasiSpagSve = percentMediaCasiSpagSve;
	}

	public double getPercentMediaMortiSpagSve() {
		return percentMediaMortiSpagSve;
	}

	public void setPercentMediaMortiSpagSve(double percentMediaMortiSpagSve) {
		this.percentMediaMortiSpagSve = percentMediaMortiSpagSve;
	}

	
	public double getPercentDevStandCasiSpagSve() {
		return percentDevStandCasiSpagSve;
	}

	public void setPercentDevStandCasiSpagSve(double percentDevStandCasiSpagSve) {
		this.percentDevStandCasiSpagSve = percentDevStandCasiSpagSve;
	}

	public double getPercentDevStandMortiSpagSve() {
		return percentDevStandMortiSpagSve;
	}

	public void setPercentDevStandMortiSpagSve(double percentDevStandMortiSpagSve) {
		this.percentDevStandMortiSpagSve = percentDevStandMortiSpagSve;
	}

	

	public double getPercentMediaCasiItaSpag() {
		return percentMediaCasiItaSpag;
	}

	public void setPercentMediaCasiItaSpag(double percentMediaCasiItaSpag) {
		this.percentMediaCasiItaSpag = percentMediaCasiItaSpag;
	}

	public double getPercentMediaMortiItaSpag() {
		return percentMediaMortiItaSpag;
	}

	public void setPercentMediaMortiItaSpag(double percentMediaMortiItaSpag) {
		this.percentMediaMortiItaSpag = percentMediaMortiItaSpag;
	}

	

	public double getPercentDevStandCasiItaSpag() {
		return percentDevStandCasiItaSpag;
	}

	public void setPercentDevStandCasiItaSpag(double percentDevStandCasiItaSpag) {
		this.percentDevStandCasiItaSpag = percentDevStandCasiItaSpag;
	}

	public double getPercentDevStandMortiItaSpag() {
		return percentDevStandMortiItaSpag;
	}

	public void setPercentDevStandMortiItaSpag(double percentDevStandMortiItaSpag) {
		this.percentDevStandMortiItaSpag = percentDevStandMortiItaSpag;
	}

	

	public double getPercentMediaCasiSveIta() {
		return percentMediaCasiSveIta;
	}

	public void setPercentMediaCasiSveIta(double percentMediaCasiSveIta) {
		this.percentMediaCasiSveIta = percentMediaCasiSveIta;
	}

	public double getPercentMediaMortiSveIta() {
		return percentMediaMortiSveIta;
	}

	public void setPercentMediaMortiSveIta(double percentMediaMortiSveIta) {
		this.percentMediaMortiSveIta = percentMediaMortiSveIta;
	}

	

	public double getPercentDevStandCasiSveIta() {
		return percentDevStandCasiSveIta;
	}

	public void setPercentDevStandCasiSveIta(double percentDevStandCasiSveIta) {
		this.percentDevStandCasiSveIta = percentDevStandCasiSveIta;
	}

	public double getPercentDevStandMortiSveIta() {
		return percentDevStandMortiSveIta;
	}

	public void setPercentDevStandMortiSveIta(double percentDevStandMortiSveIta) {
		this.percentDevStandMortiSveIta = percentDevStandMortiSveIta;
	}

	
}

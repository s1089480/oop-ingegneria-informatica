package Statistiche.covid.ConfrontoCovidNazioni.modello;


/**
 * Classe con le statistiche dei singoli paesi
 * @author Marco Cervigni
 *
 */
public class Statistiche {

	private double mediaNumCasSpa;
	private double mediaNumMortSpa;
	private double mediaNumRicovSpa;
	private long massimoNumCasSpa;
	private long massimoNumMortSpa;
	private long massimoNumRicovSpa;	
	private double devStandCasSpa;
	private double devStandMortSpa;
	private double devStandRicovSpa;
	
	private double mediaNumCasSve;
	private double mediaNumMortSve;
	private double mediaNumRicovSve;
	private long massimoNumCasSve;
	private long massimoNumMortSve;
	private long massimoNumRicovSve;	
	private double devStandCasSve;
	private double devStandMortSve;
	private double devStandRicovSve;
	
	private double mediaNumCasIta;
	private double mediaNumMortIta;
	private double mediaNumRicovIta;
	private long massimoNumCasIta;
	private long massimoNumMortIta;
	private long massimoNumRicovIta;	
	private double devStandCasIta;
	private double devStandMortIta;
	private double devStandRicovIta;
	
	
	
	



	public Statistiche(double mediaNumCasSpa, double mediaNumMortSpa, double mediaNumRicovSpa, long massimoNumCasSpa,
			long massimoNumMortSpa, long massimoNumRicovSpa, double devStandCasSpa, double devStandMortSpa,
			double devStandRicovSpa, double mediaNumCasSve, double mediaNumMortSve, double mediaNumRicovSve,
			long massimoNumCasSve, long massimoNumMortSve, long massimoNumRicovSve, double devStandCasSve,
			double devStandMortSve, double devStandRicovSve, double mediaNumCasIta, double mediaNumMortIta,
			double mediaNumRicovIta, long massimoNumCasIta, long massimoNumMortIta, long massimoNumRicovIta,
			double devStandCasIta, double devStandMortIta, double devStandRicovIta) {
		super();
		this.mediaNumCasSpa = mediaNumCasSpa;
		this.mediaNumMortSpa = mediaNumMortSpa;
		this.mediaNumRicovSpa = mediaNumRicovSpa;
		this.massimoNumCasSpa = massimoNumCasSpa;
		this.massimoNumMortSpa = massimoNumMortSpa;
		this.massimoNumRicovSpa = massimoNumRicovSpa;
		this.devStandCasSpa = devStandCasSpa;
		this.devStandMortSpa = devStandMortSpa;
		this.devStandRicovSpa = devStandRicovSpa;
		this.mediaNumCasSve = mediaNumCasSve;
		this.mediaNumMortSve = mediaNumMortSve;
		this.mediaNumRicovSve = mediaNumRicovSve;
		this.massimoNumCasSve = massimoNumCasSve;
		this.massimoNumMortSve = massimoNumMortSve;
		this.massimoNumRicovSve = massimoNumRicovSve;
		this.devStandCasSve = devStandCasSve;
		this.devStandMortSve = devStandMortSve;
		this.devStandRicovSve = devStandRicovSve;
		this.mediaNumCasIta = mediaNumCasIta;
		this.mediaNumMortIta = mediaNumMortIta;
		this.mediaNumRicovIta = mediaNumRicovIta;
		this.massimoNumCasIta = massimoNumCasIta;
		this.massimoNumMortIta = massimoNumMortIta;
		this.massimoNumRicovIta = massimoNumRicovIta;
		this.devStandCasIta = devStandCasIta;
		this.devStandMortIta = devStandMortIta;
		this.devStandRicovIta = devStandRicovIta;
		
	}



	public Statistiche() {
		
		this.mediaNumCasSpa = 0;
		this.mediaNumMortSpa = 0;
		this.mediaNumRicovSpa = 0;
		this.massimoNumCasSpa = 0;
		this.massimoNumMortSpa = 0;
		this.massimoNumRicovSpa = 0;
		this.devStandCasSpa = 0;
		this.devStandMortSpa = 0;
		this.devStandRicovSpa = 0;
		this.mediaNumCasSve = 0;
		this.mediaNumMortSve = 0;
		this.mediaNumRicovSve = 0;
		this.massimoNumCasSve = 0;
		this.massimoNumMortSve = 0;
		this.massimoNumRicovSve = 0;
		this.devStandCasSve = 0;
		this.devStandMortSve = 0;
		this.devStandRicovSve = 0;
		this.mediaNumCasIta = 0;
		this.mediaNumMortIta = 0;
		this.mediaNumRicovIta = 0;
		this.massimoNumCasIta = 0;
		this.massimoNumMortIta = 0;
		this.massimoNumRicovIta = 0;
		this.devStandCasIta = 0;
		this.devStandMortIta = 0;
		this.devStandRicovIta = 0;
		
	}
	
  
	
	
	



	public double getMediaNumCasSpa() {
		return mediaNumCasSpa;
	}



	public void setMediaNumCasSpa(double mediaNumCasSpa) {
		this.mediaNumCasSpa = mediaNumCasSpa;
	}



	public double getMediaNumMortSpa() {
		return mediaNumMortSpa;
	}



	public void setMediaNumMortSpa(double mediaNumMortSpa) {
		this.mediaNumMortSpa = mediaNumMortSpa;
	}



	public double getMediaNumRicovSpa() {
		return mediaNumRicovSpa;
	}



	public void setMediaNumRicovSpa(double mediaNumRicovSpa) {
		this.mediaNumRicovSpa = mediaNumRicovSpa;
	}



	public long getMassimoNumCasSpa() {
		return massimoNumCasSpa;
	}



	public void setMassimoNumCasSpa(long massimoNumCasSpa) {
		this.massimoNumCasSpa = massimoNumCasSpa;
	}



	public long getMassimoNumMortSpa() {
		return massimoNumMortSpa;
	}



	public void setMassimoNumMortSpa(long massimoNumMortSpa) {
		this.massimoNumMortSpa = massimoNumMortSpa;
	}



	public long getMassimoNumRicovSpa() {
		return massimoNumRicovSpa;
	}



	public void setMassimoNumRicovSpa(long massimoNumRicovSpa) {
		this.massimoNumRicovSpa = massimoNumRicovSpa;
	}



	public double getDevStandCasSpa() {
		return devStandCasSpa;
	}



	public void setDevStandCasSpa(double devStandCasSpa) {
		this.devStandCasSpa = devStandCasSpa;
	}



	public double getDevStandMortSpa() {
		return devStandMortSpa;
	}



	public void setDevStandMortSpa(double devStandMortSpa) {
		this.devStandMortSpa = devStandMortSpa;
	}



	public double getDevStandRicovSpa() {
		return devStandRicovSpa;
	}



	public void setDevStandRicovSpa(double devStandRicovSpa) {
		this.devStandRicovSpa = devStandRicovSpa;
	}



	public double getMediaNumCasSve() {
		return mediaNumCasSve;
	}



	public void setMediaNumCasSve(double mediaNumCasSve) {
		this.mediaNumCasSve = mediaNumCasSve;
	}



	public double getMediaNumMortSve() {
		return mediaNumMortSve;
	}



	public void setMediaNumMortSve(double mediaNumMortSve) {
		this.mediaNumMortSve = mediaNumMortSve;
	}



	public double getMediaNumRicovSve() {
		return mediaNumRicovSve;
	}



	public void setMediaNumRicovSve(double mediaNumRicovSve) {
		this.mediaNumRicovSve = mediaNumRicovSve;
	}



	public long getMassimoNumCasSve() {
		return massimoNumCasSve;
	}



	public void setMassimoNumCasSve(long massimoNumCasSve) {
		this.massimoNumCasSve = massimoNumCasSve;
	}



	public long getMassimoNumMortSve() {
		return massimoNumMortSve;
	}



	public void setMassimoNumMortSve(long massimoNumMortSve) {
		this.massimoNumMortSve = massimoNumMortSve;
	}



	public long getMassimoNumRicovSve() {
		return massimoNumRicovSve;
	}



	public void setMassimoNumRicovSve(long massimoNumRicovSve) {
		this.massimoNumRicovSve = massimoNumRicovSve;
	}



	public double getDevStandCasSve() {
		return devStandCasSve;
	}



	public void setDevStandCasSve(double devStandCasSve) {
		this.devStandCasSve = devStandCasSve;
	}



	public double getDevStandMortSve() {
		return devStandMortSve;
	}



	public void setDevStandMortSve(double devStandMortSve) {
		this.devStandMortSve = devStandMortSve;
	}



	public double getDevStandRicovSve() {
		return devStandRicovSve;
	}



	public void setDevStandRicovSve(double devStandRicovSve) {
		this.devStandRicovSve = devStandRicovSve;
	}



	public double getMediaNumCasIta() {
		return mediaNumCasIta;
	}



	public void setMediaNumCasIta(double mediaNumCasIta) {
		this.mediaNumCasIta = mediaNumCasIta;
	}



	public double getMediaNumMortIta() {
		return mediaNumMortIta;
	}



	public void setMediaNumMortIta(double mediaNumMortIta) {
		this.mediaNumMortIta = mediaNumMortIta;
	}



	public double getMediaNumRicovIta() {
		return mediaNumRicovIta;
	}



	public void setMediaNumRicovIta(double mediaNumRicovIta) {
		this.mediaNumRicovIta = mediaNumRicovIta;
	}



	public long getMassimoNumCasIta() {
		return massimoNumCasIta;
	}



	public void setMassimoNumCasIta(long massimoNumCasIta) {
		this.massimoNumCasIta = massimoNumCasIta;
	}



	public long getMassimoNumMortIta() {
		return massimoNumMortIta;
	}



	public void setMassimoNumMortIta(long massimoNumMortIta) {
		this.massimoNumMortIta = massimoNumMortIta;
	}



	public long getMassimoNumRicovIta() {
		return massimoNumRicovIta;
	}



	public void setMassimoNumRicovIta(long massimoNumRicovIta) {
		this.massimoNumRicovIta = massimoNumRicovIta;
	}



	public double getDevStandCasIta() {
		return devStandCasIta;
	}



	public void setDevStandCasIta(double devStandCasIta) {
		this.devStandCasIta = devStandCasIta;
	}



	public double getDevStandMortIta() {
		return devStandMortIta;
	}



	public void setDevStandMortIta(double devStandMortIta) {
		this.devStandMortIta = devStandMortIta;
	}



	public double getDevStandRicovIta() {
		return devStandRicovIta;
	}



	public void setDevStandRicovIta(double devStandRicovIta) {
		this.devStandRicovIta = devStandRicovIta;
	}



	


	
	
	
	
	
	
}

package Statistiche.covid.ConfrontoCovidNazioni.modello;

import java.text.ParseException;

import org.json.simple.JSONArray;

import Statistiche.covid.ConfrontoCovidNazioni.gestione.GestioneStatistiche;

public class Statistiche {

	private long mediaNumCas;
	private long mediaNumMort;
	private long mediaNumRicov;

	private long massimoNumCas;
	private long massimoNumMort;
	private long massimoNumRicov;
	
	
	public Statistiche(long mediaNumCas, long mediaNumMort, long mediaNumRicov, long massimoNumCas,
			long massimoNumMort, long massimoNumRicov) {
		super();
		this.mediaNumCas = mediaNumCas;
		this.mediaNumMort = mediaNumMort;
		this.mediaNumRicov = mediaNumRicov;
		this.massimoNumCas = massimoNumCas;
		this.massimoNumMort = massimoNumMort;
		this.massimoNumRicov = massimoNumRicov;
	}
	
	public Statistiche() {
		this.mediaNumCas = 0;
		this.mediaNumMort = 0;
		this.mediaNumRicov = 0;
		this.massimoNumCas = 0;
		this.massimoNumMort = 0;
		this.massimoNumRicov = 0;
	}
	public Statistiche(JSONArray boh, String q,String p) throws ParseException {
		this.mediaNumCas = GestioneStatistiche.mediaCasi(boh,q,p);
		this.mediaNumMort = GestioneStatistiche.mediaMorti(boh,q,p);
		this.mediaNumRicov = GestioneStatistiche.mediaRicoverati(boh,q,p);
		this.massimoNumCas = 0;
		this.massimoNumMort = 0;
		this.massimoNumRicov = 0;
	}
  
	
	public long getMediaNumCas() {
		return mediaNumCas;
	}

	public  void setMediaNumCas(long mediaNumCas) {
		this.mediaNumCas = mediaNumCas;
	}

	public long getMediaNumMort() {
		return mediaNumMort;
	}

	public void setMediaNumMort(long mediaNumMort) {
		this.mediaNumMort = mediaNumMort;
	}

	public long getMediaNumRicov() {
		return mediaNumRicov;
	}

	public void setMediaNumRicov(long mediaNumRicov) {
		this.mediaNumRicov = mediaNumRicov;
	}



	public long getMassimoNumCas() {
		return massimoNumCas;
	}

	public void setMassimoNumCas(long massimoNumCas) {
		this.massimoNumCas = massimoNumCas;
	}

	public long getMassimoNumMort() {
		return massimoNumMort;
	}

	public void setMassimoNumMort(long massimoNumMort) {
		this.massimoNumMort = massimoNumMort;
	}

	public long getMassimoNumRicov() {
		return massimoNumRicov;
	}

	public void setMassimoNumRicov(long massimoNumRicov) {
		this.massimoNumRicov = massimoNumRicov;
	}


	
	
	
	
}

package Statistiche.covid.ConfrontoCovidNazioni.modello;

import java.text.ParseException;

import org.json.simple.JSONArray;

import Statistiche.covid.ConfrontoCovidNazioni.gestione.GestioneStatistiche;

public class Statistiche {

	private double mediaNumCas;
	private double mediaNumMort;
	private double mediaNumRicov;

	private long massimoNumCas;
	private long massimoNumMort;
	private long massimoNumRicov;
	
	
	public Statistiche(double mediaNumCas, double mediaNumMort, double mediaNumRicov, long massimoNumCas,
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
	public Statistiche(JSONArray ArrayJson, String dataInizio,String dataFine) throws ParseException {
		this.mediaNumCas = GestioneStatistiche.mediaCasi(ArrayJson,dataInizio,dataFine);
		this.mediaNumMort = GestioneStatistiche.mediaMorti(ArrayJson,dataInizio,dataFine);
		this.mediaNumRicov = GestioneStatistiche.mediaRicoverati(ArrayJson,dataInizio,dataFine);
		
		this.massimoNumCas = GestioneStatistiche.massimoNumeroCasi(ArrayJson,dataInizio,dataFine);
		this.massimoNumMort = GestioneStatistiche.massimoNumeroMorti(ArrayJson,dataInizio,dataFine);
		this.massimoNumRicov = GestioneStatistiche.massimoNumeroRicoverati(ArrayJson,dataInizio,dataFine);
	}
  
	
	public double getMediaNumCas() {
		return mediaNumCas;
	}

	public  void setMediaNumCas(double mediaNumCas) {
		this.mediaNumCas = mediaNumCas;
	}

	public double getMediaNumMort() {
		return mediaNumMort;
	}

	public void setMediaNumMort(double mediaNumMort) {
		this.mediaNumMort = mediaNumMort;
	}

	public double getMediaNumRicov() {
		return mediaNumRicov;
	}

	public void setMediaNumRicov(double mediaNumRicov) {
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

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
	
	private double devStandCas;
	private double devStandMort;
	private double devStandRicov;
	
	private double percentMediaCasiSpagSviz;
	private double percentMediaMortiSpagSviz;
	private double percentMediaRicovSpagSviz;
	private double percentDevStandCasiSpagSviz;
	private double percentDevStandMortiSpagSviz;
	private double percentDevStandRicovSpagSviz;
	private double percentMediaCasiSpagIta;
	private double percentMediaMortiSpagIta;
	private double percentMediaRicovSpagIta;
	private double percentDevStandCasiSpagIta;
	private double percentDevStandMortiSpagIta;
	private double percentDevStandRicovSpagIta;
	private double percentMediaCasiSvizIta;
	private double percentMediaMortiSvizIta;
	private double percentMediaRicovSvizIta;
	private double percentDevStandCasiSvizIta;
	private double percentDevStandMortiSvizIta;
	private double percentDevStandRicovSvizIta;
	
	
	 	
	
	
	
	public Statistiche(double mediaNumCas, double mediaNumMort, double mediaNumRicov, long massimoNumCas,
			long massimoNumMort, long massimoNumRicov, double devStandCas, double devStandMort, double devStandRicov,
			double percentMediaCasiSpagSviz, double percentMediaMortiSpagSviz, double percentMediaRicovSpagSviz,
			double percentDevStandCasiSpagSviz, double percentDevStandMortiSpagSviz,
			double percentDevStandRicovSpagSviz, double percentMediaCasiSpagIta, double percentMediaMortiSpagIta,
			double percentMediaRicovSpagIta, double percentDevStandCasiSpagIta, double percentDevStandMortiSpagIta,
			double percentDevStandRicovSpagIta, double percentMediaCasiSvizIta, double percentMediaMortiSvizIta,
			double percentMediaRicovSvizIta, double percentDevStandCasiSvizIta, double percentDevStandMortiSvizIta,
			double percentDevStandRicovSvizIta) {
		super();
		this.mediaNumCas = mediaNumCas;
		this.mediaNumMort = mediaNumMort;
		this.mediaNumRicov = mediaNumRicov;
		this.massimoNumCas = massimoNumCas;
		this.massimoNumMort = massimoNumMort;
		this.massimoNumRicov = massimoNumRicov;
		this.devStandCas = devStandCas;
		this.devStandMort = devStandMort;
		this.devStandRicov = devStandRicov;
		this.percentMediaCasiSpagSviz = percentMediaCasiSpagSviz;
		this.percentMediaMortiSpagSviz = percentMediaMortiSpagSviz;
		this.percentMediaRicovSpagSviz = percentMediaRicovSpagSviz;
		this.percentDevStandCasiSpagSviz = percentDevStandCasiSpagSviz;
		this.percentDevStandMortiSpagSviz = percentDevStandMortiSpagSviz;
		this.percentDevStandRicovSpagSviz = percentDevStandRicovSpagSviz;
		this.percentMediaCasiSpagIta = percentMediaCasiSpagIta;
		this.percentMediaMortiSpagIta = percentMediaMortiSpagIta;
		this.percentMediaRicovSpagIta = percentMediaRicovSpagIta;
		this.percentDevStandCasiSpagIta = percentDevStandCasiSpagIta;
		this.percentDevStandMortiSpagIta = percentDevStandMortiSpagIta;
		this.percentDevStandRicovSpagIta = percentDevStandRicovSpagIta;
		this.percentMediaCasiSvizIta = percentMediaCasiSvizIta;
		this.percentMediaMortiSvizIta = percentMediaMortiSvizIta;
		this.percentMediaRicovSvizIta = percentMediaRicovSvizIta;
		this.percentDevStandCasiSvizIta = percentDevStandCasiSvizIta;
		this.percentDevStandMortiSvizIta = percentDevStandMortiSvizIta;
		this.percentDevStandRicovSvizIta = percentDevStandRicovSvizIta;
	}



	public Statistiche() {
		this.mediaNumCas = 0;
		this.mediaNumMort = 0;
		this.mediaNumRicov = 0;
		
		this.massimoNumCas = 0;
		this.massimoNumMort = 0;
		this.massimoNumRicov = 0;
		
		this.devStandCas= 0;
		this.devStandMort=0;
		this.devStandRicov=0;
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

	public double getDevStandCas() {
		return devStandCas;
	}

	public void setDevStandCas(double devStandCas) {
		this.devStandCas = devStandCas;
	}

	public double getDevStandMort() {
		return devStandMort;
	}

	public void setDevStandMort(double devStandMort) {
		this.devStandMort = devStandMort;
	}

	public double getDevStandRicov() {
		return devStandRicov;
	}

	public void setDevStandRicov(double devStandRicov) {
		this.devStandRicov = devStandRicov;
	}



	public double getPercentMediaCasiSpagSviz() {
		return percentMediaCasiSpagSviz;
	}



	public void setPercentMediaCasiSpagSviz(double percentMediaCasiSpagSviz) {
		this.percentMediaCasiSpagSviz = percentMediaCasiSpagSviz;
	}



	public double getPercentMediaMortiSpagSviz() {
		return percentMediaMortiSpagSviz;
	}



	public void setPercentMediaMortiSpagSviz(double percentMediaMortiSpagSviz) {
		this.percentMediaMortiSpagSviz = percentMediaMortiSpagSviz;
	}



	public double getPercentMediaRicovSpagSviz() {
		return percentMediaRicovSpagSviz;
	}



	public void setPercentMediaRicovSpagSviz(double percentMediaRicovSpagSviz) {
		this.percentMediaRicovSpagSviz = percentMediaRicovSpagSviz;
	}



	public double getPercentDevStandCasiSpagSviz() {
		return percentDevStandCasiSpagSviz;
	}



	public void setPercentDevStandCasiSpagSviz(double percentDevStandCasiSpagSviz) {
		this.percentDevStandCasiSpagSviz = percentDevStandCasiSpagSviz;
	}



	public double getPercentDevStandMortiSpagSviz() {
		return percentDevStandMortiSpagSviz;
	}



	public void setPercentDevStandMortiSpagSviz(double percentDevStandMortiSpagSviz) {
		this.percentDevStandMortiSpagSviz = percentDevStandMortiSpagSviz;
	}



	public double getPercentDevStandRicovSpagSviz() {
		return percentDevStandRicovSpagSviz;
	}



	public void setPercentDevStandRicovSpagSviz(double percentDevStandRicovSpagSviz) {
		this.percentDevStandRicovSpagSviz = percentDevStandRicovSpagSviz;
	}



	public double getPercentMediaCasiSpagIta() {
		return percentMediaCasiSpagIta;
	}



	public void setPercentMediaCasiSpagIta(double percentMediaCasiSpagIta) {
		this.percentMediaCasiSpagIta = percentMediaCasiSpagIta;
	}



	public double getPercentMediaMortiSpagIta() {
		return percentMediaMortiSpagIta;
	}



	public void setPercentMediaMortiSpagIta(double percentMediaMortiSpagIta) {
		this.percentMediaMortiSpagIta = percentMediaMortiSpagIta;
	}



	public double getPercentMediaRicovSpagIta() {
		return percentMediaRicovSpagIta;
	}



	public void setPercentMediaRicovSpagIta(double percentMediaRicovSpagIta) {
		this.percentMediaRicovSpagIta = percentMediaRicovSpagIta;
	}



	public double getPercentDevStandCasiSpagIta() {
		return percentDevStandCasiSpagIta;
	}



	public void setPercentDevStandCasiSpagIta(double percentDevStandCasiSpagIta) {
		this.percentDevStandCasiSpagIta = percentDevStandCasiSpagIta;
	}



	public double getPercentDevStandMortiSpagIta() {
		return percentDevStandMortiSpagIta;
	}



	public void setPercentDevStandMortiSpagIta(double percentDevStandMortiSpagIta) {
		this.percentDevStandMortiSpagIta = percentDevStandMortiSpagIta;
	}



	public double getPercentDevStandRicovSpagIta() {
		return percentDevStandRicovSpagIta;
	}



	public void setPercentDevStandRicovSpagIta(double percentDevStandRicovSpagIta) {
		this.percentDevStandRicovSpagIta = percentDevStandRicovSpagIta;
	}



	public double getPercentMediaCasiSvizIta() {
		return percentMediaCasiSvizIta;
	}



	public void setPercentMediaCasiSvizIta(double percentMediaCasiSvizIta) {
		this.percentMediaCasiSvizIta = percentMediaCasiSvizIta;
	}



	public double getPercentMediaMortiSvizIta() {
		return percentMediaMortiSvizIta;
	}



	public void setPercentMediaMortiSvizIta(double percentMediaMortiSvizIta) {
		this.percentMediaMortiSvizIta = percentMediaMortiSvizIta;
	}



	public double getPercentMediaRicovSvizIta() {
		return percentMediaRicovSvizIta;
	}



	public void setPercentMediaRicovSvizIta(double percentMediaRicovSvizIta) {
		this.percentMediaRicovSvizIta = percentMediaRicovSvizIta;
	}



	public double getPercentDevStandCasiSvizIta() {
		return percentDevStandCasiSvizIta;
	}



	public void setPercentDevStandCasiSvizIta(double percentDevStandCasiSvizIta) {
		this.percentDevStandCasiSvizIta = percentDevStandCasiSvizIta;
	}



	public double getPercentDevStandMortiSvizIta() {
		return percentDevStandMortiSvizIta;
	}



	public void setPercentDevStandMortiSvizIta(double percentDevStandMortiSvizIta) {
		this.percentDevStandMortiSvizIta = percentDevStandMortiSvizIta;
	}



	public double getPercentDevStandRicovSvizIta() {
		return percentDevStandRicovSvizIta;
	}



	public void setPercentDevStandRicovSvizIta(double percentDevStandRicovSvizIta) {
		this.percentDevStandRicovSvizIta = percentDevStandRicovSvizIta;
	}


	
	
	
	
	
	
}

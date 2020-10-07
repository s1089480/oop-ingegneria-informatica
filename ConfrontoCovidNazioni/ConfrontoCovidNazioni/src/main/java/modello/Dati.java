package modello;

import java.util.Date;

/**
 * 
 * @author cervoz
 * 
 *
 */


public class Dati {
        protected String NomNaz;
        protected Date CurrentData;
	    protected Date datainizio;
	    protected Date datafine;
		protected Integer NumCas;
		protected Integer NumGuar;
		protected Integer NumMort;
		
		public Dati(Integer NumCas, Integer NumGuar, Integer NumMort, Date datainizio, Date datafine, String NomNaz, Date CurrentData) {
			super();
			this.NomNaz=NomNaz;
			this.CurrentData=CurrentData;
			this.datainizio= datainizio;
			this.datafine= datafine;
			this.NumCas = NumCas;
			this.NumGuar = NumGuar;
			this.NumMort = NumMort;
		}
		
		public Dati() {
			
			this.NomNaz=null;
			this.CurrentData=null;
			this.NumCas=0;
			this.NumGuar=0;
			this.NumMort=0;
			this.datainizio=null;
			this.datafine=null;
		}

		public String getNomNaz() {
			return NomNaz;
		}

		public void setNomNaz(String nomNaz) {
			NomNaz = nomNaz;
		}
		
		 public Date getCurrentData() {
				return CurrentData;
			}
		
		public void setCurrentData(Date currentData) {
			CurrentData = currentData;
		}

		public Date getDatainizio() {
			return datainizio;
		}

		public void setDatainizio(Date datainizio) {
			this.datainizio = datainizio;
		}

		public Date getDatafine() {
			return datafine;
		}

		public void setDatafine(Date datafine) {
			this.datafine = datafine;
		}

		public Integer getNumCas() {
			return NumCas;
		}

		public void setNumCas(Integer numCas) {
			NumCas = numCas;
		}

		public Integer getNumGuar() {
			return NumGuar;
		}

		public void setNumGuar(Integer numGuar) {
			NumGuar = numGuar;
		}

		public Integer getNumMort() {
			return NumMort;
		}

		public void setNumMort(Integer numMort) {
			NumMort = numMort;
		}

		
	
		
		
}

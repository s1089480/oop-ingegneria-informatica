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
        protected String CodPaes;
        protected String Prov;
        protected String NomCit;
        protected String CodCit;
        protected long Lat;
        protected long lon;
        protected Integer NumCas;
		protected Integer NumMort;
		protected Integer NumRicov;
		protected Integer NumIsol;
		protected Date CurrentData;
	    protected Date datainizio;
		protected Date datafine;
		
	    
		
		public Dati(String nomNaz, String codPaes, String prov, String nomCit, String codCit, long lat, long lon,
				Integer numCas, Integer numMort, Integer numRicov, Integer numIsol, Date currentData, Date datainizio,
				Date datafine) {
			super();
			this.NomNaz = nomNaz;
			this.CodPaes = codPaes;
			this.Prov = prov;
			this.NomCit = nomCit;
			this.CodCit = codCit;
			this.Lat = lat;
			this.lon = lon;
			this.NumCas = numCas;
			this.NumMort = numMort;
			this.NumRicov = numRicov;
			this.NumIsol = numIsol;
			this.CurrentData = currentData;
			this.datainizio = datainizio;
			this.datafine = datafine;
		}

		public Dati() {
			this.NomNaz = null;
			this.CodPaes = null;
			this.Prov = null;
			this.NomCit = null;
			this.CodCit = null;
			this.Lat = 0;
			this.lon = 0;
			this.NumCas = 0;
			this.NumMort = 0;
			this.NumRicov = 0;
			this.NumIsol = 0;
			this.CurrentData = null;
			this.datainizio = null;
			this.datafine = null;
		
		}
	    
		public String getCodPaes() {
			return CodPaes;
		}

		public void setCodPaes(String codPaes) {
			CodPaes = codPaes;
		}

		public String getProv() {
			return Prov;
		}

		public void setProv(String prov) {
			Prov = prov;
		}

		public String getNomCit() {
			return NomCit;
		}

		public void setNomCit(String nomCit) {
			NomCit = nomCit;
		}

		public String getCodCit() {
			return CodCit;
		}

		public void setCodCit(String codCit) {
			CodCit = codCit;
		}

		public long getLat() {
			return Lat;
		}

		public void setLat(long lat) {
			Lat = lat;
		}

		public long getLon() {
			return lon;
		}

		public void setLon(long lon) {
			this.lon = lon;
		}

		public Integer getNumRicov() {
			return NumRicov;
		}

		public void setNumRicov(Integer numRicov) {
			NumRicov = numRicov;
		}

		public Integer getNumIsol() {
			return NumIsol;
		}

		public void setNumIsol(Integer numIsol) {
			NumIsol = numIsol;
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

		

		public Integer getNumMort() {
			return NumMort;
		}

		public void setNumMort(Integer numMort) {
			NumMort = numMort;
		}

		
	
		
		
}

package Statistiche.covid.ConfrontoCovidNazioni.modello;




/**
 * Rappresenta la classe con i Dati dei vari paesi
 * @author Marco Cervigni
 * 
 *
 */


public class Dati {
        protected String NomNaz;
        protected String CodPaes;
        protected String Prov;
        protected String NomCit;
        protected String CodCit;
        protected String Lat;
        protected String lon;
        
        protected Long NumCas;
		protected Long NumMort;
		protected Long NumRicov;
		protected Long NumIsol;
		protected String CurrentData;
		
	    
		
	    

	
		public Dati(String nomNaz, String codPaes, String prov, String nomCit, String codCit, String lat, String lon,
				Long numCas, Long numMort, Long numRicov, Long numIsol, String currentData) {
			super();
			NomNaz = nomNaz;
			CodPaes = codPaes;
			Prov = prov;
			NomCit = nomCit;
			CodCit = codCit;
			this.Lat = lat;
			this.lon = lon;
			NumCas = numCas;
			NumMort = numMort;
			NumRicov = numRicov;
			NumIsol = numIsol;
			CurrentData = currentData;
			
			
		}

		public Dati() {
			this.NomNaz = null;
			this.CodPaes = null;
			this.Prov = null;
			this.NomCit = null;
			this.CodCit = null;
			this.Lat = null;
			this.lon = null;
			this.NumCas = null;
			this.NumMort = null;
			this.NumRicov = null;
			this.NumIsol = null;
			this.CurrentData = null;
		
		
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

		public String getLat() {
			return Lat;
		}

		public void setLat(String lat) {
			Lat = lat;
		}

		public String getLon() {
			return lon;
		}

		public void setLon(String lon) {
			this.lon = lon;
		}

		public String getNomNaz() {
			return NomNaz;
		}

		public void setNomNaz(String nomNaz) {
			NomNaz = nomNaz;
		}
		
		

		public Long getNumCas() {
			return NumCas;
		}

		public void setNumCas(Long numCas) {
			NumCas = numCas;
		}

		public Long getNumMort() {
			return NumMort;
		}

		public void setNumMort(Long numMort) {
			NumMort = numMort;
		}

		public Long getNumRicov() {
			return NumRicov;
		}

		public void setNumRicov(Long numRicov) {
			NumRicov = numRicov;
		}

		public Long getNumIsol() {
			return NumIsol;
		}

		public void setNumIsol(Long numIsol) {
			NumIsol = numIsol;
		}

		public String getCurrentData() {
			return CurrentData;
		}

		public void setCurrentData(String currentData) {
			CurrentData = currentData;
		}

		
		

		
		
	
		
		
}

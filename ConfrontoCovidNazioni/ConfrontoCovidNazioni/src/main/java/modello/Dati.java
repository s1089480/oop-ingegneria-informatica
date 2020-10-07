package modello;

import java.util.Date;

/**
 * 
 * @author cervoz
 * 
 *
 */

public class Dati {

	    protected Date datainizio;
	    protected Date datafine;
		protected Integer casi;
		protected Integer guarigioni;
		protected Integer decessi;
		
		public Dati(Integer casi, Integer guarigioni, Integer decessi, Date datainizio, Date datafine) {
			super();
			this.datainizio= datainizio;
			this.datafine= datafine;
			this.casi = casi;
			this.guarigioni = guarigioni;
			this.decessi = decessi;
		}
		
		public Dati() {
			this.casi=null;
			this.guarigioni=null;
			this.decessi=null;
			this.datainizio=null;
			this.datafine=null;
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

		
		public Integer getCasi() {
			return casi;
		}

		public void setCasi(Integer casi) {
			this.casi = casi;
		}

		public Integer getGuarigioni() {
			return guarigioni;
		}

		public void setGuarigioni(Integer guarigioni) {
			this.guarigioni = guarigioni;
		}

		public Integer getDecessi() {
			return decessi;
		}
		
		 void setDecessi(Integer decessi) {
			this.decessi = decessi;
		}
		
		
		
}

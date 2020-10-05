package parametriPaesi;

/**
 * 
 * @author cervoz
 * 
 *
 */


public class Nazione {

		protected Integer casi;
		protected Integer guarigioni;
		protected Integer decessi;
		public Nazione(Integer casi, Integer guarigioni, Integer decessi) {
			super();
			this.casi = casi;
			this.guarigioni = guarigioni;
			this.decessi = decessi;
		}
		
		public Nazione() {
			this.casi=null;
			this.guarigioni=null;
			this.decessi=null;
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

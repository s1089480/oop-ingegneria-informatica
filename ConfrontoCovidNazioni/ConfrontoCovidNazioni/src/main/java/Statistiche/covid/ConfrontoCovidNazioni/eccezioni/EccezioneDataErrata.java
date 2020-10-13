package Statistiche.covid.ConfrontoCovidNazioni.eccezioni;

public class EccezioneDataErrata extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public EccezioneDataErrata(String messaggio){
		
		super(messaggio);

	}
}

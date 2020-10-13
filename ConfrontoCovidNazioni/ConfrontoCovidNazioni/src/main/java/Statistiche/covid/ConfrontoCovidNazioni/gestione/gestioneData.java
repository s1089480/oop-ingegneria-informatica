package Statistiche.covid.ConfrontoCovidNazioni.gestione;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class gestioneData {

	
	
		
	public static Date convertidata(String datastring) throws ParseException{
	 
		Date date1=new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'").parse(datastring);
		return date1;
	}
	
	
	
	
}

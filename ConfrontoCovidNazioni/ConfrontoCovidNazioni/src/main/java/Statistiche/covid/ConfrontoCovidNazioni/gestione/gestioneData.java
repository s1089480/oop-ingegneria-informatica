package Statistiche.covid.ConfrontoCovidNazioni.gestione;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class gestioneData {

	private static String stringaData;
	public gestioneData() {
		stringaData = "aaaa-MM-gg oo:mm:ss";
	}
	
	public static String getFormat(long millisecondi) {	
		if(millisecondi==0) stringaData = "";
		if(millisecondi>=1000) stringaData = "ss";	//If the time in milliseconds is > of 1000 we are talking about seconds
		if(millisecondi>=60000) stringaData = "mm";	//If the time in milliseconds is > of 60000 we are talking about seconds
		if(millisecondi>=3600000) stringaData = "oo";	//If the time in milliseconds is > of 3600000 we are talking about seconds
		if(millisecondi>=86400000) stringaData = "GG";	//If the time in milliseconds is > of 86400000 we are talking about seconds
		if(millisecondi>=Long.parseLong("2629800000")) stringaData = "M";	//If the time in milliseconds is > of 2629800000 we are talking about seconds
		if(millisecondi>=Long.parseLong("31557600000")) stringaData = "A";	//If the time in milliseconds is > of 31557600000 we are talking about seconds
		return stringaData;
	}
	
	public static String toString(long millsec) {
		switch(gestioneData.getFormat(millsec)) {  // This switch case allows to compose a string matching the correct format
			case "":
				return "0 ss";
				
			case "ss":
				return (millsec/1000)+"ss";
				
			case "mm":
				return (millsec/60000)+"mm"
						+ ((millsec%60000)/1000)+"ss";
				
			case "oo": 
				return (int)(millsec/3600000)+"oo"+(int)((millsec%3600000)/60000)+"mm"+ (int)((((millsec%3600000)%60000))/1000)+"ss";
				
			case "G":
				return (int)(millsec/86400000)+"GG"+(int)((millsec%86400000)/3600000)+"oo" + (int)(((millsec%86400000)%3600000)/60000)+"mm"+(int)((((millsec%86400000)%3600000)%60000)/1000)+"ss ";                    
				
			case "M":
				return (int)(millsec/Long.parseLong("2629800000"))+"MM "+(int)((millsec%Long.parseLong("2629800000"))/86400000)+"GG"+(int)(((millsec%Long.parseLong("2629800000"))%86400000)/3600000)+"oo"+(int)((((millsec%Long.parseLong("2629800000"))%86400000)%3600000)/60000)+"mm "+(int)(((((millsec%Long.parseLong("2629800000"))%86400000)%3600000)%60000)/1000)+"ss";
			
		}
		return null;
		
	}
	
	public static Date convertidata(String datastring) throws ParseException{
	 
		Date date1=new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'").parse(datastring);
		return date1;
	}
	
	public static void setFormat(String stringaData) {
		gestioneData.stringaData = stringaData;
	}
	
	
}

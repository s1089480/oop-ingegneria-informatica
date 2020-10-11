package Statistiche.covid.ConfrontoCovidNazioni.gestione;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class gestioneData {

	private static String format;
	public gestioneData() {
		format = "yyyy-MM-dd HH:mm:ss";
	}
	
	public static String getFormat(long milliSecs) {	
		if(milliSecs==0) format = "";
		if(milliSecs>=1000) format = "ss";	//If the time in milliseconds is > of 1000 we are talking about seconds
		if(milliSecs>=60000) format = "mm";	//If the time in milliseconds is > of 60000 we are talking about seconds
		if(milliSecs>=3600000) format = "hh";	//If the time in milliseconds is > of 3600000 we are talking about seconds
		if(milliSecs>=86400000) format = "D";	//If the time in milliseconds is > of 86400000 we are talking about seconds
		if(milliSecs>=Long.parseLong("2629800000")) format = "M";	//If the time in milliseconds is > of 2629800000 we are talking about seconds
		if(milliSecs>=Long.parseLong("31557600000")) format = "Y";	//If the time in milliseconds is > of 31557600000 we are talking about seconds
		return format;
	}
	
	public static String toString(long millis) {
		switch(gestioneData.getFormat(millis)) {  // This switch case allows to compose a string matching the correct format
			case "":
				return "0 ss";
				
			case "ss":
				return (millis/1000)+"ss";
				
			case "mm":
				return (millis/60000)+"mm"
						+ ((millis%60000)/1000)+"ss";
				
			case "hh": 
				return (int)(millis/3600000)+"hh"+(int)((millis%3600000)/60000)+"mm"+ (int)((((millis%3600000)%60000))/1000)+"ss";
				
			case "D":
				return (int)(millis/86400000)+"DD"+(int)((millis%86400000)/3600000)+"hh" + (int)(((millis%86400000)%3600000)/60000)+"mm"+(int)((((millis%86400000)%3600000)%60000)/1000)+"ss ";                    
				
			case "M":
				return (int)(millis/Long.parseLong("2629800000"))+"MM "+(int)((millis%Long.parseLong("2629800000"))/86400000)+"DD "+(int)(((millis%Long.parseLong("2629800000"))%86400000)/3600000)+"hh "+(int)((((millis%Long.parseLong("2629800000"))%86400000)%3600000)/60000)+"mm "+(int)(((((millis%Long.parseLong("2629800000"))%86400000)%3600000)%60000)/1000)+"ss";
			
		}
		return new jsonError("An error occurred during the date parsing",500,"DateParsingError").toString();
	}
	
	public static void setFormat(String format) {
		gestioneData.format = format;
	}
	
	public static String checkFormat(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		Date test;
		
		try {
			test = sdf.parse(dateString); 		//if the parse of the date thrown an exception it means that it's not been written correctly
		} catch (ParseException e) {
			return "";							//if the date is invalid a blank String is returned
		}
		
		String[] dateParse = dateString.split("-");// these 3 controls allow to check if our date is 100% matching the date format on the listReviews response JSON
		if((Integer.parseInt(dateParse[2])>31)||(Integer.parseInt(dateParse[1])>12)||(Integer.parseInt(dateParse[2])<1)||(Integer.parseInt(dateParse[1])<1)||(Integer.parseInt(dateParse[0])<1970)) return "";
		
		if((Integer.parseInt(dateParse[1])<10)&&(!dateParse[2].contains("0"))){  // changes 2020/9/08 in 2020/09/08
			dateParse[1] = "0"+dateParse[1];
		}
		if((Integer.parseInt(dateParse[2])<10)&&(!dateParse[2].contains("0"))){	 // changes 2020/09/8 in 2020/09/08
			dateParse[2] = "0"+dateParse[2];
		}
		if(test.after(new Date(System.currentTimeMillis()))) return "";
		return dateParse[0]+"-"+dateParse[1]+"-"+dateParse[2]; 					//The corrected string is reassembled and returned
		
	}
}

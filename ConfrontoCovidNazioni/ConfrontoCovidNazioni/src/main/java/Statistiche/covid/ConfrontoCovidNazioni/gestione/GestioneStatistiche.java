package Statistiche.covid.ConfrontoCovidNazioni.gestione;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Statistiche.covid.ConfrontoCovidNazioni.modello.Dati;

public class GestioneStatistiche {

	
	
	  public static double mediaArrayList(ArrayList<Long> array) {
		  double a=0;
		  for(int i=0;i<array.size();i++) {
			  a+=array.get(i);
		  }
		  return a/array.size();
	  }
	  
	  public static double DeviazioneStandard(ArrayList<Long> array) {
		  double b=mediaArrayList(array);
		 double c=0;
		  for(int i=0;i<array.size();i++) {
			  c+=Math.pow((array.get(i)-b),2);
		  }
		  
		  return Math.sqrt(c/(array.size()-1));
	  }
	    
      public static double mediaCasi(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  ArrayList<Long> arraycasi=new ArrayList<Long>();
    	  
    	  
    	  for(int k=0;k<DatiPaese.size();k++) {
    		  
    		  Dati dato= new Dati();
    		  JSONObject obj;
    		  obj=(JSONObject)DatiPaese.get(k);
    		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
  					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
  			{
    			  dato.setNumCas((Long) obj.get("Confirmed"));
    			  arraycasi.add(dato.getNumCas());
  			}
    	  }
    	  return mediaArrayList(arraycasi);
    	 
    	  
      }
      
      public  static double mediaMorti(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  ArrayList<Long> arraymorti=new ArrayList<Long>();
    	  
    	  for(int k=0;k<DatiPaese.size();k++) {
    		  
    		  Dati dato= new Dati();
    		  JSONObject obj;
    		  obj=(JSONObject)DatiPaese.get(k);
    		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
  					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
  			{
    			  dato.setNumMort((Long) obj.get("Deaths"));
    			  arraymorti.add(dato.getNumMort());  			}
    	  }
    	  return mediaArrayList(arraymorti);
    	  
      }
      
      public static double mediaRicoverati(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  ArrayList<Long> arrayRicov=new ArrayList<Long>();
    	  
    	  for(int k=0;k<DatiPaese.size();k++) {
    		  
    		  Dati dato= new Dati();
    		  JSONObject obj;
    		  obj=(JSONObject)DatiPaese.get(k);
    		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
  					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
  			{
    			  dato.setNumRicov((Long) obj.get("Recovered"));
    			  arrayRicov.add(dato.getNumRicov());
  			}
    	  }
    	  return mediaArrayList(arrayRicov);    	  
      }
      
      public static long massimoNumeroCasi(JSONArray DatiPaese,String data1,String data2) throws ParseException {

    	  ArrayList<Long> ArrayMaxCasi=new ArrayList<Long>();

      for(int k=0;k<DatiPaese.size();k++) {
    		  Dati dato= new Dati();
    		  JSONObject obj;
    		  obj=(JSONObject)DatiPaese.get(k);
    		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
  					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
  			{
    			  dato.setNumCas((Long) obj.get("Confirmed"));
    			  ArrayMaxCasi.add(dato.getNumCas());
      }
    		  
}
      return Collections.max(ArrayMaxCasi);

}
      
      public static long massimoNumeroMorti(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  
    	  ArrayList<Long> ArrayMaxMorti=new ArrayList<Long>();
    	  
          for(int k=0;k<DatiPaese.size();k++) {
        		  
        		  Dati dato= new Dati();
        		  JSONObject obj;
        		  obj=(JSONObject)DatiPaese.get(k);
        		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
      					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
      					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
      					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
      			{
        			  dato.setNumMort((Long) obj.get("Deaths"));
        			  ArrayMaxMorti.add(dato.getNumMort());
        			  
          }
          
          
    }
          return Collections.max(ArrayMaxMorti);

    }
      
      public static long massimoNumeroRicoverati(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	 
    	  ArrayList<Long> ArrayMaxRicoverati=new ArrayList<Long>();
    	  
          for(int k=0;k<DatiPaese.size();k++) {
        		  
        		  Dati dato= new Dati();
        		  JSONObject obj;
        		  obj=(JSONObject)DatiPaese.get(k);
        		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
      					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
      					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
      					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
      			{
        			  dato.setNumRicov((Long) obj.get("Recovered"));
        			  ArrayMaxRicoverati.add(dato.getNumRicov());
          }
          
          
    }
          return Collections.max(ArrayMaxRicoverati);

    }
      
      public static double DeviazioneStandardCasi(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  
    	  ArrayList<Long> ArrayDevStandCasi = new ArrayList<Long>();
for(int k=0;k<DatiPaese.size();k++) {
    		  
    		  Dati dato= new Dati();
    		  JSONObject obj;
    		  obj=(JSONObject)DatiPaese.get(k);
    		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
  					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
    		  {
    			  dato.setNumCas((Long) obj.get("Confirmed"));
    			  ArrayDevStandCasi.add(dato.getNumCas());    		  }
      }
  				return DeviazioneStandard(ArrayDevStandCasi);
      
      
}
      
  public static double DeviazioneStandardMorti(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  
    	  ArrayList<Long> ArrayDevStandMort = new ArrayList<Long>();
for(int k=0;k<DatiPaese.size();k++) {
    		  
    		  Dati dato= new Dati();
    		  JSONObject obj;
    		  obj=(JSONObject)DatiPaese.get(k);
    		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
  					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
  					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
    		  {
    			  dato.setNumMort((Long) obj.get("Deaths"));
    			  ArrayDevStandMort.add(dato.getNumMort());    		  }
      }
  				return DeviazioneStandard(ArrayDevStandMort);
      
      
}
  
  public static double DeviazioneStandardRicoverati(JSONArray DatiPaese,String data1,String data2) throws ParseException {
	  
	  ArrayList<Long> ArrayDevStandRicov = new ArrayList<Long>();
for(int k=0;k<DatiPaese.size();k++) {
		  
		  Dati dato= new Dati();
		  JSONObject obj;
		  obj=(JSONObject)DatiPaese.get(k);
		  if(((gestioneData.convertidata((String)obj.get("Date"))).after(gestioneData.convertidata(data1))
					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data1))))
					&&((gestioneData.convertidata((String)obj.get("Date")).before(gestioneData.convertidata(data2)))
					||((gestioneData.convertidata((String)obj.get("Date"))).equals(gestioneData.convertidata(data2)))))
		  {
			  dato.setNumRicov((Long) obj.get("Recovered"));
			  ArrayDevStandRicov.add(dato.getNumRicov());    		  }
  }
				return DeviazioneStandard(ArrayDevStandRicov);
  
  
} 
  
  //differenza percentuale: media 1 paese diviso media di un altro per 100, lo stesso deviazione standard
}      
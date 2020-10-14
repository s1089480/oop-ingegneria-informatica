package Statistiche.covid.ConfrontoCovidNazioni.gestione;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Statistiche.covid.ConfrontoCovidNazioni.modello.Dati;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Statistiche;

public class GestioneStatistiche {

	
	    
      public  static double mediaCasi(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  double a=0;
    	  
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
    			  a+=dato.getNumCas();
  			}
    	  }
    	  return a/(DatiPaese.size());
    	  
      }
      
      public  static double mediaMorti(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  double b=0;
    	  
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
    			  b+=dato.getNumMort();
  			}
    	  }
    	  return b/(DatiPaese.size());
    	  
      }
      
      public static double mediaRicoverati(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  double c=0;
    	  
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
    			  c+=dato.getNumRicov();
  			}
    	  }
    	  return c/(DatiPaese.size());
    	  
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
        			  ArrayMaxRicoverati.add(dato.getNumMort());
          }
          
          
    }
          return Collections.max(ArrayMaxRicoverati);

    }
      
      
}
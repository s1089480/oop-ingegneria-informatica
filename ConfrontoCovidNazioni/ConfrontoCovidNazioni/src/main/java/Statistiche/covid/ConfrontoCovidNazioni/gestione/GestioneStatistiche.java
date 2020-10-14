package Statistiche.covid.ConfrontoCovidNazioni.gestione;

import java.text.ParseException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Statistiche.covid.ConfrontoCovidNazioni.modello.Dati;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Statistiche;

public class GestioneStatistiche {

	
	    
      public  static long mediaCasi(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  long a=0;
    	  
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
      
      public  static long mediaMorti(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  long b=0;
    	  
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
      
      public  static long mediaRicoverati(JSONArray DatiPaese,String data1,String data2) throws ParseException {
    	  long c=0;
    	  
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
      
}

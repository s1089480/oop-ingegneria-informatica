package Statistiche.covid.ConfrontoCovidNazioni.database;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.security.Key;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

import Statistiche.covid.ConfrontoCovidNazioni.modello.Dati;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Metadati;
import Statistiche.covid.ConfrontoCovidNazioni.modello.StatConfronto;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Statistiche;
import Statistiche.covid.ConfrontoCovidNazioni.gestione.gestioneData;
import Statistiche.covid.ConfrontoCovidNazioni.gestione.GestioneStatistiche;

import java.net.URL;



public class Data_base  {

	private static ArrayList<Metadati> metadati = new ArrayList<Metadati>();
	public static JSONArray intmap1 = new JSONArray();
	public static JSONArray intmap2 = new JSONArray();
	public static JSONArray intmap3 = new JSONArray();
	public static ArrayList<Dati> DatiSpagna = new ArrayList<Dati>()  ;
	public static ArrayList<Dati> DatiSvezia = new ArrayList<Dati>();
	public static ArrayList<Dati> DatiItalia = new ArrayList<Dati>();
	static String s="";
	static String p="";
	static String q="";
	
	
	public static void Scaricadati() throws IOException
	{
		int a=0;
		int b=0;
		int c=0;
		/**
		 * file contenente contagiati,ricoveri,morti in spagna nel mese di marzo
		 */

		File spagna = new File("Spagna.json");
		FileOutputStream Fspagna=new FileOutputStream(spagna);




		URL spagnaURL = new URL("https://api.covid19api.com/country/spain?from=2020-04-01T00:00:00Z&to=2020-08-31T00:00:00Z");
		URLConnection URLConnsp= spagnaURL.openConnection();
		InputStream input1=URLConnsp.getInputStream();


		while((a=input1.read())!=-1)
		{
			Fspagna.write(a);
			s+=(char)a;
		}
		FileReader reader1 = new FileReader ("Spagna.json");



		JSONArray objSpagna;


		try {
			Object o1 = JSONValue.parseWithException(s);
			objSpagna = (JSONArray)o1;
			 intmap1= objSpagna;
			

		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		reader1.close();
		input1.close();
		Fspagna.close();

		/**
		 * file contenente contagiati,ricoveri,morti in svezia nel mese di marzo
		 */

		File svezia = new File("Svezia.json");
		FileOutputStream Fsvezia=new FileOutputStream(svezia);



		URL sveziaURL = new URL("https://api.covid19api.com/country/sweden?from=2020-04-01T00:00:00Z&to=2020-08-31T00:00:00Z");
		URLConnection URLConnsv= sveziaURL.openConnection();
		InputStream input2=URLConnsv.getInputStream();

		while((b=input2.read())!=-1)
		{
			Fsvezia.write(b);
			p+=(char)b;
		}
		FileReader reader2 = new FileReader ("svezia.json");

		JSONArray objSvezia;
		try {
			Object o2 = JSONValue.parseWithException(p);
			objSvezia = (JSONArray)o2;
		    intmap2=objSvezia;

		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		reader2.close();
		input2.close();
		Fsvezia.close();

		/**
		 * file contenente contagiati,ricoveri,morti in italia nel mese di marzo
		 */

		File Italia = new File("Italia.json");
		FileOutputStream Fitalia=new FileOutputStream(Italia);


		URL italiaURL = new URL("https://api.covid19api.com/country/italy?from=2020-04-01T00:00:00Z&to=2020-08-31T00:00:00Z");
		URLConnection URLConnit= italiaURL.openConnection();
		InputStream input3=URLConnit.getInputStream();

		while((c=input3.read())!=-1)
		{
			Fitalia.write(c);
			q+=(char)c;
		}
		FileReader reader3 = new FileReader ("italia.json");


		JSONArray objItalia;
		try {
			Object o3 = JSONValue.parseWithException(q);
			objItalia = (JSONArray)o3;
            intmap3=objItalia;
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reader3.close();
		input3.close();
		Fitalia.close();
		
		
	}





	public static ArrayList<ArrayList<Dati>> ottieniDati() {
		
		ArrayList<ArrayList<Dati>> listaPaesi = new ArrayList<ArrayList<Dati>>();
		
		listaPaesi.add(DatiSpagna);
		listaPaesi.add(DatiItalia);
		listaPaesi.add(DatiSvezia);
		return listaPaesi ;
		}
	
	
		

	public static ArrayList<Metadati> ottieniArrayMetadati() {

		metadati.add(new Metadati("NomNaz","Nome nazione","String"));
		metadati.add(new Metadati("CodPaes","Codice di nazione","String"));
		metadati.add(new Metadati("Prov","Provincia","String"));
		metadati.add(new Metadati("NomCit","Nome Città","String"));
		metadati.add(new Metadati("CodCit","Codice della città","String"));
		metadati.add(new Metadati("Lat","Latitudine","Double"));
		metadati.add(new Metadati("Lon","Longitudine","Double"));
		metadati.add(new Metadati("NumCas","Totale numero casi infetti","Integer"));
		metadati.add(new Metadati("NumMort","Totale numero deceduti","Integer"));
		metadati.add(new Metadati("NumRicov","Totale numero ricoverati","Integer"));
		metadati.add(new Metadati("NumIsol","Totale numero casi isolati","Integer"));
		metadati.add(new Metadati("CurrentData","data corrente","data"));
		return metadati;
	}	
	
	
	public static void convertiJSON (JSONArray json, ArrayList<Dati> lista,String datainizio,String datafine) throws ParseException {
		lista.clear();
		for(int i = 0; i < json.size(); i++) {
			Dati objdato = new Dati();
			
			JSONObject oggettojson;
			
			oggettojson = (JSONObject) json.get(i);
			if(((gestioneData.convertidata((String)oggettojson.get("Date"))).after(gestioneData.convertidata(datainizio))
					||((gestioneData.convertidata((String)oggettojson.get("Date"))).equals(gestioneData.convertidata(datainizio))))
					&&((gestioneData.convertidata((String)oggettojson.get("Date")).before(gestioneData.convertidata(datafine)))
					||((gestioneData.convertidata((String)oggettojson.get("Date"))).equals(gestioneData.convertidata(datafine)))))
			{
			objdato.setNomNaz((String) oggettojson.get("Country"));
			objdato.setCodPaes((String) oggettojson.get("CountryCode"));
			objdato.setProv((String) oggettojson.get("Province"));
			objdato.setNomCit((String) oggettojson.get("City"));
			objdato.setCodCit((String) oggettojson.get("CityCode"));
			objdato.setLat((String) oggettojson.get("Lat"));
			objdato.setLon((String) oggettojson.get("Lon"));
			objdato.setNumCas((Long) oggettojson.get("Confirmed"));
			objdato.setNumMort((Long) oggettojson.get("Deaths"));
			objdato.setNumRicov((Long) oggettojson.get("Recovered"));
			objdato.setNumIsol((Long) oggettojson.get("Active"));
			objdato.setCurrentData((String) oggettojson.get("Date"));
			lista.add(objdato);
			}
		}
}
	
	public static void convertigiornoJSON(JSONArray json, ArrayList<Dati> arraydati,String data) throws ParseException {
		
		arraydati.clear();
		for(int j=0;j<json.size();j++) {
			
			Dati oggettodato = new Dati();
			
			JSONObject oggetto;
			oggetto=(JSONObject)json.get(j);
			
			if(gestioneData.convertidata((String)oggetto.get("Date")).equals(gestioneData.convertidata(data))) {
				
				
				oggettodato.setNomNaz((String) oggetto.get("Country"));
				oggettodato.setCodPaes((String) oggetto.get("CountryCode"));
				oggettodato.setProv((String) oggetto.get("Province"));
				oggettodato.setNomCit((String) oggetto.get("City"));
				oggettodato.setCodCit((String) oggetto.get("CityCode"));
				oggettodato.setLat((String) oggetto.get("Lat"));
				oggettodato.setLon((String) oggetto.get("Lon"));
				oggettodato.setNumCas((Long) oggetto.get("Confirmed"));
				oggettodato.setNumMort((Long) oggetto.get("Deaths"));
				oggettodato.setNumRicov((Long) oggetto.get("Recovered"));
				oggettodato.setNumIsol((Long) oggetto.get("Active"));
				oggettodato.setCurrentData((String) oggetto.get("Date"));
				arraydati.add(oggettodato);
			}
		}
		
	}

	public static void estraiConfrontoStats(JSONArray jArray1,JSONArray jArray2,JSONArray jArray3,ArrayList<StatConfronto> statConfr,String data1, String data2) throws ParseException {
		
		statConfr.clear();
		
		
		Statistiche objstats1= new Statistiche();
		Statistiche objstats2= new Statistiche();
		Statistiche objstats3= new Statistiche();
		StatConfronto objconfronto1=new StatConfronto();
		


		objstats1.setMediaNumCasSpa(GestioneStatistiche.mediaCasi(jArray1,data1,data2));
		objstats1.setMediaNumMortSpa(GestioneStatistiche.mediaMorti(jArray1,data1,data2));
		objstats1.setMediaNumRicovSpa(GestioneStatistiche.mediaRicoverati(jArray1,data1,data2));
		objstats1.setMassimoNumCasSpa(GestioneStatistiche.massimoNumeroCasi(jArray1,data1,data2));
		objstats1.setMassimoNumMortSpa(GestioneStatistiche.massimoNumeroMorti(jArray1,data1,data2));
		objstats1.setMassimoNumRicovSpa(GestioneStatistiche.massimoNumeroRicoverati(jArray1,data1,data2));
		objstats1.setDevStandCasSpa(GestioneStatistiche.DeviazioneStandardCasi(jArray1,data1,data2));
		objstats1.setDevStandMortSpa(GestioneStatistiche.DeviazioneStandardMorti(jArray1,data1,data2));
		objstats1.setDevStandRicovSpa(GestioneStatistiche.DeviazioneStandardRicoverati(jArray1,data1,data2));
		
		objstats2.setMediaNumCasSve(GestioneStatistiche.mediaCasi(jArray2,data1,data2));
		objstats2.setMediaNumMortSve(GestioneStatistiche.mediaMorti(jArray2,data1,data2));
		objstats2.setMediaNumRicovSve(GestioneStatistiche.mediaRicoverati(jArray2,data1,data2));
		objstats2.setMassimoNumCasSve(GestioneStatistiche.massimoNumeroCasi(jArray2,data1,data2));
		objstats2.setMassimoNumMortSve(GestioneStatistiche.massimoNumeroMorti(jArray2,data1,data2));
		objstats2.setMassimoNumRicovSve(GestioneStatistiche.massimoNumeroRicoverati(jArray2,data1,data2));
		objstats2.setDevStandCasSve(GestioneStatistiche.DeviazioneStandardCasi(jArray2,data1,data2));
		objstats2.setDevStandMortSve(GestioneStatistiche.DeviazioneStandardMorti(jArray2,data1,data2));
		objstats2.setDevStandRicovSve(GestioneStatistiche.DeviazioneStandardRicoverati(jArray2,data1,data2));
		
		objstats3.setMediaNumCasIta(GestioneStatistiche.mediaCasi(jArray3,data1,data2));
		objstats3.setMediaNumMortIta(GestioneStatistiche.mediaMorti(jArray3,data1,data2));
		objstats3.setMediaNumRicovIta(GestioneStatistiche.mediaRicoverati(jArray3,data1,data2));
		objstats3.setMassimoNumCasIta(GestioneStatistiche.massimoNumeroCasi(jArray3,data1,data2));
		objstats3.setMassimoNumMortIta(GestioneStatistiche.massimoNumeroMorti(jArray3,data1,data2));
		objstats3.setMassimoNumRicovIta(GestioneStatistiche.massimoNumeroRicoverati(jArray3,data1,data2));
		objstats3.setDevStandCasIta(GestioneStatistiche.DeviazioneStandardCasi(jArray3,data1,data2));
		objstats3.setDevStandMortIta(GestioneStatistiche.DeviazioneStandardMorti(jArray3,data1,data2));
		objstats3.setDevStandRicovIta(GestioneStatistiche.DeviazioneStandardRicoverati(jArray3,data1,data2));

		
		
		objconfronto1.setPercentMediaCasiSpagSve((objstats1.getMediaNumCasSpa()/objstats2.getMediaNumCasSve())*100);
		objconfronto1.setPercentMediaMortiSpagSve((objstats1.getMediaNumMortSpa()/objstats2.getMediaNumMortSve())*100);
		objconfronto1.setPercentDevStandCasiSpagSve((objstats1.getDevStandCasSpa()/objstats2.getDevStandCasSve())*100);
		objconfronto1.setPercentDevStandMortiSpagSve((objstats1.getDevStandMortSpa()/objstats2.getDevStandMortSve())*100);
		
		objconfronto1.setPercentMediaCasiSveIta((objstats2.getMediaNumCasSve()/objstats3.getMediaNumCasIta())*100);
		objconfronto1.setPercentMediaMortiSveIta((objstats2.getMediaNumMortSve()/objstats3.getMediaNumMortIta())*100);
		objconfronto1.setPercentDevStandCasiSveIta((objstats2.getDevStandCasSve()/objstats3.getDevStandCasIta())*100);
		objconfronto1.setPercentDevStandMortiSveIta((objstats2.getDevStandMortSve()/objstats3.getDevStandMortIta())*100);
		
		objconfronto1.setPercentMediaCasiItaSpag((objstats3.getMediaNumCasIta()/objstats1.getMediaNumCasSpa())*100);
		objconfronto1.setPercentMediaMortiItaSpag((objstats3.getMediaNumMortIta()/objstats1.getMediaNumMortSpa())*100);
		objconfronto1.setPercentDevStandCasiItaSpag((objstats3.getDevStandCasIta()/objstats1.getDevStandCasSpa())*100);
		objconfronto1.setPercentDevStandMortiItaSpag((objstats3.getDevStandMortIta()/objstats1.getDevStandMortSpa())*100);
		
	
		
		statConfr.add(objconfronto1);
		
		

	}
	
	
	public static void estraiStats(JSONArray jArray1,JSONArray jArray2,JSONArray jArray3,ArrayList<Statistiche> stats,String data1, String data2) throws ParseException {
		
		stats.clear();
		Statistiche objstats1= new Statistiche();
		
		
		objstats1.setMediaNumCasSpa(GestioneStatistiche.mediaCasi(jArray1,data1,data2));
		objstats1.setMediaNumMortSpa(GestioneStatistiche.mediaMorti(jArray1,data1,data2));
		objstats1.setMediaNumRicovSpa(GestioneStatistiche.mediaRicoverati(jArray1,data1,data2));
		objstats1.setMassimoNumCasSpa(GestioneStatistiche.massimoNumeroCasi(jArray1,data1,data2));
		objstats1.setMassimoNumMortSpa(GestioneStatistiche.massimoNumeroMorti(jArray1,data1,data2));
		objstats1.setMassimoNumRicovSpa(GestioneStatistiche.massimoNumeroRicoverati(jArray1,data1,data2));
		objstats1.setDevStandCasSpa(GestioneStatistiche.DeviazioneStandardCasi(jArray1,data1,data2));
		objstats1.setDevStandMortSpa(GestioneStatistiche.DeviazioneStandardMorti(jArray1,data1,data2));
		objstats1.setDevStandRicovSpa(GestioneStatistiche.DeviazioneStandardRicoverati(jArray1,data1,data2));
		
		objstats1.setMediaNumCasSve(GestioneStatistiche.mediaCasi(jArray2,data1,data2));
		objstats1.setMediaNumMortSve(GestioneStatistiche.mediaMorti(jArray2,data1,data2));
		objstats1.setMediaNumRicovSve(GestioneStatistiche.mediaRicoverati(jArray2,data1,data2));
		objstats1.setMassimoNumCasSve(GestioneStatistiche.massimoNumeroCasi(jArray2,data1,data2));
		objstats1.setMassimoNumMortSve(GestioneStatistiche.massimoNumeroMorti(jArray2,data1,data2));
		objstats1.setMassimoNumRicovSve(GestioneStatistiche.massimoNumeroRicoverati(jArray2,data1,data2));
		objstats1.setDevStandCasSve(GestioneStatistiche.DeviazioneStandardCasi(jArray2,data1,data2));
		objstats1.setDevStandMortSve(GestioneStatistiche.DeviazioneStandardMorti(jArray2,data1,data2));
		objstats1.setDevStandRicovSve(GestioneStatistiche.DeviazioneStandardRicoverati(jArray2,data1,data2));
		
		objstats1.setMediaNumCasIta(GestioneStatistiche.mediaCasi(jArray3,data1,data2));
		objstats1.setMediaNumMortIta(GestioneStatistiche.mediaMorti(jArray3,data1,data2));
		objstats1.setMediaNumRicovIta(GestioneStatistiche.mediaRicoverati(jArray3,data1,data2));
		objstats1.setMassimoNumCasIta(GestioneStatistiche.massimoNumeroCasi(jArray3,data1,data2));
		objstats1.setMassimoNumMortIta(GestioneStatistiche.massimoNumeroMorti(jArray3,data1,data2));
		objstats1.setMassimoNumRicovIta(GestioneStatistiche.massimoNumeroRicoverati(jArray3,data1,data2));
		objstats1.setDevStandCasIta(GestioneStatistiche.DeviazioneStandardCasi(jArray3,data1,data2));
		objstats1.setDevStandMortIta(GestioneStatistiche.DeviazioneStandardMorti(jArray3,data1,data2));
		objstats1.setDevStandRicovIta(GestioneStatistiche.DeviazioneStandardRicoverati(jArray3,data1,data2));
	
		stats.add(objstats1);
	}
	

}




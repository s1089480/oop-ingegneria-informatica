package Statistiche.covid.ConfrontoCovidNazioni.database;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayList;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import Statistiche.covid.ConfrontoCovidNazioni.modello.Dati;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Metadati;

import java.net.URL;



public class Data_base  {

	private static ArrayList<Metadati> metadati = new ArrayList<Metadati>();
	private static ArrayList<Dati> DatiSpagna = new ArrayList<Dati>()  ;
	private static ArrayList<Dati> DatiSvezia = new ArrayList<Dati>();
	private static ArrayList<Dati> DatiItalia = new ArrayList<Dati>();
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




		URL spagnaURL = new URL("https://api.covid19api.com/country/spain?from=2020-03-01T00:00:00Z&to=2020-04-01T00:00:00Z");
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
			System.out.println("SGSG");
			convertiJSON(objSpagna, DatiSpagna);

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



		URL sveziaURL = new URL("https://api.covid19api.com/country/sweden?from=2020-03-01T00:00:00Z&to=2020-04-01T00:00:00Z");
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
			System.out.println("SGSG");
			convertiJSON(objSvezia, DatiSvezia);

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


		URL italiaURL = new URL("https://api.covid19api.com/country/italy?from=2020-03-01T00:00:00Z&to=2020-04-01T00:00:00Z");
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
			System.out.println("SGSG");
			convertiJSON(objItalia, DatiItalia);
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reader3.close();
		input3.close();
		Fitalia.close();
		
		
	}





	public static ArrayList<ArrayList<Dati>> getDati() {
		ArrayList<ArrayList<Dati>> listaPaesi = new ArrayList<ArrayList<Dati>>();
		listaPaesi.add(DatiSpagna);
		listaPaesi.add(DatiItalia);
		listaPaesi.add(DatiSvezia);
		return listaPaesi ;
	}	

	public static ArrayList<Metadati> getArrayMetadati() {

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
	
	
	private static void convertiJSON (JSONArray json, ArrayList<Dati> lista) {
		Dati dato = new Dati();
		JSONObject oggettojson;
		for(int i = 0; i < json.size(); i++) {
			
			oggettojson = (JSONObject) json.get(i);
			dato.setNomNaz((String) oggettojson.get("Country"));
			dato.setCodPaes((String) oggettojson.get("CountryCode"));
			dato.setProv((String) oggettojson.get("Province"));
			dato.setNomCit((String) oggettojson.get("City"));
			dato.setCodCit((String) oggettojson.get("CityCode"));
			dato.setLat((String) oggettojson.get("Lat"));
			dato.setLon((String) oggettojson.get("Lon"));
			dato.setNumCas((Long) oggettojson.get("Confirmed"));
			dato.setNumMort((Long) oggettojson.get("Deaths"));
			dato.setNumRicov((Long) oggettojson.get("Recovered"));
			dato.setNumIsol((Long) oggettojson.get("Active"));
			dato.setCurrentData((String) oggettojson.get("Date"));
			lista.add(dato);
		}
	}


}




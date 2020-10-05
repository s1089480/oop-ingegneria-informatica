package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URL;
import java.net.MalformedURLException;



public class Data_base 
{

	public static void Scaricadati() throws Exception 
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
		
	}
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
	
}
input2.close();
Fsvezia.close();

/**
 * file contenente contagiati,ricoveri,morti negli stati univi nel mese di marzo
 */

File StatiUniti = new File("StatiUniti.json");
FileOutputStream Fstatiuniti=new FileOutputStream(StatiUniti);




URL statiunitiURL = new URL("https://api.covid19api.com/country/US?from=2020-03-01T00:00:00Z&to=2020-04-01T00:00:00Z");
URLConnection URLConnst= statiunitiURL.openConnection();
InputStream input3=URLConnst.getInputStream();

while((c=input3.read())!=-1)
{
Fstatiuniti.write(c);

}
input3.close();
Fstatiuniti.close();
	
}
	
	
	}


	

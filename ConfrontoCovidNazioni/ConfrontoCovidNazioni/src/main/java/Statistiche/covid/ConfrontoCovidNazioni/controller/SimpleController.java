package Statistiche.covid.ConfrontoCovidNazioni.controller;

import java.text.ParseException;
import java.util.ArrayList;

import javax.xml.crypto.Data;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Statistiche.covid.ConfrontoCovidNazioni.database.Data_base;
import Statistiche.covid.ConfrontoCovidNazioni.eccezioni.Eccezioni;
import Statistiche.covid.ConfrontoCovidNazioni.gestione.gestioneData;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Dati;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Metadati;
import Statistiche.covid.ConfrontoCovidNazioni.modello.StatConfronto;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Statistiche;


@RestController
public class SimpleController {

	
	@RequestMapping(value = "/metadati", method=RequestMethod.GET)
	public ResponseEntity<ArrayList<Metadati>> getMetadata(){
		
		//return Data_base.getArrayMetadati();
		return new ResponseEntity<ArrayList<Metadati>>(Data_base.ottieniArrayMetadati(), HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/datigiorno", method=RequestMethod.POST)
	public ArrayList<ArrayList<Dati>> ottieniDatiSingoloGiorno(@RequestParam(name="giorno") String giorno) throws ParseException, Eccezioni {
		if(((gestioneData.convertidata(giorno).after(gestioneData.convertidata("2020-03-31T00:00:00Z"))))
				&&((gestioneData.convertidata(giorno).before(gestioneData.convertidata("2020-09-01T00:00:00Z"))))) {
		Data_base.convertigiornoJSON(Data_base.intmap1,Data_base.DatiSpagna,giorno);
		Data_base.convertigiornoJSON(Data_base.intmap2,Data_base.DatiSvezia,giorno);
		Data_base.convertigiornoJSON(Data_base.intmap3,Data_base.DatiItalia,giorno);

		
		}else throw new Eccezioni("il giorno dev'essere compreso tra il 2020-03-01 e il 2020-08-31");
		return Data_base.ottieniDati();
     }
	
	
	
	@RequestMapping(value = "/datiperiodo", method=RequestMethod.POST)
    public ArrayList<ArrayList<Dati>> ottieniDatiPerPeriodo(@RequestParam(name="from") String from, @RequestParam(name="to") String to) throws ParseException, Eccezioni
	{
		
		if(((gestioneData.convertidata(from).after(gestioneData.convertidata("2020-03-31T00:00:00Z"))))
				&&((gestioneData.convertidata(to).before(gestioneData.convertidata("2020-09-01T00:00:00Z")))))
		{
		if(gestioneData.convertidata(to).after(gestioneData.convertidata(from)))
		{
         Data_base.convertiJSON(Data_base.intmap1,Data_base.DatiSpagna,from,to);
         Data_base.convertiJSON(Data_base.intmap2,Data_base.DatiSvezia,from,to);
         Data_base.convertiJSON(Data_base.intmap3,Data_base.DatiItalia,from,to);
		
		}else throw new Eccezioni("la data 'from' deve essere antecedente rispetto alla data 'to' !!");
		}
		else throw new Eccezioni("inserire una data compresa tra il 2020-04-01 e il 2020-08-31 ");
		return Data_base.ottieniDati();
    }
	
	@RequestMapping(value="/statistiche",method=RequestMethod.POST)
    public ArrayList<Statistiche> ottieniStatisticheSvezia(@RequestParam(name="from") String from, @RequestParam(name="to") String to) throws ParseException, Eccezioni{
		    ArrayList<Statistiche> statistiche= new ArrayList<Statistiche>();
		    if(((gestioneData.convertidata(from).after(gestioneData.convertidata("2020-02-29T00:00:00Z"))))
					&&((gestioneData.convertidata(to).before(gestioneData.convertidata("2020-09-01T00:00:00Z")))))
			{
			if(gestioneData.convertidata(to).after(gestioneData.convertidata(from)))
			{
			Data_base.estraiStats(Data_base.intmap1,Data_base.intmap2,Data_base.intmap3, statistiche,from,to);
			}else throw new Eccezioni("la data 'from' deve essere antecedente rispetto alla data 'to' !!");
			
			}else throw new Eccezioni("inserire una data compresa tra il 2020-03-01 e il 2020-08-31 ");
		   return statistiche;
	}
	
	@RequestMapping(value="/confrontoStat",method=RequestMethod.POST)
    public ArrayList<StatConfronto> ottieniStatisticheSpagna(@RequestParam(name="from") String from, @RequestParam(name="to") String to) throws ParseException, Eccezioni{
		    ArrayList<StatConfronto> confrontoStatistiche= new ArrayList<StatConfronto>();
		    if(((gestioneData.convertidata(from).after(gestioneData.convertidata("2020-03-31T00:00:00Z"))))
					&&((gestioneData.convertidata(to).before(gestioneData.convertidata("2020-09-01T00:00:00Z")))))
			{
			if(gestioneData.convertidata(to).after(gestioneData.convertidata(from)))
			{
			Data_base.estraiConfrontoStats(Data_base.intmap1,Data_base.intmap2,Data_base.intmap3, confrontoStatistiche,from,to);
			
			}else throw new Eccezioni("la data 'from' deve essere antecedente rispetto alla data 'to' !!");
			
			}else throw new Eccezioni("inserire una data compresa tra il 2020-04-01 e il 2020-08-31 ");
		   return confrontoStatistiche;
	}
	
	
	


	
		

}
	

    
    
    
    

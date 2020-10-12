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
import Statistiche.covid.ConfrontoCovidNazioni.modello.Dati;
import Statistiche.covid.ConfrontoCovidNazioni.modello.Metadati;


@RestController
public class SimpleController {

	
	@RequestMapping(value = "/metadati", method=RequestMethod.GET)
	public ResponseEntity<ArrayList<Metadati>> getMetadata(){
		
		//return Data_base.getArrayMetadati();
		return new ResponseEntity<ArrayList<Metadati>>(Data_base.ottieniArrayMetadati(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/dati", method=RequestMethod.GET)
	public ArrayList<ArrayList<Dati>> ottieniTuttiIDati() {
		return Data_base.ottieniDati();
     }
	
	@RequestMapping(value = "/datiperiodo/{from}", method=RequestMethod.POST)
    public ArrayList<ArrayList<Dati>> ottieniDatiPerPeriodo(@PathVariable("from") String from) throws ParseException
	{
		Data_base.convertiJSON(Data_base.intmap, Data_base.DatiSpagna,from);
		return Data_base.ottieniDati();
        
		
    }
	
//	@RequestMapping(value= "/datipaese", method = RequestMethod.POST)
	//public ArrayList<Dati> OttieniDatiPaese(RequestBody String){
		
		

}
	

    
    
    
    

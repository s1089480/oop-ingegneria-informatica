package Statistiche.covid.ConfrontoCovidNazioni.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import database.Data_base;
import modello.Dati;
import modello.Metadati;


@RestController
public class SimpleController {

	
	@RequestMapping(value = "/metadati", method=RequestMethod.GET)
	public ResponseEntity<ArrayList<Metadati>> getMetadata(){
		
		//return Data_base.getArrayMetadati();
		return new ResponseEntity<ArrayList<Metadati>>(Data_base.getArrayMetadati(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/dati", method=RequestMethod.GET)
	public ArrayList<Dati> getDataWithGet() {
		
		return Data_base.getDati();
	}
}

package controller;

import java.util.ArrayList;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import database.Data_base;
import modello.Dati;
import modello.Metadati;


@RestController
public class SimpleController {

	
	@RequestMapping(value = "metadati", method=RequestMethod.GET)
	public ArrayList<Metadati> getMetadata(){
		
		return Data_base.getArrayMetadati();
	}
}
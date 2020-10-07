package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import modello.Dati;


@RestController
public class SimpleController {

	
		@GetMapping("/hello")
		public Dati ottienidati(@RequestParam(datainizio="datainizio",datafine="world",defaultvalue="boh") String file) {
			
			return new Dati("adriano","mancini");
		
	
}
}
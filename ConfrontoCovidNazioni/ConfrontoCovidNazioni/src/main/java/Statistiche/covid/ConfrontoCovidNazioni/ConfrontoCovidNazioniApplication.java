package Statistiche.covid.ConfrontoCovidNazioni;


import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Statistiche.covid.ConfrontoCovidNazioni.database.Data_base;

/**
 * All'avvio scarica i dati dall'url e avvia l'applicazione string
 * @author Marco Cervigni
 *
 */
@SpringBootApplication
public class ConfrontoCovidNazioniApplication {

	public static void main(String[] args) throws Exception 
	{
		SpringApplication.run(ConfrontoCovidNazioniApplication.class, args);
		try {
			
			Data_base.Scaricadati();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

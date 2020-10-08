package Statistiche.covid.ConfrontoCovidNazioni;


import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Statistiche.covid.ConfrontoCovidNazioni.database.Data_base;


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

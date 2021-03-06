package Statistiche.covid.ConfrontoCovidNazioni.eccezioni;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Questa classe consente di gestire le varie eccezioni che si possono generare
 * @author Marco Cervigni
 *
 */
@Controller
public class Gestione_eccezioni implements ErrorController {
	/**
	 * 
	 * @param request Rappresenta la richiesta dal server http da gestire
	 * @return una stringa che descrive l'eccezione
	 */
	 @RequestMapping("/error")
	    @ResponseBody
	    public String gestisciErrori(HttpServletRequest request){
	        Integer codiceErrore = (Integer) request.getAttribute("javax.servlet.error.status_code");
	        String message = "ERRORE";			
	        if(codiceErrore == 404) {			
	        	message = "errore: Il percorso specificato non è valido";
	        }
	        if(codiceErrore == 500) {
	        	message = "errore: Errore interno del server, inserire la data corretta del tipo 'aaaa-MM-ggT00:00:00Z', esempio:'2020-03-01T00:00:00Z'"
	        			+ " ,inserire una data compresa tra il 2020-03-01 e il 2020-08-31, 'from' deve essere antecedente rispetto a 'to' ";
	        }
	        if(codiceErrore==400) {
	        	message = "errore: La forma richiesta non è corretta, inserire  i parametri nel modo richiesto";
	        }
	        
	        return message;
	    }

	    @Override
	    public String getErrorPath() {
	        return "/error";
	    }
	
}


# oop-ingegneria-informatica
L'applicazione consente di ottenere informazioni sull'andamento della curva epidemiologica del covid-19 nei 3 paesi presi in analisi: Spagna,Svezia e Italia. Mediante l'utilizzo del software postman è possibile ottenere dati circa contagi, morti, ricoverati e isolati nei vari paesi, in un intervallo di tempo che viene selezionato dall'utente. E' possibile inoltre non solo ottenere i metadati, bensì anche delle statistiche settimanali e mensili nei 3 paesi, nonchè dei rapporti percentuali sulle suddette che consentono di confrontare l'andamento della pandemia.

## __COME UTILIZZARE IL PROGRAMMA__
Una volta avviato il programma come __spring boot app__ si possono effettuare delle chiamate di tipo __GET__ o __POST__ da postman, utilizzando la porta http://localhost:8080.

TIPO | ROTTA| DESCRIZIONE
-----|-----|-----
GET  |/metadata| Fornisce tipo e nome di ogni dato estratto
POST|/datigiorno|Fornisce i dati di Spagna,Svezia e Italia nel giorno selezionato
POST|/datiperiodo|Fornisce i dati dei 3 paesi nel periodo selezionato
POST|/statistiche| Fornisce le statistiche riguardanti i singoli paesi nel periodo selezionato
POST|/confrontoStat|Fornisce le statistiche che consentono di confrontare l'andamento dell'epidemia nei 3 paesi, nel periodo selezionato

Per selezionare un giorno bisogna inserire come parametro(__key__) '__giorno__' e come valore (__value__) 
una data nel formato __AAAA-MM-GGT00:00:00Z__ ad esempio 2020-04-01T00:00:00Z.
## DIAGRAMMA DEI CASI D'USO
.
!<a href="https://imgbb.com/"><img src="https://i.ibb.co/Tgbt90Q/use-Case-Diag.png" alt="use-Case-Diag" border="0"></a>

## DIAGRAMMA DELLE CLASSI

!<a href="https://ibb.co/V2Rs4DV"><img src="https://i.ibb.co/2gxT4Pq/diaClass.png" alt="diaClass" border="0"></a>
.
.
!<a href="https://imgbb.com/"><img src="https://i.ibb.co/SQtc99x/Gestione.png" alt="Gestione" border="0"></a>
.
!<a href="https://imgbb.com/"><img src="https://i.ibb.co/wdqk7vP/model.png" alt="model" border="0"></a>
.
!<a href="https://imgbb.com/"><img src="https://i.ibb.co/2cBpgVh/eccezioni.png" alt="eccezioni" border="0"></a>
.
!<a href="https://imgbb.com/"><img src="https://i.ibb.co/LYLsY83/database.png" alt="database" border="0"></a>
.
!<a href="https://imgbb.com/"><img src="https://i.ibb.co/QrWKPC8/controller.png" alt="controller" border="0"></a>
.
!<a href="https://imgbb.com/"><img src="https://i.ibb.co/2FbTC8g/app.png" alt="app" border="0"></a>

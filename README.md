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

## DIAGRAMMA DELLE SEQUENZE

Chiamata __GET/metadata__ 
Il controllore esegue una chiamata mediante il metodo __ottieniArrayMetadati()__, fornisce un ArrayList di metadati.
.

!<a href="https://imgbb.com/"><img src="https://i.ibb.co/Lzk511G/metadata.png" alt="metadata" border="0"></a>

Chiamata __POST/datigiorno__
Il controllore esegue una chiamata mediante il metodo __ottieniDatiSingoloGiorno__, fornisce un ArrayList di ArrayList di __Dati__, con le informazioni riguardo l'epidemia nei 3 paesi in un singolo giorno, per far ciò bisogna passare la data inserita dall'utente al metodo convertidata e richiamare il metodo __convertigiornoJSON__ per ogni paese e riunire le informazioni in un ArrayList di ArrayList richiamando __ottieniDati()__.


!<a href="https://ibb.co/njMzNzm"><img src="https://i.ibb.co/tDp8T8K/converti-Giorno.png" alt="converti-Giorno" border="0"></a>


Chiamata __POST/datiperiodo__
Il controllore esegue una chiamata mediante il metodo __ottieniDatiPerPeriodo__, fornisce un ArrayList di ArrayList di __Dati__  con le informazioni circa i 3 paesi in un periodo di tempo stabilito dall'utente. Per fare questo bisogna passare le 2 date inserite al metodo __convertidata__ e richiamare il metodo __convertiJSON__ 3 volte(una per ogni paese) e riunire le informazioni in un ArrayList di ArrayList richiamando __ottieniDati()__.


!<a href="https://ibb.co/h9C7MjR"><img src="https://i.ibb.co/8sXKBpD/converti-Periodo.png" alt="converti-Periodo" border="0"></a>


Chiamata __POST/statistiche__
Il controllore esegue una chiamata mediante il metodo __ottieniStatistiche__, fornisce un ArrayList di __Statistiche__ con le statistiche riguardanti i 3 paesi presi singolarmente, calcolate in un periodo di tempo stabilito dall'utente. Per far ciò bisogna passare le 2 date inserite al metodo __convertidata__ e richiamare il metodo __estraiStats__.


!<a href="https://imgbb.com/"><img src="https://i.ibb.co/4d4Q4wk/Statistiche.png" alt="Statistiche" border="0"></a>


Chiamata __POST/confrontoStat__
Il controllore esegue una chiamata mediante il metodo __ottieniStatisticheConfronto__, fornisce un ArrayList di __StatConfronto__ con le statistiche che consentono di confrontare l'impatto della pandemia nei 3 paesi presi in considerazione, il tutto in un intervallo temporale stabilito dall'utente. Per far ciò bisogna passare le 2 date inserite al metodo __convertidata__ e richiamare __estraiConfrontoStats__.


!<a href="https://imgbb.com/"><img src="https://i.ibb.co/ssdgFgc/Confronto-Stat.png" alt="Confronto-Stat" border="0"></a>


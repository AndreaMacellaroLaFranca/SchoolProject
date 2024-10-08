package org.generation.italy.school.start;

import org.generation.italy.school.administration.Esame;
import org.generation.italy.school.hr.Impiegato;
import org.generation.italy.school.people.Studente;

public class StartUp {
    public static void main(String[] Args){

        Esame matematica = new Esame("Analisi", 2023, "Matematica", 12, false);
        Esame storia = new Esame("Storia", 2024, "Lettere", 13, true);
        Esame informatica = new Esame("Sistemi", 2024, "Informatica", 22, true);
        Esame inglese = new Esame("Modal Verbs", 2023, "Inglese", 22, false);
        Esame geografia = new Esame("Regioni", 2024, "Geogafia", 18, false);

        Esame[] listaEsami = {matematica, storia, informatica, inglese, geografia};

        Studente studente = new Studente("Andrea", "Macellaro", "M", 2000, listaEsami);

        Impiegato y = new Impiegato();

        String level = y.analizzaStudente(studente);

        System.out.println(level);


    }


}

package org.generation.italy.school.hr;


import org.generation.italy.school.people.Studente;

public class Impiegato {

    public String analizzaStudente(Studente studente){

        double media = studente.calcolaMedia();

        if (media>27){
            return "Ottimo";
        } else if (media<27 && media>23){
            return "Mediocre";
        } else {
            return "Pessimo";
        }


    }
}

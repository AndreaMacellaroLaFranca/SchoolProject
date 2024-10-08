package org.generation.italy.school.people;

import org.generation.italy.school.administration.Esame;

public class Studente {

    public String name, lastName, sex;
    public int yearOfBirth;
    public Esame[] listaEsami;

    public Studente(String name, String lastName, String sex, int yearOfBirth, Esame[] listaEsami) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.listaEsami = listaEsami;
    }

    public double calcolaMedia() {
        double somma = 0;
        int numEsami = 0;
        for (int i = 0; i < listaEsami.length; i++) {
            if (listaEsami[i] != null) {
                somma += listaEsami[i].voto;
                numEsami++;
            }

            return numEsami ==0?0: somma/numEsami;
        }

        return somma;
    }


}
package org.generation.italy.school.administration;

public class Esame {

    public String titoloEsame, areaDiPertinenza;
    public int voto, dataSostenuto;
    public boolean lode;

    public Esame(String titoloEsame, int dataSostenuto, String areaDiPertinenza, int voto, boolean lode){
        this.titoloEsame = titoloEsame;
        this.dataSostenuto = dataSostenuto;
        this.areaDiPertinenza = areaDiPertinenza;
        this.voto = voto;
        this.lode = lode && voto>29;
    }

}

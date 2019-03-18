package com.vaja1;

import java.util.ArrayList;

public class Artikli {



    private ArrayList<Artikel> artikli;

    public int GetTotalCost(){
        int znesek=0;
        for(Artikel artikel: this.artikli) {
            znesek +=(( artikel.getCena()+ artikel.getCena()*artikel.getDavek())*artikel.getKolicina());

        }
        return znesek;
    }


    public void AddArtikel(Artikel a) {
        artikli.add(a);
    }

    public ArrayList<Artikel> getArtikli() {
        return artikli;
    }

    public void setArtikli(ArrayList<Artikel> artikli) {
        this.artikli = artikli;
    }

    public void DeleteArtikel(Artikel a) {
        artikli.remove(a);
    }



    public Artikli(ArrayList<Artikel> artikli) {
        this.artikli = artikli;
    }

    public Artikli() {
        this.artikli = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Artikli{" +
                "artikli=" + artikli +
                '}';
    }
}

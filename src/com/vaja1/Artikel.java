package com.vaja1;

public class Artikel {

    private String ime;
    private int cena;
    private int kolicina;
    private static double davek=0.22;




    public void spremeniIme(String ime) {
        this.setIme(ime);
    }


    public void spremeniCeno(int cena) {
        this.setCena(cena);
    }


    public void spremeniKolicino(int kolicina) {
        this.setKolicina(kolicina);
    }





    public static double getDavek() {
        return davek;
    }

    public static void setDavek(double davek) {
        Artikel.davek = davek;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }



    public Artikel(String ime, int cena, int kolicina) {
        this.ime = ime;
        this.cena = cena;
        this.kolicina = kolicina;
    }
    public Artikel(){

    }
    @Override
    public String toString() {
        return "Artikel{" +
                "ime='" + ime + '\'' +
                ", cena=" + cena +
                ", kolicina=" + kolicina +
                '}';
    }
}

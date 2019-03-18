package com.vaja1;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Racun {
    private UUID id;
    private Date datum= new Date();
    private Artikli artikli;

  public int getCenaArtiklov(){
        return this.artikli.GetTotalCost();
    }

    public Racun(Date datum, Artikli artikli) {
        this.id = UUID.randomUUID();
        this.datum = datum;
        this.artikli = artikli;
    }

    public Racun(){
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Artikli getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikli artikli) {
        this.artikli = artikli;
    }

    @Override
    public String toString() {
        return "Racun{" +
                "id=" + id +
                ", datum=" + datum +
                ", artikli=" + artikli +
                ", skupna cena=" +getCenaArtiklov()+
                '}';
    }
}

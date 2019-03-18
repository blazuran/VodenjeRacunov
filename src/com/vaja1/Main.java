package com.vaja1;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Artikel a = new Artikel();

	a.setIme("HDMI");
	a.setCena(20);
	a.setKolicina(1);

	Artikel b = new Artikel();
	b.setIme("DVI");
	b.setCena(10);
	b.setKolicina(1);

	Artikel c=new Artikel();
	c.setIme("DP");
	c.setKolicina(2);
	c.setCena(30);

	Artikel d=new Artikel();
	d.setIme("Izdelek");
	d.setCena(30);
	d.setKolicina(2);

	//d.spremeniKolicino(1);

	Artikli Seznam= new Artikli();
	Seznam.AddArtikel(a);
	Seznam.AddArtikel(b);

	//Seznam.DeleteArtikel(a);


	Racun r1 = new Racun();
	r1.setArtikli(Seznam);



	Artikli Seznam2=new Artikli();
	Seznam2.AddArtikel(d);

	Racun r2=new Racun();
	r2.setArtikli(Seznam2);

	ArrayList<Racun> racuni=new ArrayList<>();
	racuni.add(r1);
	racuni.add(r2);

	System.out.println(r1);
	System.out.println(racuni);
    }
}

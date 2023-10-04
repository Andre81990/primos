package com.example.demo.Entity;

public class Meal {

    private String name;
    private String descrizione;
    private String prezzo;

    public Meal(String name, String descrizione, String prezzo) {
        this.name = name;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }
}

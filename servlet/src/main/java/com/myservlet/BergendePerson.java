package com.myservlet;

import java.util.List;
import java.util.ArrayList;

public class BergendePerson {
    private String name;
    private String telefonnummer;
    private List<Geisternetz> geisternetze;

    // Konstruktor, Getter und Setter für die Attribute

    public BergendePerson(String name, String telefonnummer) {
        this.name = name;
        this.telefonnummer = telefonnummer;
        this.geisternetze = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public List<Geisternetz> getGeisternetze() {
        return geisternetze;
    }

    public void addGeisternetz(Geisternetz geisternetz) {
        geisternetze.add(geisternetz);
    }

    public void removeGeisternetz(Geisternetz geisternetz) {
        geisternetze.remove(geisternetz);
    }
}

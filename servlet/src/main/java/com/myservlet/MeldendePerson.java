package com.myservlet;

public class MeldendePerson {
    private String name;
    private String telefonnummer;

    // Konstruktor, Getter und Setter für die Attribute

    public MeldendePerson(String name, String telefonnummer) {
        this.name = name;
        this.telefonnummer = telefonnummer;
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
}

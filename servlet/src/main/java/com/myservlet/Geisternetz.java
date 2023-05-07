package com.myservlet;

public class Geisternetz {
    private String standort;
    private double geschätzteGröße;
    private String status;
    private MeldendePerson meldendePerson;

    // Konstruktor, Getter und Setter für die Attribute

    public Geisternetz(String standort, double geschätzteGröße, String status) {
        this.standort = standort;
        this.geschätzteGröße = geschätzteGröße;
        this.status = status;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public double getGeschätzteGröße() {
        return geschätzteGröße;
    }

    public void setGeschätzteGröße(double geschätzteGröße) {
        this.geschätzteGröße = geschätzteGröße;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MeldendePerson getMeldendePerson() {
        return meldendePerson;
    }

    public void setMeldendePerson(MeldendePerson meldendePerson) {
        this.meldendePerson = meldendePerson;
    }
}

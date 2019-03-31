package com.vanzariOnline;

public class locatie {

    private String numeLocatie;
    private String oras;
    private String adresa;

    public locatie(String numeLocatie, String oras, String adresa) {
        this.numeLocatie = numeLocatie;
        this.oras = oras;
        this.adresa = adresa;
    }

    public String getNumeLocatie() {
        return numeLocatie;
    }

    public void setNumeLocatie(String numeLocatie) {
        this.numeLocatie = numeLocatie;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "locatie{" +
                "numeLocatie='" + numeLocatie + '\'' +
                ", oras='" + oras + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}

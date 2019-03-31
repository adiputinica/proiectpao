package com.vanzariOnline;

public class conferinta extends eveniment{
    private String tematica;

    public conferinta(String nume, Integer zi, Integer luna, locatie location, String tematica) {
        super(nume, zi, luna);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "conferinta{" +
                "tematica='" + tematica + '\'' +
                '}';
    }
}

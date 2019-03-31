package com.vanzariOnline;

import java.util.List;

public class meci extends eveniment{

    private String tipStadion;

    public meci(String nume, Integer zi, Integer luna, locatie location, String tipStadion) {
        super(nume, zi, luna);
        this.tipStadion = tipStadion;
    }

    public String getTipStadion() {
        return tipStadion;
    }

    public void setTipStadion(String tipStadion) {
        this.tipStadion = tipStadion;
    }

    @Override
    public String getNume() {
        return "Meci : " + super.getNume();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "meci{" +
                "tipStadion='" + tipStadion + '\'' +
                '}';
    }

}

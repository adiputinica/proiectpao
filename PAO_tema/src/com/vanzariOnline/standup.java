package com.vanzariOnline;

public class standup extends eveniment{

    private String comediant;

    public standup(String nume, Integer zi, Integer luna, locatie location, String comediant) {
        super(nume, zi, luna);
        this.comediant = comediant;
    }

    public String getComediant() {
        return comediant;
    }

    public void setComediant(String comediant) {
        this.comediant = comediant;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "standup{" +
                "comediant='" + comediant + '\'' +
                '}';
    }
}

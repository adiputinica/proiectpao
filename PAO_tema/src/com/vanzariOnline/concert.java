package com.vanzariOnline;

public class concert extends eveniment {

    private String formatie;

    public concert(String nume, Integer zi, Integer luna, locatie location, String formatie) {
        super(nume, zi, luna);
        this.formatie = formatie;
    }

    public String getFormatie() {
        return formatie;
    }

    public void setFormatie(String formatie) {
        this.formatie = formatie;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "concert{" +
                "formatie='" + formatie + '\'' +
                '}';
    }
}

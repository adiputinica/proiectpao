package com.vanzariOnline;

public class petrecere extends eveniment{

    private String InvitatSpecial;

    public petrecere(String nume, Integer zi, Integer luna, locatie location, String invitatSpecial) {
        super(nume, zi, luna);
        InvitatSpecial = invitatSpecial;
    }

    public String getInvitatSpecial() {
        return InvitatSpecial;
    }

    public void setInvitatSpecial(String invitatSpecial) {
        InvitatSpecial = invitatSpecial;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "petrecere{" +
                "InvitatSpecial='" + InvitatSpecial + '\'' +
                '}';
    }
}

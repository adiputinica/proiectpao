package com.vanzariOnline;

public class film extends eveniment {

    private Integer loc;
    private String gen;

    public film(String nume, Integer zi, Integer luna, locatie location, Integer loc, String gen) {
        super(nume, zi, luna);
        this.loc = loc;
        this.gen = gen;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public Integer getLoc() {
        return loc;
    }

    public void setLoc(Integer loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "film{" +
                "loc=" + loc +
                ", gen='" + gen + '\'' +
                '}';
    }
}

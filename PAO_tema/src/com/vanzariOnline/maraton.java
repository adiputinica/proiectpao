package com.vanzariOnline;

public class maraton extends eveniment{

    private Integer lungimeTraseu;

    public maraton(String nume, Integer zi, Integer luna, locatie location, Integer lungimeTraseu) {
        super(nume, zi, luna);
        this.lungimeTraseu = lungimeTraseu;
    }

    public Integer getLungimeTraseu() {
        return lungimeTraseu;
    }

    public void setLungimeTraseu(Integer lungimeTraseu) {
        this.lungimeTraseu = lungimeTraseu;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "maraton{" +
                "lungimeTraseu=" + lungimeTraseu +
                '}';
    }
}

package com.vanzariOnline;

import java.util.Scanner;

public class eveniment {

    private String nume;
    private Integer zi;
    private Integer luna;

    public eveniment(){
        this.nume="";
        this.zi=null;
        this.luna=null;
    }

    public eveniment(String nume, Integer zi, Integer luna) {
        this.nume = nume;
        this.zi = zi;
        this.luna = luna;
    }

    public void organizareEveniment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adauga un eveniment:");
        System.out.println("Numele");
        String nume = sc.next();
        System.out.println("Ziua");
        Integer zi = sc.nextInt();
        System.out.println("Luna");
        Integer luna = sc.nextInt();
        this.nume=nume;
        this.zi=zi;
        this.luna=luna;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getZi() {
        return zi;
    }

    public void setZi(Integer zi) {
        this.zi = zi;
    }

    public Integer getLuna() {
        return luna;
    }

    public void setLuna(Integer luna) {
        this.luna = luna;
    }

    @Override
    public String toString() {
        return "eveniment{" +
                "nume='" + nume + '\'' +
                ", zi=" + zi +
                ", luna=" + luna +
                ", location=" +
                '}';
    }
}

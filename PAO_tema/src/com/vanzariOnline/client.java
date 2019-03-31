package com.vanzariOnline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class client {

    private Integer id;
    private String username;
    private String password;
    private List<eveniment> listaEvenimente;

    public client(Integer id, String username, String password, List<eveniment> listaEvenimente) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.listaEvenimente = listaEvenimente;
    }

    public void adaugaEveniment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adauga un eveniment:");
        System.out.println("Numele");
        String nume = sc.next();
        System.out.println("Ziua");
        Integer zi = sc.nextInt();
        System.out.println("Luna");
        Integer luna = sc.nextInt();
        eveniment ev = new eveniment(nume,zi,luna);

        if (this.listaEvenimente!=null) listaEvenimente.add(ev);
        else{
            this.listaEvenimente=new ArrayList<eveniment>();
            listaEvenimente.add(ev);

        }
    }

    public void afiseazaEvenimente() {

        listaEvenimente.forEach(e -> System.out.println(e));
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "client{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

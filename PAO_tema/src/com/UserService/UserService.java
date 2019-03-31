package com.UserService;

import com.vanzariOnline.client;
import com.vanzariOnline.*;

import java.util.*;

public class UserService {

    private Set<client> clienti = new HashSet<>();

    private static UserService ourInstance = new UserService();
    public static UserService getInstance() {return ourInstance;}

    private UserService() {}

    public void adaugaClient()
    {
        System.out.println("Adauga client:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Id");
        Integer id = sc.nextInt();
        System.out.println("Username:");
        String username = sc.nextLine();
        System.out.println("Parola:");
        String parola= sc.nextLine();

        List<eveniment> evenimente = new ArrayList<>();
        eveniment p = new eveniment();
        p.organizareEveniment();
        evenimente.add(p);
        client nou = new client(id,username,parola,evenimente);
        this.clienti.add(nou);

    }


    public void listaClienti()
    {
        clienti.forEach(c ->System.out.println(c));
    }

    public void afiseazaEvenimenteClienti()
    {
        for ( client m : clienti)
        {
            m.afiseazaEvenimente();
        }
    }

}

package app.model;

import java.util.Comparator;

public class Client{

    private int clientId;
    private String name;
    private int year;


    public Client(String name, int year) {
        this.name = name;
        this.year = year;
        this.clientId = clientId++;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getClientId(){
        return clientId;
    }

}


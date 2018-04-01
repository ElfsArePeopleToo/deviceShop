package app.model;

import java.util.Date;

public class SellHistory {
    final private int date;
    final private Device device;
    final private Client client;

    public SellHistory(int date, Device device, Client client) {
        this.date = date;
        this.device = device;
        this.client = client;
    }

    public int getDate() {
        return date;
    }

    public Device getDevice() {
        return device;
    }

    public Client getClient(){
        return client;
    }


}

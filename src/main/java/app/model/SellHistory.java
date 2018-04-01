package app.model;

import java.util.Date;

public class SellHistory {
    private int date;
    private Device device;
    private Client client;

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

    public void setClient(Client client) {
        this.client = client;
    }
}

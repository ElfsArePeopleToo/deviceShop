package app.model;

import app.model.Client;
import app.model.Device;
import app.model.SellHistory;

import java.util.ArrayList;

public class Data {
    private ArrayList<Client> clients;
    private ArrayList<Device> devices;
    private ArrayList<SellHistory> history;

    public Data(){
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Device> devices = new ArrayList<>();
        ArrayList<SellHistory> history = new ArrayList<>();
    }


    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public ArrayList<SellHistory> getHistory() {
        return history;
    }
}

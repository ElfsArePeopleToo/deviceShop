package app.view;

import app.controler.Creator;
import app.model.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public static Data data = new Data();
    public static void main(String[] args) throws IOException {
        System.out.println("Select an operation");
        System.out.println("1 - Create");
        System.out.println("2 - Search");
        System.out.println("3 - Sort");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int select  = Integer.parseInt(reader.readLine());
        //⦁	Делать case-insensitive поиск по ФИО клиента, марке устройства, типу устройства, году выпуска, году продажи товара, id клиента, id устройства;
        //⦁	Сортировать и выводить на экран данные. Сортировка - по любым из параметров клиента/устройства/истории продаж.

        if(select ==1){
            System.out.println("1 - Create client");
            System.out.println("2 - Create product");
            System.out.println("3 - Create buy");
            int select2  = Integer.parseInt(reader.readLine());
            Creator creator = new Creator();
            if(select2 == 1){
                data.getClients().add(creator.createClient());
            } else if(select2 ==2){
                data.getDevices().add(creator.createDevice());
            }


        } else if( select ==2){
            System.out.println("1 - Search by client name");
            System.out.println("2 - Search by client type");
            System.out.println("3 - Search by client date of sale");
            System.out.println("4 - Search by client ID");
            System.out.println("5 - Search by mark of device");
            System.out.println("6 - Search by device ID");
        } else if(select==3){

        }
    }
}

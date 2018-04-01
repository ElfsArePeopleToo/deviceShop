package app.model;

public class Device {
    private int deviceId;
    private final String mark;
    private final String Color;
    private final int year;

    public Device(String mark, String color, int year) {
        this.mark = mark;

        this.Color = color;
        this.year = year;
        this.deviceId = deviceId++;
    }
    public int getDeviceId(){
        return deviceId;
    }


    public String getMark() {
        return mark;
    }



    public String getColor() {
        return Color;
    }

    public int getYear() {
        return year;
    }
}

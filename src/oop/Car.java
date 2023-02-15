package oop;
//Class
public class Car {

//    Variables (Private)
    private String make;
    private String model;
    private int VIN;
    private boolean gotStyle;

//  Getters and Setters)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public boolean isGotStyle() {
        return gotStyle;
    }

    public void setGotStyle(boolean gotStyle) {
        this.gotStyle = gotStyle;
    }
}

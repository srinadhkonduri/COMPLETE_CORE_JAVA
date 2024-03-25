package com.ComputerFactory;

public class Product {
    private String model;
    private String manufacturer;
    private  int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
// -----------------------------------------------------------//
class Monitor extends Product{
    private int size;
    private String resoultion;
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer,
                   int size, String resoultion) {
        super(model, manufacturer);
        this.size = size;
        this.resoultion = resoultion;
    }
    public void drawPixel(int x,int y, String color){
        System.out.println(String.format("drawing pixel at " +
                "%d %d in color as %s",x,y,color));
    }
}
// ---------------------------------------------------------//
class ComputerCase extends Product{
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void pressPowerButton(){
        System.out.println("power button pressed computer turned on");
    }
}
// --------------------------------------------------------//
class MotherBoard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots,
                       int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("program" + programName + "is loading" +
                "now");
    }
// ------------------------------------------------------//
}

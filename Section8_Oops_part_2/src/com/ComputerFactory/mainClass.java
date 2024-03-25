package com.ComputerFactory;

public class mainClass {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2200","dell");
        Monitor theMonitor = new Monitor("27 inch beast","acer"
        ,27,"2540 x 1440");
        MotherBoard theMotherBoard = new MotherBoard("bj-200",
                "asus",4,6,"v2.44");
        personalComputer thePc = new personalComputer("2288",
                "dell",theCase,theMonitor,theMotherBoard);
//        thePc.getMonitor().drawPixel(10,10,"red");
//        thePc.getMotherBoard().loadProgram("windows os");
//        thePc.getComputerCase().pressPowerButton();
        thePc.powerUp();
    }
}

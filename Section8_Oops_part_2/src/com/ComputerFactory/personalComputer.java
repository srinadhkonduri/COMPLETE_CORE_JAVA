package com.ComputerFactory;

public class personalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public personalComputer(String model, String manufacturer,
                            ComputerCase computerCase,
                            Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    private void drawLogo(){
        monitor.drawPixel(1200,50,"yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}

package ro.itschool.computerset;

public class Main {
    public static void main(String[] args) {


        Mouse mouse = new Mouse();
        mouse.setDpi(800);
        mouse.setName("Logitech");
        mouse.setOptic(true);

        Monitor monitor = new Monitor();
        monitor.setDisplaySize(17);
        monitor.setName("Samsung");

        ComputerSet computerSet = new ComputerSet();
        computerSet.setName("Back to school");
        computerSet.setPrice(500);

        computerSet.setMouse(mouse);
        computerSet.setMonitor(monitor);



    }
}

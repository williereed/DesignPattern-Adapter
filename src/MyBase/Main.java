package MyBase;

public class Main {

    public static void main(String[] args) {

        AmericanPower laptop = new AmericanPower();
        BritishPower socket = new BritishPower();

        System.out.println("need to plug my laptop in");
        System.out.println("laptop is now receiving " + laptop.getAmericanVolts() + " volts");
        System.out.println("when the PowerSource is supplying " + socket.getBritishVolts() + " volts");
    }
}

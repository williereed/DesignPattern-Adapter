package MyBase;

// British power is 240 volts, American devices are 120 volts, so we'll need an adapter
public class AmericanPower {
    public int getAmericanVolts() {
        BritishAmericanAdapter adapter = new BritishAmericanAdapter();
        return adapter.adaptBritishVolts();
    }
}

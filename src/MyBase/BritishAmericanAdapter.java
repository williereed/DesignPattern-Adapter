package MyBase;

// British power is 240 volts, American devices are 120 volts, so we'll need an adapter
public class BritishAmericanAdapter extends BritishPower {

    private int BritishToAmericanReduction = 120;

    public int adaptBritishVolts () {
        return getBritishVolts() - BritishToAmericanReduction;
    }
}

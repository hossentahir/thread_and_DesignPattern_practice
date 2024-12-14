public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer c1 = new ComputerBuilder().setRAM("DDR4").getComputer();
        System.out.println(c1.toString());
    }
}

class Computer {
    String HDD;
    String RAM;

    boolean isGraphicsCardEnabled;
    boolean isBluetoothEnabled;

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
                + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

    public Computer(String hDD, String rAM, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {
        HDD = hDD;
        RAM = rAM;
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }
}

class ComputerBuilder {
    String HDD;
    String RAM;

    boolean isGraphicsCardEnabled;
    boolean isBluetoothEnabled;

    public ComputerBuilder setHDD(String hDD) {
        HDD = hDD;
        return this;
    }

    public ComputerBuilder setRAM(String rAM) {
        RAM = rAM;
        return this;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    Computer getComputer() {
        return new Computer(HDD, RAM, isGraphicsCardEnabled, isBluetoothEnabled);
    }

}

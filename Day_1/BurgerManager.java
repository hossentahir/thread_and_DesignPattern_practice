public class BurgerManager {
    public static void main(String[] args) {
        Burger b1 = new Burger("Cow", 1.5, 1, 0.5);
        System.out.println(b1.toString());

        Burger b2 = new BurgerBuilder().setBread(1).setMeat("chicken").getBurger();
        System.out.println(b2.toString());
    }
}

class Burger {
    String meat;
    double salat;
    int bread;
    double sauce;

    public Burger(String meat, double salat, int bread, double sauce) {
        this.meat = meat;
        this.salat = salat;
        this.bread = bread;
        this.sauce = sauce;

    }

    public String toString() {
        return "Burger [ meat = " + meat + ", salat = " + salat + ", bread = " + bread + ", sauce = " + sauce + " ]";
    }

}

class BurgerBuilder {
    String meat;
    double salat;
    int bread;
    double sauce;

    public BurgerBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public BurgerBuilder setSalat(double salat) {
        this.salat = salat;
        return this;
    }

    public BurgerBuilder setBread(int bread) {
        this.bread = bread;
        return this;
    }

    public BurgerBuilder setSauce(double sauce) {
        this.sauce = sauce;
        return this;
    }

    Burger getBurger() {
        return new Burger(meat, salat, bread, sauce);
    }
}
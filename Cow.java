public class Cow extends Animal {
    public Cow(int id, int milkAmount) {
        this.id = id;
        this.milkAmount = milkAmount;
    }

    int id;
    int milkAmount;
    public int collectProducts() {
        return this.milkAmount;
    }
}

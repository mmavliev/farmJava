public class Cow implements Animal {
    int id;
    MilkLiters milkLiters;
    public Cow(int id, int liters) {
        this.id = id;
        this.milkLiters = new MilkLiters(liters);
    }
    public int collectProducts() {
        return this.milkLiters.amount;
    }

    @Override
    public Product getProduct() {
        return milkLiters;
    }
}

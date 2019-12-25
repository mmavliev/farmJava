public class Sheep extends Animal {
    public Sheep(int id, int woolAmount) {
        this.id = id;
        this.woolAmount = woolAmount;
    }

    int id;
    int woolAmount;
    public int collectProducts() {
        return this.woolAmount;
    }

}

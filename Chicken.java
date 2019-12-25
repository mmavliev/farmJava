public class Chicken extends Animal{
    int id;
    int eggsAmount;
    public Chicken(int id, int eggsAmount) {
        this.id = id;
        this.eggsAmount = eggsAmount;
    }
    public int collectProducts() {
        return this.eggsAmount;
    }
}

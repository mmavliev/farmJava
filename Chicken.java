public class Chicken extends Animal{
    int id;
    EggsBunch eggsAmount;
    public Chicken(int id, int eggsAmount) {
        this.id = id;
        this.eggsAmount = new EggsBunch(eggsAmount);
    }
    public int collectProducts() {
        return this.eggsAmount.getAmount();
    }
}

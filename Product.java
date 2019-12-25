public abstract class Product {
    int amount;
    int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return Integer.toString(this.amount);
    }
    String productName;
    String unit;
}

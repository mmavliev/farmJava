public class Loader {
    public static void main(String[] args) {
        int cowsCount = 10;
        int chickenCount = 20;
        Farm farm = new Farm();
        for(int i = 0; i < cowsCount; i++){
            farm.addAnimal(new Cow(i,8+(int)Math.round(Math.random()*4)));
        }
        for(int i = cowsCount; i < cowsCount + chickenCount; i++){
            farm.addAnimal(new Chicken(i,(int)Math.round(Math.random())));
        }
        farm.collectProducts();
    }
}

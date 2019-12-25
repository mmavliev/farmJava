import java.util.ArrayList;

public class Farm {
    ArrayList<Animal> hlev = new ArrayList<>();
    public int collectMilk(){
        int count = 0;
        for(Animal animal : hlev){
            if(animal.getClass() == Cow.class){
            count+=animal.collectProducts();
            }
        }
        return count;
    }

    public int collectEggs(){
        int count = 0;
        for(Animal animal : hlev){
            if(animal.getClass() == Chicken.class){
                count+=animal.collectProducts();
            }
        }
        return count;
    }
    public void addAnimal(Animal animal){
        this.hlev.add(animal);
    }
}

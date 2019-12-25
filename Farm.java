import java.util.ArrayList;
import java.util.Objects;

public class Farm {
    ArrayList<Animal> hlev = new ArrayList<>();
    ArrayList<String> productTypes = new ArrayList<>();
    ArrayList<String> units = new ArrayList<>();
    public void collectProducts() {
        for(Animal animal : hlev) {
           if(!productTypes.contains(animal.getProduct().productName)){
               productTypes.add(animal.getProduct().productName);
               units.add(animal.getProduct().unit);
           }
        }
        for(int i = 0; i < productTypes.size(); i++) {
            int count = 0;
            for(Animal animal : hlev){
                if(animal.getProduct().productName == productTypes.get(i)) {
                    count+=animal.collectProducts();
                }
            }
            System.out.println(productTypes.get(i) + ": " + count + " "+ units.get(i));
        }
    }
    public void addAnimal(Animal animal){
        this.hlev.add(animal);
    }
}

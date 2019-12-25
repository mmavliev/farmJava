import java.util.ArrayList;

public class Farm {
    ArrayList<Animal> hlev = new ArrayList<>();
    ArrayList<Class> animalTypes = new ArrayList<>();
    public void collectProducts() {
        for(Animal animal : hlev){
           if(!animalTypes.contains(animal.getClass())){
               animalTypes.add(animal.getClass());
           }
        }
        for(Class type : animalTypes) {
            int count = 0;
            for(Animal animal : hlev){
                if(animal.getClass() == type){
                    count+=animal.collectProducts();
                }
            }
            System.out.println(type.getName()+": " + count);
        }
    }
    public void addAnimal(Animal animal){
        this.hlev.add(animal);
    }
}

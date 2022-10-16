package AbstractsAndInterface;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        Chicken c1 = new Chicken();
        Tiger t1 = new Tiger();
        animals[0] = c1;
        animals[1] = t1;
        for (Animal animal: animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}

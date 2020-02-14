import java.lang.reflect.Array;
import java.util.Random;

public class Run {
    private static AnimalFactory animalFactory;
    public static void main(String[] args) {


        animalFactory.getAnimal(getLocation()).attack();
        animalFactory.getAnimal(getLocation()).say();
        animalFactory.getAnimal(getLocation()).move();

    }

    public static Integer getLocation() {
        Random random = new Random();
        int typeIt = random.nextInt(3);
        return typeIt;
    }
}

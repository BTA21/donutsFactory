import java.util.Random;

public class AnimalFactory {
    public static Animals getAnimal(Integer typeIt) {
        switch(typeIt) {
            case 0:
                return new Snake();
            case 1:
                return new Rabbit();
            case 2:
                return new Cat();
            default:
                return new Animal();
        }
    }
}

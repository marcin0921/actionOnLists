import java.util.Random;


public class IntegerGenerator {

    public Random generator = new Random();

    public Integer integerGenerator() {
        Integer randomInt = generator.nextInt(200);
        return randomInt;
    }



}

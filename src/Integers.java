import java.util.*;

public class Integers {


    public static ArrayList arrayList(int howManyNumbers) {

        List<Integer> integers = new ArrayList<>();
        Random generator = new Random();

        for(int i=0; i<20; i++) {

            integers.add(generator.nextInt(200));

        }

        if(howManyNumbers >= 20) {
            System.out.println("Maksymalny zakres liczb to 20. Ustawiono 20 liczb.");
            howManyNumbers = 20;
        }

        return new ArrayList<>(integers.subList(0, howManyNumbers));


    }
}

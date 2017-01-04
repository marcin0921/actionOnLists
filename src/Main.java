import java.util.*;


public class Main {

    public static void main(String[] args) {
//        Need for shuffle list
        Random rand = new Random();

//        ListFeatures cw.5 str 345
        List<Integer> integers = Integers.arrayList(6);
        System.out.println("1: " + integers);

        IntegerGenerator Ig = new IntegerGenerator();
        Integer randomInt = Ig.integerGenerator();
        integers.add(randomInt);
        System.out.println("2: " + integers);
        System.out.println("3: " + integers.contains(randomInt));

        integers.remove(randomInt);
        Integer thirdInt = integers.get(2);
        System.out.println("4: " + thirdInt + " " + integers.indexOf(thirdInt));

        Integer randomInt2 = Ig.integerGenerator();
        System.out.println("5: " + integers.indexOf(randomInt2));
        System.out.println("6: " + integers.remove(randomInt2));
        System.out.println("7: " + integers.remove(thirdInt));
        System.out.println("8: " + integers);
        integers.add(3, Ig.integerGenerator());
        System.out.println("9: " + integers);
        List<Integer> sub = integers.subList(1, 4);
        System.out.println("subList:" + sub);
        System.out.println("10: " + integers.containsAll(sub));
        Collections.sort(sub);
        System.out.println("Sorted list subList: " + sub);
//        In containsAll() the order is irrelevant:
        System.out.println("11:" + integers.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("Shuffled list subList: " + sub);
        System.out.println("12: " + integers.containsAll(sub));

        List<Integer> copy = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(integers);   // Fresh copy
        copy.remove(2);     // deleting by index
        System.out.println("14: " + copy);
        copy.removeAll(sub);    //removing only sub elements from copy list
        System.out.println("15: " + copy);
        copy.set(1, Ig.integerGenerator());     //replace element
        System.out.println("16: " + copy);
        copy.addAll(2, sub);        //add list after second element
        System.out.println("17: " + copy);
        System.out.println("18: " + integers.isEmpty());
        integers.clear();       //Remove all elements
        System.out.println("19: " + integers);
        System.out.println("20:" + integers.isEmpty());
        integers.addAll(Integers.arrayList(4));
        System.out.println("21: " + integers);
        Object[] o = integers.toArray();
        System.out.println("22: " + o[3]);
        


    }
}

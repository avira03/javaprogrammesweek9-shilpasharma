package javaprogrammes;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // create a hashset to store integer objects
        HashSet<Integer> numberSet = new HashSet<>();

        //store the numbers 4,7,and 8 in the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        // display which numbers between 1 and 10 are in the set
        System.out.println("Numbers between 1 and 10 in the set:");

        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set");

            }
        }


    }
}
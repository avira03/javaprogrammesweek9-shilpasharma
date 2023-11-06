package javaprogrammes;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // create an arraylist
        ArrayList<String> myList = new ArrayList<>();

        // add elements to the arraylist(for demonstration purposes)
        myList.add("Element 1");
        myList.add("Element 2");

        // check if the arraylist is empty

        if (myList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");

        }
    }
}

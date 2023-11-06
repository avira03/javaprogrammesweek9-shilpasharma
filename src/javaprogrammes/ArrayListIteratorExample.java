package javaprogrammes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {
    public static void main(String[] args) {
        // creating an aaraylist
        ArrayList<String> arrayList = new ArrayList<>();

        // adding elements to the Arraylist
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");

        //getting an iterator object for the arraylist
        Iterator<String> iterator = arrayList.iterator();

        //iterating through the elements using the iterator
        while (iterator.hasNext()) ;
        String element = iterator.next();
        System.out.println(element);

    }

    }


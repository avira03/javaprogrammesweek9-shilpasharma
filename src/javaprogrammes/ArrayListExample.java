package javaprogrammes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // create an arraylist
        ArrayList<String> arrayList = new ArrayList<>();

        // adsd elements to the arraylist
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");
        arrayList.add("Element 5");

        // display the elements in the arraylist
        System.out.println("Elements in the ArrayList: " + arrayList);

        //get user input for the index to retrieve
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index to retrieve: ");
        int index = scanner.nextInt();

        // CHECK IF THE INDEX IS valid
        if (index >= 0 && index < arrayList.size()) {

            //retrieve the element at the specified index
            String element = arrayList.get(index);
            System.out.println("Element at index" + index + ":" + element);
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
        // close the scanner
        scanner.close();
    }
}






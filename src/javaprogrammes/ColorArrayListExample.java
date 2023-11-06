package javaprogrammes;

import java.util.ArrayList;

public class ColorArrayListExample {
    public static void main(String[] args) {

        //create a new arraylist to store colours
        ArrayList<String> colorsList = new ArrayList<>();

        //add some colours to the arraylist
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Yellow");
        colorsList.add("Orange");

        // print the colours using forEach loop
        System.out.println("Colours in the ArrayList:");
        for (String colour : colorsList){
            System.out.println(colour);
        }


    }
}

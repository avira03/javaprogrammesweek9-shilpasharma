package javaprogrammes;

public class ReverseArray {
    public static void main(String[] args) {
        //example array
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array");
        printArray(originalArray);

        //reverse the array
        ReverseArray(originalArray);

        System.out.println("\nReversed Array:");
    }

    //method to reverse the array
    public static void ReverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start< end){
            //swap elements at start and end indices
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;

            // move indices towards the center
            start++;
            end--;

    }

    }
    // method to print the array
    public static void printArray(int[] arr){
        for (int value : arr) {
            System.out.println(value + " ");
        }
        System.out.println();
        }
    }



 /**

 1.

import java.util.Arrays;
public class SingleDimensionArray{
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" +  e);
        }
    }

    public static void main(String[] args) {
        //create the object of the class
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0,1);
        singleDimensionArray.insert(1,2);
        singleDimensionArray.insert(2,3);
        singleDimensionArray.insert(3,4);
        singleDimensionArray.insert(4,5);
        singleDimensionArray.insert(5,3);
        singleDimensionArray.insert(6,4);
        singleDimensionArray.insert(7,5);
//        System.out.println(singleDimensionArray.toString());
        System.out.println(Arrays.toString(singleDimensionArray.arr));
    }
}

*/

// 2.

// For traversing an array.

//import java.util.Scanner;

//public class SingleDimensionArray {
    //public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the length of the array: ");
       // int len = sc.nextInt();

      //  int[] arr = new int[len];

      //  System.out.println("Enter " + len + " elements: ");
      //  for (int i = 0; i < len; i++) {
       //     arr[i] = sc.nextInt();
       // }

       // System.out.println("Array elements are:");
       // for ( int i = 0; i < len; i++) {
       //     System.out.print(arr[i] + " ");
       // }
   // }
//}

// 3.

// For deleting a specific value as well as the whole array. Could not completely figure
 // this one out getting an error while running this code.

import java.util.Scanner;
import java.util.Arrays;

public class SingleDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter " + len + " elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value to delete: ");
        int valueToDelete = sc.nextInt();
        arr = deleteValueFromArray(arr, valueToDelete);

        System.out.println("Array after deletion and clearing:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] deleteValueFromArray(int[] arr, int value) {
        int newSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                arr[newSize++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, newSize);
    }
}

/*

 4.

import java.util.Scanner;

public class SingleDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value to search: ");
        int searchValue = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < len; i++) {
            if (arr[i] == searchValue) {
                System.out.println("The value " + searchValue + " is at index " + i + " in the array.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + searchValue + " is not found in the array.");
        }
    }
}
  */
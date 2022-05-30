import Arrays.DynamicArray;
import LinkedList.LinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         linkedListDemo();
         // dynamicArrayDemo();
    }

    public static void linkedListDemo() {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(80);
        list.addLast(90);
        System.out.println("List contains 90: " + list.contains(90));
        list.deleteLast();
        list.deleteFirst();
        list.print();
        System.out.println("List contains 90: " + list.contains(90));
        System.out.println("Index of 90: " + list.indexOf(90));
        System.out.println("Size of list: " + list.size());
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void dynamicArrayDemo() {
        var arr = new DynamicArray(3);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.removeAt(0);
        arr.print();
        System.out.println(arr.indexOf(40));
    }

    public static void arrDemo() {
        // int array
        // Use curly braces for initializing an array
        int[] numbers = {1,2,3,4,5};

        // char array
        char[] letters = {'a','b','c'};

        // Printing an array
        // You cannot show an array's contents like this. You have to use the Arrays class.
        // System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(letters));
    }
}

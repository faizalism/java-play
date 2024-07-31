import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class HelloWorld {

    public static void main(String[] args) {


//        Design Guru
//        testContainsDuplicate();
//        testCheckIfPangram();
//        testReverseVowels();
//        testIsPalindrome();
        testIsAnagram();

//         Algorithms
//        testIsDistinct();
    }

    public static void testIsDistinct() {
        int[] nums = new int[] {5,56,77,55,44,99,25,45};
        System.out.println(Algorithms.isDistinct(nums));
    }

    // Design Guru
    public static void testIsAnagram() {
        String s = "tyuio";
        String t = "oouyt";
        System.out.println(DesignGuru.isAnagram(s,t));
    }

    public static void testIsPalindrome() {
        String str = "'a''''a'";
        System.out.println(DesignGuru.isPalindrome(str));
    }

    public static void testContainsDuplicate() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,2};
        DesignGuru.containsDuplicate(arr);
    }

    public static void testCheckIfPangram() {
        String sentence = "the Quick brown fox jumps over the lazy dog";
        DesignGuru.checkIfPangram(sentence);
    }

    public static  void testReverseVowels() {
        String str = "Hello";
        DesignGuru.reverseVowels(str);
    }

    // Implementing Data Structures
    public static void testLinkedList() {
                Node x = new Node(5);
                LinkedList list1 = new LinkedList(x);
                System.out.println(list1.head.val);
                list1.printList();
    }

    public static void testArray() {
        Array arr1 = new Array();
        arr1.insert(10);
        arr1.insert(20);
        arr1.insert(30);
        arr1.insert(40);
        arr1.insert(50);
        arr1.insert(60);
        arr1.insert(70);
        arr1.removeAt(0);
        System.out.println(arr1.indexOf(60));
    }


}

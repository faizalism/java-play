import java.util.*;

public class DesignGuru {

    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> myHashSet = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
            if(!myHashSet.add(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> alphabets = new HashSet<Character>();
        for(int i=0;i<sentence.length();i++) {
            char currChar = sentence.charAt(i);
            if(Character.isAlphabetic(currChar)) {
                currChar = Character.toLowerCase(currChar);
                alphabets.add(currChar);
            }
        }
//        System.out.println(alphabets);
        return alphabets.size() == 26;
    }

    public static String reverseVowels(String str) {
        char[] charArray = str.toCharArray();

        // Declaring as a list immutable since the list of vowels is fixed
        List<Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));

        int left = 0;
        int right = charArray.length - 1;

        while(left < right) {
            while(left< right && !vowels.contains(Character.toLowerCase(charArray[left]))) {
                left++;
            }

            while(left< right && !vowels.contains(Character.toLowerCase(charArray[right]))) {
                right--;
            }

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static boolean isPalindrome(String str) {
        int leftPtr = 0;
        int rightPtr = str.length() - 1;

        while(leftPtr < rightPtr) {
            while(leftPtr < rightPtr && !Character.isLetterOrDigit(str.charAt(leftPtr)))
                leftPtr++;

            while(leftPtr < rightPtr && !Character.isLetterOrDigit(str.charAt(rightPtr)))
                rightPtr--;

            if(leftPtr < rightPtr)
            {
                char leftChar = Character.toLowerCase(str.charAt(leftPtr));
                char rightChar = Character.toLowerCase(str.charAt(rightPtr));
                if(leftChar != rightChar)
                    return false;

                leftPtr++;
                rightPtr--;
            }
        }

        return true;

    }

    public static boolean isAnagram(String t,String s) {
        if(t.length() != s.length())
            return false;

        HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
        for(int i=0;i<t.length();i++) {
            char charInFirstString = t.charAt(i);
            char charInSecondString = s.charAt(i);
            charCount.put(charInFirstString,charCount.getOrDefault(charInFirstString,0) +1);
            charCount.put(charInSecondString, charCount.getOrDefault(charInSecondString,0)-1);
        }

        for(char c:charCount.keySet()) {
            if(charCount.get(c) != 0)
                return false;
        }
        return true;
    }

    public static int findShortestDistanceBetweenWords(String[] words, String word1, String word2) {

        int left = 0;
        int 

        for(int i=0;i<words.length;i++) {
            if(words[i].equals(word1)) {
                word1Indexes.add(i);
            }
            if(words[i].equals(word2)) {
                word2Indexes.add(i);
            }
        }
    }


}


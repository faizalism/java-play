import java.util.HashSet;
import java.util.Set;

public class Algorithms {
    public static boolean isDistinct(int[] nums) {
        Set<Integer> myHashSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            if(!myHashSet.add(nums[i]))
                return false;
        }
        return true;
    }
}

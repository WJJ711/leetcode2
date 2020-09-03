import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (Integer num : set) {
            if (!set.contains(num - 1)){
                int temp=1;
                while (set.contains(num+1)){
                    temp++;
                    num++;
                }
                res=Math.max(res,temp);
            }
        }
        return res;
    }
}
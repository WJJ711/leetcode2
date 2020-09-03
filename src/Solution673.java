import java.util.Arrays;

public class Solution673 {
    public int findNumberOfLIS(int[] nums) {
        int N = nums.length;
        if (N <= 1) {
            return N;
        }
        int[] lengths = new int[N];
        int[] count = new int[N];
        Arrays.fill(count, 1);
        Arrays.fill(lengths,1);
        int max = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (lengths[i] == lengths[j] + 1) {
                        count[i] += count[j];
                    } else if (lengths[i] <= lengths[j]) {
                        lengths[i] = lengths[j] + 1;
                        count[i] = count[j];
                    }
                }
            }
            max = Math.max(max, lengths[i]);
        }
        int res = 0;
        for (int i = 0; i < lengths.length; i++) {
            if (lengths[i] == max) {
                res += count[i];
            }
        }
        return res;
    }
}
import java.util.PriorityQueue;

/*
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int num : nums) {
            if (queue.size()<k){
                queue.offer(num);
            }else {
                if (num>queue.peek()){
                    queue.poll();
                    queue.offer(num);
                }
            }
        }
        return queue.peek();

    }
}*/
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int target=nums.length-k;
        int l=0,r=nums.length-1;
        while (true){
            int index = partition(nums, l, r);
            if (index==target){
                return nums[target];
            }else if (index<target){
                l=index+1;
            }else {
                r=index-1;
            }
        }
    }
    private int partition(int[] num,int left,int right){
        int t=num[left];
        while (left<right){
            while (left<right&&t<=num[right]){
                right--;
            }
            num[left]=num[right];
            while (left<right&&t>=num[left]){
                left++;
            }
            num[right]=num[left];
        }
        num[left]=t;
        return left;

    }
}
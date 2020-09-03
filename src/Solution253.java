import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution253 {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length==0){
            return 0;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int[] interval : intervals) {
            if (!queue.isEmpty()&&interval[0]>=queue.peek()){
                queue.poll();
            }
            queue.add(interval[1]);
        }
        return queue.size();


    }
}
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int lo = loBound(nums, target);
        int hi = hiBound(nums, target);
        int[] res={lo,hi};
        return res;
    }

    private int loBound(int num[],int target){
        int l=0,r=num.length-1;
        while (l<=r){
            int mid=(l+r)>>>1;
            if (num[mid]>target){
                r=mid-1;
            }else if (num[mid]<target){
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
      if (l>=num.length||num[l]!=target){
          return -1;
      }
      return l;

    }

    private int hiBound(int num[],int target){
        int l=0,r=num.length-1;
        while (l<=r){
            int mid=(l+r)>>>1;
            if (num[mid]>target){
                r=mid-1;
            }else if (num[mid]<target){
                l=mid+1;
            }else {
                l=mid+1;
            }
        }
        if (r<0||num[r]!=target){
            return -1;
        }
        return r;
    }
}
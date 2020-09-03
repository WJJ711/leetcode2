public class Solution852 {
    public static int peakIndexInMountainArray(int[] A) {
        int l=0,r=A.length-1;
        while (l<r){
            int mid=(l+r)>>>1;
            if (A[mid]<A[mid+1]){
                l=mid+1;
            }else {
                r=mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a={0,1,0};
        peakIndexInMountainArray(a);
    }
}
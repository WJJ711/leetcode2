public class Offer11Solution {
    public int minArray(int[] numbers) {
        int i=0;
        int j=numbers.length-1;
         while (i<j){
             int mid=(i+j)>>>1;
             if (numbers[mid]>numbers[j]){
                 i=mid+1;
             }else if (numbers[mid]<numbers[i]){
                 j=mid;
             }else {
                j--;
             }
         }
         return numbers[i];
    }
}
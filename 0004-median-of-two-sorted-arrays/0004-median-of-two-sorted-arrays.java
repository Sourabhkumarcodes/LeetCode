class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] arr=new int[nums1.length+nums2.length];
         int ind=0;
         for(int i:nums1){
            arr[ind++]=i;
         }
         for(int i:nums2){
            arr[ind++]=i;
         }
         Arrays.sort(arr);
         int mid=(arr.length-1)/2;
         if(arr.length%2==0){
         return (double)(arr[mid+1]+(arr[mid]))/2;
         }
         return (double)(arr[(arr.length-1)/2]);
    }
}
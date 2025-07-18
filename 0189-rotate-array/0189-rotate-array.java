class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int arr[]= new int[n];
        k=k%n;
        int st=0;
        for(int i=k;i<n;i++){
            arr[i]=nums[st++];
        }
        int end=0;
        for(int i=n-k;i<n;i++){
            arr[end++]=nums[i];
        }
        int tem=0;
        for(int i : arr){
            nums[tem++]=i;
        }
    }
}
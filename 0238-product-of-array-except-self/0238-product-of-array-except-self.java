class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=1;
        }
        int lt=1;
        for(int i=0;i<nums.length;i++){
            arr[i]*=lt;
            lt*=nums[i];
        }
        int rt=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=rt;
            rt*=nums[i];
        }
        return arr;
    }
}
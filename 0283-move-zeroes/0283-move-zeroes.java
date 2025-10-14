class Solution {
    public void moveZeroes(int[] nums) {
       int beg=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[beg];
            nums[beg]=temp;
            beg++;
        }
       }
        
        // int st=0;
        // int end=nums.length-1;
        // while(st!=end){
        //     if(nums[st]!=0){
        //         st++;
        //     }else if(nums[end]==0){
        //         end--;
        //     }
        //     int temp=nums[st];
        //     nums[st]=nums[end];
        //     nums[end]=temp;
        // }
    }
}
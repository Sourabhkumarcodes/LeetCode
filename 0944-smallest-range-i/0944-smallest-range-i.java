class Solution {
    public int smallestRangeI(int[] nums, int k) {
       int min=nums[0];
       int max=nums[0];
       for(int i=1;i<nums.length;i++){
        min=Math.min(min,nums[i]);
        max=Math.max(max,nums[i]);
       }
       int temp=max-min;
       int res=temp-2*k;
       return Math.max(0,res);
    }
}
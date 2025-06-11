class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int end=nums.length;
        while(st<end){
            int mid=st+(end-st)/2;
            if(nums[mid]>=target){
                end= mid;
            }else{
                st=mid+1;
            }
        }
        if(st<nums.length && nums[st]==target){
            return st;
        }
        return -1;
    }
}
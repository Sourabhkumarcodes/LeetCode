class Solution {
    public int[] searchRange(int[] nums, int target) {
        int temp[]=new int[2];
        temp[0]=-1;
        temp[1]=-1;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                temp[ind++]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                temp[ind++]=i;
                break;
            }
        }
        return temp;
    }
}
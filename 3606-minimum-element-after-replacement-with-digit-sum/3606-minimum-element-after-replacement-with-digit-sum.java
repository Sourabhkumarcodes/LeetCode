class Solution {
    public int minElement(int[] nums) {
        int ind=0;
        for(int i : nums){
            int sum=0;
            while(i>0){
                sum+=i%10;
                i/=10;
            }
            nums[ind++]=sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}
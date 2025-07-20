class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int mid = nums.length/2;
        int val=0;
        for(int i:map.keySet()){
            if(map.get(i)>=mid){
                val= i;
            }
        }
        return val;
    }
}
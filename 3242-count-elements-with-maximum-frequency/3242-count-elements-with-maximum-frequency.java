class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int i:map.keySet()){
            max=Math.max(map.get(i),max);
        }
        int val=0;
        for(int i: map.keySet()){
            if(max==map.get(i)){
                val+=max;
            }
        }
        return val;
    }
}
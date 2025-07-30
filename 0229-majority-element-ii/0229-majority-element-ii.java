class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>n){
                al.add(entry.getKey());
            }
        }
        return al;
        
    }
}
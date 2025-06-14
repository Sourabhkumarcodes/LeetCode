class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        ArrayList<Integer> al=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==1){
                al.add(i);
            }
        }

        int temp[]=new int[al.size()];
        for(int i=0;i<temp.length;i++){
            temp[i]=al.get(i);
        }
        return temp;
    }
}
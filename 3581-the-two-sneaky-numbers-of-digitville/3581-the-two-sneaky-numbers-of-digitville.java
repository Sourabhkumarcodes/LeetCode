class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        //ArrayList<Integer> al=new ArrayList<>();
        int[] arr=new int[2];
        int pt=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==2){
                arr[pt++]=i;
            }
        }
            return arr;
    }
}
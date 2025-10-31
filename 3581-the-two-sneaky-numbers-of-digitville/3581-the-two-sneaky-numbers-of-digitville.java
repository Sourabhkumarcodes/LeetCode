class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==2){
                al.add(i);
            }
        }
        int[] arr=new int[al.size()];
        int pt=0;
        for(int i:al){
            arr[pt++]=i;
        }
 return arr;
    }
   
}
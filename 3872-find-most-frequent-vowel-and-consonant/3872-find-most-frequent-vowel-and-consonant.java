class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        char[] arr=s.toCharArray();
        for(char i:arr){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                map1.put(i,map1.getOrDefault(i,0)+1);
            }else{
                map2.put(i,map2.getOrDefault(i,0)+1);
            }
        }
        int sum1=0;
        int sum2=0;

        if(!map1.isEmpty()){
            sum1=Collections.max(map1.values());
        }
        if(!map2.isEmpty()){
            sum2=Collections.max(map2.values());
        }

        return sum1+sum2;
    }
}
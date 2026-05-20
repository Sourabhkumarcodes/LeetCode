class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums1){
            hs.add(i);
        }
        int small=Integer.MAX_VALUE;
        for(int i:nums2){
            if(hs.contains(i)){
                small=Math.min(small,i);
            }
        }
        return small ==  Integer.MAX_VALUE ?-1:small;
    }
}
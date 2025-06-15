class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] temp=new int[Math.min(nums1.length,nums2.length)];
        boolean[] bl=new boolean[nums2.length];
        int idx=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&& !bl[j]){
                    temp[idx++]=nums2[j];
                    bl[j]=true;
                    break;
                }
            }
        }
        return Arrays.copyOf(temp,idx);
    }
}
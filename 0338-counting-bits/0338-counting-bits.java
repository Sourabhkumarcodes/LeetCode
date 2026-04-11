class Solution {
    public int[] countBits(int n) {
        if (n==1) return new int[]{0,1};
        int[] arr=new int[n+1];
        arr[0]=0;
        
        for(int i=1;i<=n;i++){
            int num=i;
            int cnt=0;
            while(num!=0){
                num=num&(num-1);
                cnt++;
            }
            arr[i]=cnt;
            cnt=0;
        }
        return arr;
    }
}
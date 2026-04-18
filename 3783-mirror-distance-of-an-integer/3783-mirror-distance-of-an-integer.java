class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int rev=0;
        while(temp!=0){
            int dig=temp%10;
            rev=rev*10+dig;
            temp/=10;
        }

        return Math.abs(n-rev);
    }
}
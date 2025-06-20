class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        int temp=n;
        while(temp!=1){
            if(temp%2==0){
                temp=temp/2;
                sum+=temp;
            }else{
                temp=(temp-1)/2;
                sum+=temp+1;
            }
        }
        return sum;
    }
}
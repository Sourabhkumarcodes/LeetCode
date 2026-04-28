class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev1=0;
        while(temp!=0){
            int dig=temp%10;
            rev1=rev1*10+dig;
            temp=temp/10;
        }

        int rev2=0;
        while(rev1!=0){
            int dig=rev1%10;
            rev2=rev2*10+dig;
            rev1=rev1/10;
        }

        return num==rev2;
    }
}
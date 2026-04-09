class Solution {
    public int reverse(int x) {
        // int reversed = 0;
        // while (x != 0) {
        //     int digit = x % 10;
        //     x /= 10;
        //     if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
        //     if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
        //     reversed = reversed * 10 + digit;
        // }
        // return reversed;

        int pos=x;
        int rev=0;
        while(pos!=0){
            int dig=pos%10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev=rev*10+dig;
            pos/=10;
        }
            
        // if(x<0){
        //     return rev*-1;
        // }
        return rev;
    }
}
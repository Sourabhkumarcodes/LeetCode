class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carr=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0||carr==1){
            int sum=carr;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carr=sum/2;

        }
        return sb.reverse().toString();
    }
}
class Solution {
    public String generateTheString(int n) {
        String val="a";
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(val);
        }
        if(n%2==0){
            sb.deleteCharAt(0);
            return sb.toString()+"b";
        }else{
            return sb.toString();
        }
    }
}
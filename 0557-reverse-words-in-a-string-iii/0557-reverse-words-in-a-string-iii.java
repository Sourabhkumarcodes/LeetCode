class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String[] res=new String[str.length];
        for(int i=0;i<str.length;i++){
            String temp="";
            String val=str[i];
            for(int j=val.length()-1;j>=0;j--){
                temp=temp+val.charAt(j);
            }
            res[i]=temp;
        }
        return String.join(" ",res);
    }
}
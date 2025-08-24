class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f_word=strs[0];
        String l_word=strs[strs.length-1];
        String res="";
        for(int i=0;i<Math.min(f_word.length(),l_word.length());i++){
            if(f_word.charAt(i)!=l_word.charAt(i)){
                break;
            }
            res+=""+f_word.charAt(i);
        }
        return res;
    }
}
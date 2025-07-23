class Solution {
    public boolean detectCapitalUse(String word) {
        if(word==null||word.isEmpty()){
            return false;
        }
        // if(word.length()==1){
        //     return true;
        // }
        String str1=word.toUpperCase();
        String str2=word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        String str3=word.toLowerCase();
        if(word.equals(str1)){
            return true;
        }else if(word.equals(str3)){
            return true;
        }else if(word.equals(str2)){
            return true;
        }
        return false;
    }
}
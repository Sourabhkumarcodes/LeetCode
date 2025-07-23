class Solution {
    public boolean detectCapitalUse(String word) {
        if(word==null||word.isEmpty()){
            return false;
        }
        String str1=word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        if(word.equals(word.toUpperCase())){
            return true;
        }else if(word.equals(word.toLowerCase())){
            return true;
        }else if(word.equals(str1)){
            return true;
        }
        return false;
    }
}
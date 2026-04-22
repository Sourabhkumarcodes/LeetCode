class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb=new StringBuilder(magazine);
        for(int i=0;i<ransomNote.length();i++){
            boolean flag=false;
            for(int j=0;j<sb.length();j++){
                if(ransomNote.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }

        return true;
    }
}
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x=0;
        if(x++ == num){
            return x;
        }
        return num+t+t;
    }
}
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            int temp=i;
            boolean div=true;
            while(temp!=0){
                int digit=temp%10;
                if(digit==0||i%digit!=0){
                    div=false;
                    break;
                }
                temp/=10;
            }
            if(div){
                al.add(i);
            }
        }
        return al;
    }
}
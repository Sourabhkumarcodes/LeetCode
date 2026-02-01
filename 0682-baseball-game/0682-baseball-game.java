class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> stack =new Stack<>();
        //ArrayList<Integer> al=new ArrayList<>();
        for(String str:operations){
            if(str.equals("C")){
                stack.pop();
            }else if(str.equals("+")){
                int val=stack.peek() + stack.get(stack.size()-2);
                stack.push(val);
            }else if(str.equals("D")){
                stack.push(stack.peek()*2);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }

        for(int i : stack){
            sum+=i;
        }
        return sum;
    }
}
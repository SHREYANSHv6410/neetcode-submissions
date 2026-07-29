class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String c : operations){
            if(c.equals("+")){
                int a=stack.pop();
                int b=a+stack.peek();
                stack.push(a);
                stack.push(b);
            }
            else if(c.equals("D")){
                int a=stack.peek();
                stack.push(2*a);
            }
            else if(c.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        int sol=0;
        while(!stack.isEmpty()){
            sol=sol+stack.pop();
        }
        return sol;
    }
}
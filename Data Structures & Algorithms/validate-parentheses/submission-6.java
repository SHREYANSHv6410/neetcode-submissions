class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            if(c==')' || c=='}' || c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(c==')' && !stack.isEmpty() && stack.pop()!='('){
                    return false;
                }
                else if(c=='}' && !stack.isEmpty() && stack.pop()!='{'){
                    return false;
                }
                else if(c==']' && !stack.isEmpty() && stack.pop()!='['){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}

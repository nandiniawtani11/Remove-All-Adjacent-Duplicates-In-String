class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack();
        for(int i=0;i<n;i++){
            if(stack.size()>0 && Math.abs((int)stack.peek()-(int)s.charAt(i)) == 0){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        s = "";
        while(stack.size()>0){
            s = stack.pop() + s;
        }
        return s;
        
    }
}

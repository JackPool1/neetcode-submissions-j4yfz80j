class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder stack = new StringBuilder();
        List<String> res = new ArrayList<>();

        backTrack(0,0,n,res,stack);

        return res;     
    }

    private void backTrack(int openN, int closedN, int n,
    List<String> res, StringBuilder stack){

    if(openN == closedN && openN == n){
        res.add(stack.toString());
        return;
    }

    if(openN < n){
        stack.append('(');
        backTrack(openN + 1, closedN, n , res, stack);
        stack.deleteCharAt(stack.length() - 1);
    }
    if(closedN < openN){
        stack.append(')');
        backTrack(openN, closedN + 1, n, res, stack);
        stack.deleteCharAt(stack.length() - 1);
    }

    }
}

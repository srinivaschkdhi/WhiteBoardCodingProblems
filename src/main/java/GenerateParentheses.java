import java.util.ArrayList;
import java.util.List;


class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }

    /**
 * @author Srinivas_Chintakindhi
 */
// left == no of left parenthesis left to add
// right == no of right parentheis left to add
// left < 0 ==> if no left parentheis left . we cannot add left parenthesis.
// if n == 2
// ((
// l = 0, r = 2, we cal helper(result,curr + "("+left-1,right)
// l = -1, r = 2 .     in this case we cannot add left parenthesis as -1 < 0.

// left > right ===> if no of left parenthesis left are more i.e in curr we have less no left paren than right . we cannot
    // right parentheis.
// if n == 2
// ()
// l = 1, r = 1, we cal helper(result,curr + ")"+left,right - 1)
// l = 1, r = 0 .     in this case we cannot add right parenthesis as l > r.

     public List<String> generateParentheis(int n) {
        List<String> result = new ArrayList<>();
        ;
        helper(result, "", n, n);
        return result;
    }

    private void helper(List<String> result, String curr, int left, int right) {
        if (left < 0 || left > right)
            return;

        if (left == 0 && right == 0) {
            result.add(curr);
            return;
        }

        helper(result, curr + "(", left - 1, right);
        helper(result, curr + ")", left, right - 1);
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> parentheis = new GenerateParentheses().generateParentheis(3);
        parentheis.forEach(System.out::println);
    }
}

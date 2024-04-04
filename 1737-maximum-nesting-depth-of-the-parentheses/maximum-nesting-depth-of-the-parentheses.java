class Solution {
    public int maxDepth(String s) {
        int ct=0;
        int maxNum =0;
        for(char c:s.toCharArray())
        {
            if(c == '('){
                ct++;
                if(maxNum<ct)
                maxNum=ct;
            }
            else if(c ==')'){
                ct--;
            }
        }
        return maxNum;
    }
}
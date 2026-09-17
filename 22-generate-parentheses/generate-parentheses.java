class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> ans=new ArrayList<>();
        Parenthesis(n,"",0,0,ans);
        return ans;
    }
    public void Parenthesis(int n,String s,int l,int r,List<String>ans){
        if(r==n) {
            ans.add(s);
            return;
        }
        if(l<n)  Parenthesis(n,s+"(",l+1,r,ans);
        if(r<l)  Parenthesis(n,s+")",l,r+1,ans);
    }
}
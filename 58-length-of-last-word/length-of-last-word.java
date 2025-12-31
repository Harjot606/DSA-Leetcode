class Solution {
    public int lengthOfLastWord(String s) {
        
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                count++;
                ans=count;
                
            }
            else{
                count=0;
            }
        }
        return ans;
    }
}
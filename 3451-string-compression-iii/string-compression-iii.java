class Solution {
    public String compressedString(String word) {
        String ans="";
        int count=1;
        for(int i=1;i<word.length();i++){
            char prev=word.charAt(i-1);
            char curr=word.charAt(i);

            if(curr==prev && count<9 ){
                count++;
            }
            
            else{
                ans+=count;
                ans+=prev;
                count=1;
            }
        }
        ans+=count;
        ans+=word.charAt(word.length()-1);
        return ans;
    }
}
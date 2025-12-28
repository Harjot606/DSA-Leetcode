class Solution {
    public String reverseWords(String s) {
        
        StringBuilder str=new StringBuilder("");
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }
            else{
                str.reverse();
                ans+=str;
                ans+=" ";
                str.delete(0,str.length());
            }
        }
        str.reverse();
        ans+=str;
        return ans;
    }
        }
    

  
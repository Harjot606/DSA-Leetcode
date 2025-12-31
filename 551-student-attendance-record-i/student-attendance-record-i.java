class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        int countL=0;
        
        int consicutive=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                countA++;
                consicutive=0;
            }
            else if(s.charAt(i)=='L'){
                consicutive++;
                if(consicutive>2) return false;
            }
             else{
                consicutive=0;
             }
             if(countA>1) return false;
        }

        return true;
    }
}
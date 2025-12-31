class Solution {
    public boolean judgeCircle(String moves) {
            int x=0;
            int j=0;


            for(int i=0;i<moves.length();i++){
                if(moves.charAt(i)=='L') x--;
                if(moves.charAt(i)=='R') x++;
                if(moves.charAt(i)=='U') j++;
                if(moves.charAt(i)=='D') j--;
            }
            if(x==0 && j==0) return true;

            return false;
    }
}
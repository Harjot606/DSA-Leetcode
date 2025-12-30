class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char larsma=letters[0];
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
               larsma=letters[i];
               break;
            }
        }
        return larsma;
    }
}
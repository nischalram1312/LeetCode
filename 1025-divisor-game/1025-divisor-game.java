class Solution {
    public boolean divisorGame(int n) {
        if(isOdd(n)){
            return false;
        }
        return true;
    }
    public boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // int x = n^0;
        // System.out.println(x);
        int count =0;
        while(n!=0){
            n = n & n-1;
            count ++;
            n >>>= 1;
        }
        return count;
    }
}
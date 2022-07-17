class Solution {
    public char findTheDifference(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        int sums=0;
        int sumt=0;
        for(int i=0; i<chs.length; i++){
            sums+=(int)chs[i];
        }
        for(int i=0; i<cht.length; i++){
            sumt+=(int)cht[i];
        }
        int sum = sumt-sums;
        return (char) sum;
    }
}
class Solution {
    public void reverseString(char[] s) {
        char[] arr = new char[s.length];
        for(int i=0; i<s.length; i++){
            arr[i]=s[s.length-1-i];
        }
        for(int i=0; i<s.length; i++){
            s[i]=arr[i];
        }
        
        
       
    }
}
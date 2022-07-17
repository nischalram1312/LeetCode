class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        for (int i = 0; i < aliceSizes.length; i++){
            sumAlice+=aliceSizes[i];
        }
        int sumBob = 0;
        for (int i = 0; i < bobSizes.length; i++){
            sumBob+=bobSizes[i];
        }
        int x = (sumAlice-sumBob)/2;
        System.out.print(sumAlice+" "+sumBob+" "+x);
        
        
        int[] arr = new int[2];
        
        for(int i=0; i<aliceSizes.length; i++){
            for(int j=0; j<bobSizes.length; j++){
                if(aliceSizes[i]==bobSizes[j]+x){
                    arr[0]=aliceSizes[i];
                    arr[1]=bobSizes[j];
                }
            }
        }
        
        return arr;
    }
}
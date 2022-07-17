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
        int diff = (sumAlice-sumBob)/2;
        //alice gives x candies to bob
        //bob givevs y candies to alice
        //sumAlice-x+y=sumBob+x-y
        //equation will be y = (sumAlice-sumBob)/2 + x;
        System.out.print(sumAlice+" "+sumBob+" "+diff);
        
        
        int[] arr = new int[2];
        
        for(int i=0; i<aliceSizes.length; i++){
            for(int j=0; j<bobSizes.length; j++){
                //equation above
                if(aliceSizes[i]==diff+bobSizes[j]){
                    arr[0]=aliceSizes[i];
                    arr[1]=bobSizes[j];
                }
            }
        }
        
        return arr;
    }
}
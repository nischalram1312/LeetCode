class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        //repeating digit
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                arr[0]=nums[i];
            }
        }
        //missing digit
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]!=i+1){
        //         arr[1]=i+1;
        //         break;
        //     }
        // }
        int Actualsum = Arrays.stream(nums).sum();
        int OriginalSum = 0;
        for(int i=0; i<=nums.length; i++){
            OriginalSum+=i;
        }
        int x=Actualsum-arr[0];
        arr[1]=OriginalSum-x;

        System.out.print(x);
        
        return arr;
        
    }
}
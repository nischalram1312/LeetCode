class Solution {
    public void sortColors(int[] nums) {
        boolean swapped = false;
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        // System.out.print(nums);
    }
}
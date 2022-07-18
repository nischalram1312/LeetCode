class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        int i=0;
        while(i<nums.length){
            int rightIndex=nums[i]-1;
            if(nums[i]!=nums[rightIndex]){
                swap(nums, i, rightIndex);
            }else{
                i++;
            }
        }
        System.out.print(Arrays.toString(nums));
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }
        }
        return list;
    }
    public void swap(int[] nums, int i, int rightIndex){
        int temp = nums[i];
        nums[i] = nums[rightIndex];
        nums[rightIndex] = temp;
    }
}
// class Solution {
//     public int singleNumber(int[] nums) {
//         Arrays.sort(nums);
        
// //         for(int i=0; i<nums.length-1; i++){
// //             if(i%2==0){
// //                 if(nums[i]!=nums[i+1]){
// //                     return nums[i];
// //                 }
                
// //             }
// //         }
//         int count =1;
//         for(int i=0; i<nums.length-1; i++){
//             if(nums[i]==nums[i+1]){
//                 count++;                
//             }
//             else if(count ==1){
//                 return nums[i];
//             }
//             else{
//                 count =1;
//             }
//         }
        
//         return nums[nums.length-1];
//     }
//}

class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int n: nums){
            unique = unique^n;
        }
        return unique;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i < nums.length - 1; i++){
           for(int j=i+1; j < nums.length; j++){
               if(nums[i] + nums[j] == target){
                   return new int [] {i, j};
               }
            }
        }

        return new int[] {};

    }
}


/*
Input
nums =
[2,7,11,15]
target =
9
Output
[0,1]

    */

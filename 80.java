class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(index  < 2){
                nums[index++]=nums[i];
            }else if(nums[i] > nums[index-2]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}


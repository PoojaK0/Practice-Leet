class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;
        
        Arrays.sort(nums);
        int max=0;
        int count=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1])
            if(nums[i]+1==nums[i+1]){
                count++;

            }else{
                max=Math.max(max,count);
                count=1;
            }
            
    }
    return Math.max(max,count);
}
}

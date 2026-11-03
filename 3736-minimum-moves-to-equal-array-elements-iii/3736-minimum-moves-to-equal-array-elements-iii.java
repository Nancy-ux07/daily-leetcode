class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            sum+=nums[i];
        }
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=max-nums[i];
        }
        return s;
    }
}
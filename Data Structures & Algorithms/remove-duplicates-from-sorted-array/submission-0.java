class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = i+1;
        int count = 1;
        while(i<n && j<n){
            if(nums[i]==nums[j]){
                j++;
            }else{
                nums[++i] = nums[j];
                j++;
                count++;
            }
        }
        return count;
    }
}
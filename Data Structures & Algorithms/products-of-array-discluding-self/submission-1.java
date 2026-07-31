class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i=n-1;i>=0;i--){
            arr[i]*=suffix;
            suffix*=nums[i];
        }
        return arr;
    }
}  

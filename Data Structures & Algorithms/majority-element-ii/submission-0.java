class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int candidate1 = 0;
        int count1 = 0;
        int candidate2 = 1;
        int count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(candidate1==nums[i]){
                count1++;
            }else if(candidate2==nums[i]){
                count2++;
            }else if(count1==0){
                candidate1 = nums[i];
                count1=1;
            }else if(count2==0){
                candidate2= nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==candidate1)count1++;
            else if(num==candidate2)count2++;
        }
        int t = nums.length/3;
        if(count1>t) l.add(candidate1);
        if(count2>t && candidate1!=candidate2) l.add(candidate2);
        return l;
    }
    
}
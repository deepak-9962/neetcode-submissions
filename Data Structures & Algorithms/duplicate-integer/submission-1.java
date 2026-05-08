class Solution {
    public boolean hasDuplicate(int[] nums) {
        int j=0;
        int count=0;
        for(int i=1;i<n;i++){
            if(i==j){
                continue;
            }
            if(nums[j]==nums[i]){
                count++;
            } 
        }
        if(count>0){
            return true;
        } 
        else{
            return false;
        }
    }
}
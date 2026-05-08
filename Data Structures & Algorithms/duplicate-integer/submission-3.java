class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
        for(int j=0;j<nums.length;j++) {
            for (int i = 0; i < nums.length; i++) {
                if (i == j) {
                    continue;
                }
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}
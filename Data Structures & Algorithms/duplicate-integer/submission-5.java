class Solution {
    public boolean hasDuplicate(int[] nums) {
      
        if(nums == null) {
            return false;
        }

        if(nums.length == 0) {
            return false; 
        }
        
        Set<Integer> numSet = new HashSet<>();

        for(int n : nums) {
            if(numSet.contains(n)) {
                return true;
            }
            numSet.add(n);
        }

        return false;
    }
}
    

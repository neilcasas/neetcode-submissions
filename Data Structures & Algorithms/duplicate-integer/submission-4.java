class Solution {
        public boolean hasDuplicate(int[] nums) {
            HashMap<Integer, Integer> duplicates = new HashMap<>();


if(nums == null ) {
    return false;
}

if(nums.length == 0) {
    return false;
}
            duplicates.put(nums[0],nums[0]);

            for(int i = 1; i < nums.length; i++) {
                // If there exists a match
                if(duplicates.get(nums[i]) != null) {
                    return true;
                }
                // Else just add it to the map again
                duplicates.put(nums[i], nums[i]);
            }
                         return false;
            }

        }
class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums == null || nums.length == 0) {
            return new int[2];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            // Get complement of nums[i]
            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                int complementIndex = map.get(complement);
                int smallerIndex = i < complementIndex ? i : complementIndex;
                int largerIndex = i > complementIndex ? i : complementIndex;

                int[] indices = {smallerIndex, largerIndex};

                return indices;
            }
            map.put(nums[i], i);
        }

        return new int[2];
    }
}

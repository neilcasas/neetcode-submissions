class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums[0];

        while(left <= right) {
            if (nums[left] < nums[right]) {
                res = Math.min(res, nums[left]);
                break;
            }


            int mid = left + (right - left) / 2; 
            res = Math.min(res, nums[mid]);

            // check if we are at the left portion
            if(nums[mid] >= nums[left]) {
                // we are in the left portion (inherently larger)
                // search right instead
                left = mid + 1;
            } else {
                // we're in the right portion instead 
                // (there could be lower ones to the left)
                right = mid - 1;
            }
        }

        return res;
    }
}

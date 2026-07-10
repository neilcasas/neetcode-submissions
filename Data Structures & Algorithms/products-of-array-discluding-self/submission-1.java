class Solution {
    public int[] productExceptSelf(int[] nums) {
        // create prefix array O(n)
        int[] prefixArray = new int[nums.length];
        prefixArray[0] = nums[0];
        int i = 1;
        while(i < prefixArray.length) {
            prefixArray[i] = prefixArray[i - 1] * nums[i];
            i++;
        }
        // create postfix array O(n)
        int[] postfixArray = new int [nums.length];
        postfixArray[nums.length - 1] = nums[nums.length - 1];
        int curr = nums.length - 1;
        int next = curr - 1;
        while(next >= 0) {
            postfixArray[next] = postfixArray[curr] * nums[next];
            curr -= 1;
            next = curr - 1;
        }

        // create output array
        int[] outputArray = new int[nums.length];
        for(i = 0; i < nums.length; i++) {
            // special case for first number
            if(i == 0) {
                outputArray[i] = 1 * postfixArray[i + 1];
            } else if (i == nums.length - 1) {
                outputArray[i] = 1 * prefixArray[i - 1];
            } else {
                outputArray[i] = prefixArray[i - 1] * postfixArray[i + 1];
            }
        }

        return outputArray;
    }
}  

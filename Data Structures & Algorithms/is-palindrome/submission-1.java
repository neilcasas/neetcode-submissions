class Solution {
    public boolean isPalindrome(String s) {
        String corrected = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");;
        char[] sArray = corrected.toCharArray();

        // if blank or one character, its a palindrome
        if(sArray.length <= 1) {
            return true;
        }

        int ptr1 = 0;
        int ptr2 = sArray.length - 1;
        int midpoint = sArray.length / 2;

        while(ptr1 <= midpoint && ptr2 >= midpoint) {
            if(sArray[ptr1] == sArray[ptr2]) {
                ptr1 += 1;
                ptr2 -= 1;
            } else {
                return false;
            }
        }

        return true;

    }
}

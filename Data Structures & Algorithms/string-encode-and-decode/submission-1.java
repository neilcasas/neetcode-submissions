class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for (String str : strs) {

            // add length of string so we know, plus a # sign, so our delimiter is 5#
            // e.g. 5#hello
            String newStr = str.length() + "#" + str;
            encodedStr += newStr;
        }

        return encodedStr;
    }

    public List<String> decode(String str) {
        ArrayList<String> decoded = new ArrayList<>();
        char[] strArray = str.toCharArray();
        int ptr1 = 0;

        while (ptr1 < strArray.length) {
            int ptr2 = ptr1;
            
            // use ptr2 to look for a pound
            while (strArray[ptr2] != '#') {
                ptr2 += 1;
            }

            // get length of string by getting the number aka 5 in 5#hello
            int length = Integer.parseInt(str.substring(ptr1, ptr2));

            // get only the actual correct string without delimiter
            decoded.add(str.substring(ptr2 + 1, (ptr2 + 1 + length)));

            // beginning of next string
            ptr1 = ptr2 + 1 + length;
        }
    
        return decoded;

    }
}

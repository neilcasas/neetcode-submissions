class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if(sArray.length == 0 || tArray.length == 0) {
            return false;
        }

        if(sArray.length != tArray.length) {
            return false;
        }

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String sortedS = new String(sArray);
        String sortedT = new String(tArray);
        
        return sortedS.equals(sortedT);

    }
}

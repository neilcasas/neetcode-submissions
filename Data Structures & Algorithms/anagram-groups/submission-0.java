class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
            While looping over the array
            1. Sort word, check if it exists in hash map
            1.1 If it exists, add to current group of words
            2. Else hash the word, place to hash map with {sorted word, <group of words>}
            3. For every key-value in hashmap, place in subarrays in new array
        */

        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            // Sort word
            String word = strs[i];
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(map.containsKey(sorted)) {
                ArrayList<String> arr = map.get(sorted);
                arr.add(strs[i]);
            }

            // Else hash word place to hashmap with group of indices
            else {
                ArrayList<String> words = new ArrayList<>();
                words.add(strs[i]);
                map.put(sorted, words);
            }
        }

        List<List<String>> list = new ArrayList<>(map.values());
        return list;
    }
}

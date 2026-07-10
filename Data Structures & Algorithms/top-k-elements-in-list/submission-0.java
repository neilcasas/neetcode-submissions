class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
            1. Scan array with hashmap
                1.1. If number not in key, add with count
                1.2. If number has key, add to count
            2. Create sorted array by values
            3. Return array from index 0 to index k - 1
        */
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
        if (map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
        } else {
            map.put(num, 1);
        }
    }

    // Create sorted array by frequency
    ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
          public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
  {
    int result = (o2.getValue()).compareTo( o1.getValue() );
    if (result != 0) {
      return result;
    } else {
      return o1.getKey().compareTo(o2.getKey());
    }
  }
    });

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = list.get(i).getKey();
    }
    
    return result;
    }
}

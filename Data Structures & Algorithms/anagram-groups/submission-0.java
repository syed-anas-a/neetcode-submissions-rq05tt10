class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            int[] count = new int[26];
            for(char ch: s.toCharArray()) {
                count[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int x: count) {
                sb.append("#");
                sb.append(x);
            }
            String key = sb.toString();
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}

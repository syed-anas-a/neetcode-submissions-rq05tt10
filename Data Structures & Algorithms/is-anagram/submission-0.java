class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!hm1.containsKey(ch1)) hm1.put(ch1, 0);
            else hm1.put(ch1, hm1.get(ch1)+1);
            if(!hm2.containsKey(ch2)) hm2.put(ch2, 0);
            else hm2.put(ch2, hm2.get(ch2)+1);
        }
        if(hm1.equals(hm2)) return true;
        return false;
    }
}

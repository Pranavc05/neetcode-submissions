class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> count = new HashMap<>();
        int result = 0;
        int left = 0;
        for(int right = 0; right<s.length();right++){
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);
            int maxcount = Collections.max(count.values());
            while(right - left + 1 - maxcount > k){
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }
            result = Math.max(result, right - left +1);
        }
        return result;
    }
}

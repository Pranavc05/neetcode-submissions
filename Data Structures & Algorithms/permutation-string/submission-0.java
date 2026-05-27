class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()> s2.length()){
            return false;
        }
        Map<Character, Integer> s1count = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            s1count.put(s1.charAt(i), s1count.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int left = 0;
        Map<Character, Integer> s2count = new HashMap<>();
        for(int right=0;right< s1.length();right++){
            s2count.put(s2.charAt(right), s2count.getOrDefault(s2.charAt(right), 0) + 1);
        }
        if(s1count.equals(s2count)){
            return true;
        }
        for(int right = s1.length();right< s2.length();right++){
            s2count.put(s2.charAt(left), s2count.get(s2.charAt(left)) - 1);
            if(s2count.get(s2.charAt(left)) == 0){
                s2count.remove(s2.charAt(left));
            }
            s2count.put(s2.charAt(right), s2count.getOrDefault(s2.charAt(right), 0) + 1);
            left++;
            if(s1count.equals(s2count)){
                return true;
            }
        }
        return false;
    }
}





//class Solution {
    //public int characterReplacement(String s, int k) {
 //       Map<Character,Integer> count = new HashMap<>();
//        int result = 0;
 //       int left = 0;
 //       for(int right = 0; right<s.length();right++){
  //          count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);
 //           int maxcount = Collections.max(count.values());
 //           while(right - left + 1 - maxcount > k){
 //               count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
 //               left++;
  //          }
  //          result = Math.max(result, right - left +1);
 //       }
 //       return result;
 //   }
//}
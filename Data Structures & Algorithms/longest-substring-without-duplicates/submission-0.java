class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlength = 0;
        Set<Character> result = new HashSet<>();
        for(int right = 0;right<s.length();right++){
            while(result.contains(s.charAt(right))){
                result.remove(s.charAt(left));
                left++;
            }
            result.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - left +1 );
        }
        return maxlength;
    }
}




 //  result.add(s.charAt(right));
         //   maxlength++;
         //   if(!result.add(s.charAt(right))){
         //       result.remove(s.charAt(left));
        //        left++;
       //     }
     //   }
class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tcount = new HashMap<>();
        for(int i = 0; i<t.length();i++){
            tcount.put(t.charAt(i), tcount.getOrDefault(t.charAt(i), 0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        int have = 0;
        int need = tcount.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0;right<s.length();right++){
            window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);
            if(window.get(s.charAt(right)).equals(tcount.get(s.charAt(right))) && window.containsKey(s.charAt(right))){
                have++;
            }
            while(have == need){
                if(right - left + 1 < resLen){
                    res[0] = left;
                    res[1] = right;
                    resLen = right - left + 1;
                } 
                window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                if(tcount.containsKey(s.charAt(left)) && window.get(s.charAt(left))< tcount.get(s.charAt(left))){
                    have--;
                }
                left++;
            }
        }
        return resLen!= Integer.MAX_VALUE ?  s.substring(res[0], res[1] + 1) : "";
    }
}



// //public boolean checkInclusion(String s1, String s2) {
//     //    if(s1.length()> s2.length()){
//             return false;
//         }
//         Map<Character, Integer> s1count = new HashMap<>();
//         for(int i = 0;i<s1.length();i++){
//             s1count.put(s1.charAt(i), s1count.getOrDefault(s1.charAt(i), 0) + 1);
//         }
//         int left = 0;
//         Map<Character, Integer> s2count = new HashMap<>();
//         for(int right=0;right< s1.length();right++){
//             s2count.put(s2.charAt(right), s2count.getOrDefault(s2.charAt(right), 0) + 1);
//         }
//         if(s1count.equals(s2count)){
//             return true;
//         }
//         for(int right = s1.length();right< s2.length();right++){
//             s2count.put(s2.charAt(left), s2count.get(s2.charAt(left)) - 1);
//             if(s2count.get(s2.charAt(left)) == 0){
//                 s2count.remove(s2.charAt(left));
//             }
//             s2count.put(s2.charAt(right), s2count.getOrDefault(s2.charAt(right), 0) + 1);
//             left++;
//             if(s1count.equals(s2count)){
//                 return true;
//             }
//         }
//         return false;
//     }
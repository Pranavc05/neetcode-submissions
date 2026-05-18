class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> Smap = new HashMap();
        Map<Character,Integer> Tmap = new HashMap();
        for(int i =0;i<s.length();i++){
            char p = s.charAt(i);
            Smap.put(p,Smap.getOrDefault(p,0)+1);
        }
        for(int j=0;j<t.length();j++){
            char q = t.charAt(j);
            Tmap.put(q,Tmap.getOrDefault(q,0)+1);
        }
        if(Smap.equals(Tmap)){
            return true;
        }
        return false;
    }
}

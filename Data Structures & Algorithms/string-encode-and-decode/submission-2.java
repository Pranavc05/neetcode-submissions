class Solution {
    // contains letter or digit
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String str : strs){
            int lengthofstr = str.length();
            result.append(lengthofstr);
            result.append("#");
            result.append(str);
           
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i = 0;
        while(i<str.length()){
            int len = 0;
            while(i<str.length() && Character.isDigit(str.charAt(i))){
                int digitvalue = str.charAt(i) - '0';
                len = len * 10 + digitvalue;
                i++;
            }
            i++;
            result.add(str.substring(i,i+len));
            i = i + len;
        }
        return result;
    }
}


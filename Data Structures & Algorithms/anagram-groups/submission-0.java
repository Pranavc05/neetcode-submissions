class Solution {
    // We are given an array of strings
    // group the anagrams together into sublists 
    // Intial thought is we have to use an enhanced for loop
    // for ( String str: strs){}
    // Will have to use a hashmap again
    // Like the previous problem we have to keep count of the freq
    // of characters in order to map anagrams together in the list of lists
    // we need to map the frequencies of each letter 
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> finals = new HashMap<>();
        for(String str: strs){
            int[] alphabet = new int[26];

            for(char c : str.toCharArray()){
                int index = c - 'a';
                alphabet[index]++;
            }
            String hash = Arrays.stream(alphabet)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("#"));
            if(!finals.containsKey(hash)){
                finals.put(hash, new ArrayList<>());
            }
            finals.get(hash).add(str);
        }
         return new ArrayList<>(finals.values());
    }
}

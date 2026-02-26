// Last updated: 2/26/2026, 6:23:30 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>> map = new HashMap<>();
4        for(String word : strs){
5            char [] chars = word.toCharArray();
6            Arrays.sort(chars);
7            String sortedWord = new String(chars);
8            //System.out.println(chars); 
9
10            map.putIfAbsent(sortedWord,new ArrayList<>());
11            map.get(sortedWord).add(word);
12        }
13        return new ArrayList<>(map.values());
14        
15    }
16}
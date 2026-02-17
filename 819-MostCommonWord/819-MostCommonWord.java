// Last updated: 2/17/2026, 4:29:23 PM
1class Solution {
2    public String mostCommonWord(String paragraph, String[] banned) {
3        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
4        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]"," "); 
5        String [] words = paragraph.split(" ");
6        //System.out.println(Arrays.toString(words));
7        HashMap<String,Integer> map = new HashMap<>();
8        String result ="";
9        int maxCount = 0;
10
11        for(String word : words){
12
13            //Skip this word if:
14            //word is empty or word is banned
15            //continue -> skip remaining code in loop & go to next iteration
16            if(word.isEmpty() || bannedSet.contains(word)){
17                continue;
18            }
19            map.put(word, map.getOrDefault(word, 0) + 1);
20
21            if(map.get(word) > maxCount){
22                maxCount = map.get(word);
23                result = word;
24            }
25
26        }
27        return result;
28        
29    }
30}
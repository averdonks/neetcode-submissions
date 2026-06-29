class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> anagrams = new HashMap<>();

       for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            char[] c = str.toCharArray();

            Arrays.sort(c);
            String sorted = String.valueOf(c);

            if (anagrams.containsKey(sorted))
                anagrams.get(sorted).add(str);
            else
                anagrams.put(sorted, new ArrayList<String>(Arrays.asList(str)));
       }
       
       return new ArrayList<>(anagrams.values()); // NeetBot
    }
}

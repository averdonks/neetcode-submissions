// After viewing solution
class Solution {
    public boolean isAnagram(String s, String t) {
        // The strings must contain the same amount of letters to be anagrams
        if (s.length() != t.length())
            return false;
        
        // Create two hash maps to store character freqencies for the strings
        Map<Character, Integer> countS = new HashMap<>(); 
        Map<Character, Integer> countT = new HashMap<>();

        // Iterate through one of the strings
        for (int i = 0; i < s.length(); i++) {
            // For both hash maps, add the current character and increment the count
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        // Returns true if the characters and counts are equal, false otherwise
        return countS.equals(countT);
    }
}

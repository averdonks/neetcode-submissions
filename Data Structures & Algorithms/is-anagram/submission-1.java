class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sCount.containsKey(s.charAt(i)))
                sCount.put(s.charAt(i), sCount.get(s.charAt(i)) + 1);
            else
                sCount.put(s.charAt(i), 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (tCount.containsKey(t.charAt(i)))
                tCount.put(t.charAt(i), tCount.get(t.charAt(i)) + 1);
            else
                tCount.put(t.charAt(i), 1);
        }

        System.out.println(sCount);
        System.out.println(tCount);

        if (sCount.equals(tCount))
            return true;

        return false;
    }
}

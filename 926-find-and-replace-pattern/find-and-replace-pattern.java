class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++)
        {
            boolean check = true;
            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();
            for(int j = 0; j < words[i].length(); j++)
            {
                char ch1 = words[i].charAt(j), ch2 = pattern.charAt(j);
                if(map1.containsKey(ch1))
                {
                    if(!(map1.get(ch1).equals(ch2)))
                    {
                        check = false;
                        break;
                    }
                }
                else
                    map1.put(ch1, ch2);
                if(map2.containsKey(ch2))
                {
                    if(!(map2.get(ch2).equals(ch1)))
                    {
                        check = false;
                        break;
                    }
                }
                else
                {
                    map2.put(ch2, ch1);
                }
            }
            if(check)
                list.add(words[i]);
        }
        return list;
    }
}
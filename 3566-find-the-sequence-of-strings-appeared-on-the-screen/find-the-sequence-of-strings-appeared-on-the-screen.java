class Solution {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < target.length(); i++)
        {
            sb.append("a");
            while(!(target.startsWith(sb.toString())))
            {
                list.add(sb.toString());
                sb.setCharAt(sb.length() - 1, (char)(sb.charAt(sb.length() - 1) + 1));
            }
            list.add(sb.toString());
        }
        return list;
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> a = new HashMap();
        Map<Character, Character> b = new HashMap();
        if(s.length() != t.length()) return false;
        for(int i =0; i<s.length(); i++){
            if(a.containsKey(s.charAt(i))){
                if(!a.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            }else{
                a.put(s.charAt(i),t.charAt(i));
            }
            if(b.containsKey(t.charAt(i))){
                if(! b.get(t.charAt(i)).equals(s.charAt(i)))
                    return false;
            }else{
                b.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
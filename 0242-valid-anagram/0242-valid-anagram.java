class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char v[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(v);
       return (Arrays.equals(a,v));
        
        
    }
}
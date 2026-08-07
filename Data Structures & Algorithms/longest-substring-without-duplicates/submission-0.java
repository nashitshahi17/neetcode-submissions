class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int low = 0;
        int res = 0;
        for(int high = 0;high<s.length();high++){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            int k = high-low+1;
            while(map.size()<k){
                char ch = s.charAt(low);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
                low++;
                k = high-low+1;
            }
            if(map.size()==k){
                int len = high-low+1;
                res = Math.max(res,len);
            }
        }
        return res;
    }
}

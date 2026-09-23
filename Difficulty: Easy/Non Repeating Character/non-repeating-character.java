class Solution {
    public char nonRepeatingChar(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        //calculate the frequencey of the stirng  
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(map.get(ch)==1){
                return ch;
            }
        }
        return '$';
        
    }
}

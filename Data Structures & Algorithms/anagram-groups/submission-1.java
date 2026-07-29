class Solution {
    public String keymake(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String re=new String(ch);
        return re;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            String key=keymake(st);
            if(map.containsKey(key)){
                map.get(key).add(st);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(st);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}

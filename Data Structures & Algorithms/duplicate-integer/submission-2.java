class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
      }  
      for(int x:nums){
        if(map.get(x) > 1){
            return true;
        }
      }
      return false;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      for(int x:nums){
        set.add(x);
      } 
      int  max = 0; 
      for(int num:set){
        if(!set.contains(num -1)){
            int count = 1;
            int curr = num;
        while(set.contains(curr + 1)){
            count++;
            curr++;
        }
        max = Math.max(max , count);
      }
      }
      return max;
    }
}

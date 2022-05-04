//With Modification
class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        // List<Integer> lst = new ArrayList<Integer>();
        int i = 0;
    while(i<nums.length){
      if((nums[i] == i + 1)||(nums[i]==nums[nums[i]-1])){
        i++;
        continue;
      }
      int temp = nums[i];
      nums[i] = nums[temp-1];
      nums[temp-1] = temp;
    }
        return nums[nums.length-1];
        
    }
}

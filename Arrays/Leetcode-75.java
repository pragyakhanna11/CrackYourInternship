//Dutch National Flag

class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if (nums[m] == 0){
                swap(nums, l, m);
                l++;
                m++;
            }
            else if(nums[m]==2){
                swap(nums, h, m);
                h--;
            }
            else{
                m++;
            }
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

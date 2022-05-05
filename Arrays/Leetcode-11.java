class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int max_water = 0;
        int curr = 0;
        while(left<=right){
            curr = (right-left)*(Math.min(height[left], height[right]));
            if (height[left]<height[right]) left++;
            else if(height[left]>height[right]) right--;
            else{
                left++;
                right--;
            }
            if (max_water<curr){
                max_water = curr;
            }
        }
        return max_water;
    }
}

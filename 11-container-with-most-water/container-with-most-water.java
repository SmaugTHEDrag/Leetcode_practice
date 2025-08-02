class Solution {
    public int minHeight(int left, int right){
        return ((left<right)?left:right);
    }
    
    public int maxArea(int area, int max_area){
        return ((area>max_area)?area:max_area);
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_area = 0;
        while(left<right){
            int h = minHeight(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            max_area = maxArea(area, max_area);
            
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}
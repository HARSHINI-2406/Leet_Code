class Solution { 
    public int maxArea(int[] height) { 
        int l=0;
        int r=height.length-1;
        int max_area = 0;
        while(l<r){
            int area = Math.min(height[l],height[r])*(r-l);
            max_area=Math.max(max_area,area);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return max_area;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[]nums=new int[m+n];
        for(int i=0;i<m;i++){
            nums[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            nums[m+j]=nums2[j];
        }
        Arrays.sort(nums);
        int a=nums.length;
        if(a%2 !=0) return nums[a/2];
        else return (nums[a/2 - 1]+nums[a/2])/2.0 ;
    }
}
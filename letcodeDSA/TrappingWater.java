/* Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9                                    */

import java.util.*;
public class TrappingWater{
    public static int trap(int[] height) {
        int leftmax=0, rightmax=0, ans=0;
        int left = 0;
        int right = height.length-1;
        if(height.length <= 2){
            return 0;
        }
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] < leftmax){
                    ans += (leftmax - height[left]);
                }else{
                    leftmax = height[left];
                }
                left += 1;
            }else{
                if(height[right] < rightmax){
                    ans += (rightmax - height[right]);
                }else{
                    rightmax = height[right];
                }
                right -= 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
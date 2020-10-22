/*
Leetcode 0075

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

 */

import java.util.*;
class Solution {
    public void sortColors(int[] array) 
    {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0,0);
		map.put(1,0);
		map.put(2,0);
		
		for(int i=0; i<array.length; i++)
		{
			int number = array[i];
			int count = map.get(number);
			count++;
			map.replace(number, count);
		}
		
		//Sort array
		int i = 0, arrayIndex = 0;
		int count = map.get(0);
		for(i=0; i<count; i++)
		{
			array[arrayIndex] = 0;
			arrayIndex++;
		}
		count = map.get(1);
		for(i=0; i<count; i++)
		{
			array[arrayIndex] = 1;
			arrayIndex++;
		}
		count = map.get(2);
		for(i=0; i<count; i++)
		{
			array[arrayIndex] = 2;
			arrayIndex++;
		}
    }
}
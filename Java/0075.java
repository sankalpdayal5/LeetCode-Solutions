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
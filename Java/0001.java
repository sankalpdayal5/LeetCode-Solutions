public int[] twoSum(int[] numbers, int target) {
HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
int[] result = new int[2];

for (int i = 0; i < numbers.length; i++) {
	if (map.containsKey(numbers[i])) {
		int index = map.get(numbers[i]);
		result[0] = index ;
		result[1] = i;
		break;
	} else {
		map.put(target - numbers[i], i);
	}
}
return result;


}

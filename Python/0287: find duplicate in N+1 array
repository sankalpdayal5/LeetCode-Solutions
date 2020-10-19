//Python 3 program to find a duplicate 
// element in an array with values in 
// range from 0 to n-1. 

// function to find one duplicate 
def findduplicate(arr, n): 

	// return -1 because in these cases 
	// there can not be any repeated element 
	if (n <= 1): 
		return -1

	// initialize fast and slow 
	slow = arr[0] 
	fast = arr[arr[0]] 

	//loop to enter in the cycle 
	while (fast != slow) : 

		// move one step for slow 
		slow = arr[slow] 

		// move two step for fast 
		fast = arr[arr[fast]] 

	// loop to find entry point of the cycle 
	fast = 0
	while (slow != fast): 
		slow = arr[slow] 
		fast = arr[fast] 
	return slow 

// Driver Code 
if __name__ == "__main__": 
	
	arr = [1, 2, 3, 4, 5, 6, 3 ] 
	n = len(arr) 
	print(findduplicate(arr, n)) 

 

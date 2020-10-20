# LeetCode Solutions

Find video link at my [YouTube channel](https://www.youtube.com/playlist?list=PLsowTcGqVtPgo0VSIUIbcOgNQJzblGnst)  <br>
Or from the Sheet 1 of this [Google Sheet](https://bit.ly/2EUhwnw)

Languages Used - Java and Python3


| #    | Title                        | Solution    | Code            | Time | Space | Difficulty | Tags         | Video    |
|------|------------------------------|-------------|-----------------|------|-------|------------|--------------|----------|
| 0027 | [Remove Element](https://leetcode.com/problems/remove-element/)   | Two pointers for counting valid nos and swapping       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0027.java)   [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0027.py)         | O(n) | O(1)  | Easy       | Array Two Pointers |    [📺](https://www.youtube.com/watch?v=r9HcLcYJBNc)    |
| 0053 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)   | Parse array and save the best solution at each step       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0053.java)         | O(n) | O(1)  | Easy       | Array Dynamic Programming |        |
| 0055 | [Jump Game](https://leetcode.com/problems/jump-game/)                    | Iterate from last index and check if we can reach there from current index or not       | [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0055.py)            | O(n) | O(1)  | Medium       | Array Greedy |    [📺](https://www.youtube.com/watch?v=ymET7SJsDQc)    |
| 0100 | [Same Tree](https://leetcode.com/problems/same-tree/)                    | Check isSame(node.left) and isSame(root.right)       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0100.java)            | O(n) | O(h)  | Easy       | Tree Depth-first-Search |    [📺](https://www.youtube.com/watch?v=ctzwuAP0iHg)    |
| 0101 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)                    | Check if left.left==right.right and left.right==right.left        | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0101.java)            | O(n) | O(h)  | Easy       | Tree Depth-first-Search Breadth-first-Search |          [📺](https://www.youtube.com/watch?v=CgFsYbtRgQU)    |
| 0104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Depth = 1 + Max(depth of left, depth of right)        | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0104.java)  | O(n) | O(h)  | Easy       | Tree Depth-first-Search |   [📺](https://www.youtube.com/watch?v=33YXh6wRVs4)    |
| 0121 | [Best time to buy and sell stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)                    | Minimize Cost price and Maximise Profit       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0121.java)            | O(n) | O(1)  | Easy       | Array Dynamic Programming |       [📺](https://www.youtube.com/watch?v=uc6gP5pZZ6I)    |
| 0198 | [House Robber](https://leetcode.com/problems/house-robber/)                   |Keep storing in top down fashion.The max value in last row will be the answer | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0198.cpp)            | O(n2) | O(n2)  | Easy | Dynamic Programming|
| 0268 | [Missing Number](https://leetcode.com/problems/missing-number/)                    | Assuming that XOR is a constant-time operation, this algorithm does constant work on nn iterations, so the runtime is overall linear       | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0268.java)            | O(n) | O(1)  | Easy       | Array Math BitManipulation |         |
| 0283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/)                    | Two pointers for counting valid nos and swapping       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0283.java)            | O(n) | O(1)  | Easy       | Array Two Pointers |       [📺](https://www.youtube.com/watch?v=LTUm7RYsU_U)    |
| 0287 | [Find duplicate in array of N+1 numbers](https://leetcode.com/problems/find-the-duplicate-number/) | Find the cycle using slow and fast pointer | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0287.java)     | O(n) | O(1)  | Medium     | Array Two Pointers         |          |
| 0451 | [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) | [LeetCode](https://leetcode.com/problems/sort-characters-by-frequency/discuss/381436/fastest-python-on-solution-explained-in-details) [Github](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Sort%20Characters%20by%20Frequency/Solution.md) | Java Python     | O(n) | O(n)  | Medium     | Hash Table Heap         |          |
| 0509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | Storing the value of two previous number and updating them | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0509.java) | O(n) | O(1) | Easy | Array | [📺](https://www.youtube.com/watch?v=bsaXukgCCdA) |
| 0647 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | Extend from center, 2 function call for odd and even palindromes | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0647.java)     | O(n^2) | O(1)  | Medium     | String Dynamic Programming         | [📺](https://www.youtube.com/watch?v=ze1woFTZMpA)    |
| 0695 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) | Apply DFS on the Gird by exploring every square connected to it 4-directionally, total number of squares explored will be the area of that connected shape. | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0695.cpp)     | O(R∗C) | O(R∗C)  | Medium     | Depth-First-Search         |    |
| 1347 | [Minimum Number of Steps to Make Two Strings Anagram](https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/) | Add 1 for char in s and remove 1 for char in t | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/1347.java)      | O(n+m) | O(1)  | Medium     | Hash Table Heap         | [📺](https://www.youtube.com/watch?v=xXXOpOYWtRE)    |
| 1352 | [Product of the Last K Numbers](https://leetcode.com/problems/product-of-the-last-k-numbers/) | Add new element to list by multiplying it with previous number and return arr[n-1]/arr[n-k-1] | [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/1352.py)      | O(1) | O(1)  | Medium     | Array Design         | [📺](https://www.youtube.com/watch?v=8CuVduv0Kyg)    |


Format
| 0000 | [Ques name]()                    | Algo       | [Java]()            | O() | O()  | Easy       | Category |    [📺]()    |
|------|----------------------------------|------------|---------------------|-----|------|------------|----------|---------------|
| 0000 | [Ques name]()                    | Algo       | [Java]()            | O() | O()  | Easy       | Category |    [📺]()    |

[![Made with Python](https://forthebadge.com/images/badges/made-with-python.svg)](https://github.com/sankalpdayal5/LeetCode-Solutions/) 
[![Made with Java](https://forthebadge.com/images/badges/made-with-java.svg)](https://github.com/sankalpdayal5/LeetCode-Solutions/) 
[![Made with C++](https://forthebadge.com/images/badges/made-with-c-plus-plus.svg)](https://github.com/sankalpdayal5/LeetCode-Solutions/) 

[![Built with love](https://forthebadge.com/images/badges/built-with-love.svg)](https://github.com/sankalpdayal5/LeetCode-Solutions/)
 

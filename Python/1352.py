# Program to find product of the last k numbers.
class ProductOfNumbers:

    def __init__(self):
        self.nums = [1]

    def add(self, num: int) -> None:
        if num > 0:
            self.nums.append(num*(self.nums[len(self.nums)-1]))
        else:
            self.nums = [1]

    def getProduct(self, k: int) -> int:
        if k >= len(self.nums):
            return 0
        return self.nums[-1]//self.nums[-k-1]

class Solution:
    def setZeroes(self, A: List[List[int]]) -> None:
        rows = set()
        cols = set()
        for i in range(len(A)):
            for j in range(len(A[0])):
                if A[i][j]==0:
                    rows.add(i)
                    cols.add(j)
        for i in rows:
            for j in range(len(A[0])):
                A[i][j] = 0
        for j in cols:
            for i in range(len(A)):
                A[i][j] = 0
        return A

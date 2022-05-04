class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        lst = []
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j]==0:
                    lst.append([i,j])
        for p in lst:
            i,j = p
            for q in range(len(matrix[0])):
                matrix[i][q] = 0
            for r in range(len(matrix)):
                matrix[r][j] = 0
        return 

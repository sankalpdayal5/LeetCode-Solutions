#Count Negative Numbers in a Column-Wise and Row-Wise Sorted Matrix

int countNegative(int M[][4], int n, int m) 
{ 
    int count = 0; 
  
    // Follow the path shown using 
    // arrows above 
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < m; j++) { 
            if (M[i][j] < 0) 
                count += 1; 
  
            // no more negative numbers 
            // in this row 
            else
                break; 
        } 
    } 
    return count; 
} 
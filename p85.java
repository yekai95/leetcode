package first;
import java.util.Stack;
public class p85 {
public int maximalRectangle(char[][] matrix) {
	int len1 = matrix.length;
    if( len1 == 0)
        return 0;
    int len2 = matrix[0].length;
    if( len2 == 0)
        return 0;
    int result = 0;
    int[][] heights = new int[len1][len2];
    for( int i = 0;i<len2;i++){
        if( matrix[0][i] == '1')
            heights[0][i] = 1;
    }
    for( int i = 1;i < len1;i++){
        for( int j = 0;j<len2;j++){
            if( matrix[i][j] == '1')
                heights[i][j] = heights[i-1][j]+1;
        }
    }
    for( int i = 0;i<len1;i++){
        result = Math.max(result,largestRectangleArea(heights[i]));
    }
    return result;
}

public int largestRectangleArea(int[] heights) {
    int area = 0;
    for (int i = 0; i < heights.length; i++) {
      for (int k = i + 1; k < heights.length; k++) {
        if (heights[k] < heights[k - 1]) {
          i = k - 1;
          break;
        } else {
          i = k;
        }
      }
      int lowest = heights[i];
      for (int j = i; j >= 0; j--) {
        if (heights[j] < lowest) {
          lowest = heights[j];
        }
        int currArea = (i - j + 1) * lowest;
        if (currArea > area) {
          area = currArea;
        }
      }
    }
    return area;
  }
}

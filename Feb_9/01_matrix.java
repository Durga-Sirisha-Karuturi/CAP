class Solution {
  public int[][] updateMatrix(int[][] mat) {
    int rows= mat.length;
    int cols= mat[0].length;
    int[][] dirs = {{-1,0},{0,-1},{0,1},{1,0}};
    Queue<int[]> queue = new LinkedList<>();

    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        if (mat[i][j] == 0)
          queue.add(new int[] {i, j});
        else
          mat[i][j] = Integer.MAX_VALUE;

    while (!queue.isEmpty()) {
      int[]  cur=queue.poll();
      for(int[] dir:dirs) {
        final int x = cur[0] + dir[0];
        final int y = cur[1] + dir[1];
        if (x < 0 || x >=rows || y < 0 || y >=cols || mat[x][y] <= mat[cur[0]][cur[1]] + 1)
          continue;
        queue.add(new int[] {x, y});
        mat[x][y] = mat[cur[0]][cur[1]] + 1;
      }
    }

    return mat;
  }
}

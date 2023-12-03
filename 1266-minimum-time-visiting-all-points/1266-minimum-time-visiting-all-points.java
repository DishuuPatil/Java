class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
     
        int totalTime = 0;
        
        for (int i = 1; i < points.length; i++) {
            int x1 = points[i - 1][0];
            int y1 = points[i - 1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];
            
            int horizontalDistance = Math.abs(x2 - x1);
            int verticalDistance = Math.abs(y2 - y1);
            int diagonalDistance = Math.min(horizontalDistance, verticalDistance);
            
            totalTime += diagonalDistance;
            
            totalTime += Math.abs(horizontalDistance - diagonalDistance) + Math.abs(verticalDistance - diagonalDistance);
        }
        
        return totalTime;
    }
}
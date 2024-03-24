import java.util.Arrays;

public class MedianMatrix {
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3},
                            {4,5,6},
                        {7,8,9}};
        int r = matrix.length;
        int c = matrix[0].length;
        int min = matrix[0][0];
        int max = matrix[0][c-1];
        for(int i=0; i<r; i++){
            // finding the minimum element
            if(matrix[i][0]<min){
                min=matrix[i][0];
            }

            // finding the maximum element
            if(matrix[i][c-1]>max){
                max=matrix[i][c-1];
            }
        }
            int desired = (r*c+1)/2;
            while(min<max){
                int mid = (min+max)/2;
                int midPos = 0;
                for(int i=0; i<r; i++){
                    int pos = Arrays.binarySearch(matrix[i], mid)+1;
                    midPos += Math.abs(pos);
                }
                if(midPos<desired){
                    min = mid+1;
                }else{
                    max = mid;
                }
            }
            System.out.println("median = "+min);
        }
    }


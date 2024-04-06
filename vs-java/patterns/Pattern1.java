package patterns;
public class Pattern1{
    public static void main(String[] args) {
        pattern1(4);
    }
    public static void pattern1(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int left = j;
                int top = i;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;
                int val = n-Math.min(Math.min(left,right),Math.min(top,bottom));
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
/* 
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/
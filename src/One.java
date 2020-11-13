import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt(), m=in.nextInt();
        int a[][] = new int[n+1][m+1];
        int i,j;
        for(i=0; i<n; i++) {
            for (j = 0; j < m; j++)
                a[i][j] = in.nextInt();
        }
        System.out.print(m + " " + n);
        System.out.println("");
        int b[][]= new int [m+1][n+1];
        for(i=0; i<m; i++) {
            for (j = n-1; j > -1; j--) {
                if (j > 1) System.out.print(a[j][i]+" ");
                else System.out.print(a[j][i]+" ");
            }
            System.out.println("");

        }
    }
}

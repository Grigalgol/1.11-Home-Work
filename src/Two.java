import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i,j;
        int a[][] = new int[n][n];
        for(i=0; i<n; i++) {
            for(j=0; j<n; j++)
                if(i==n-j-1) a[i][j]=1;
                else if(i<n-j-1) a[i][j]=0;
                else a[i][j]=2;
        }
        for(i=0; i<n; i++) {
            for (j = 0; j < n; j++) System.out.print(a[i][j]+ " ");
            System.out.println();
        }
    }
}

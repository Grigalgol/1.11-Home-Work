import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int a[][] = new int[n][m];
        int i,j,k;
        int p=0;
        for(i=0; i<n; i++) {
            if(i%2==0) {
                for(j=0; j<m; j++) {
                    a[i][j]=p;
                    p++;
                }
            }
            else {
                for(k=0; k<m; k++) {
                    a[i][m-k-1]=p;
                    p++;
                }
            }
        }
        for(i=0; i<n; i++) {
            for(j=0; j<m; j++) {
                if(a[i][j]>=10 && a[i][j]<=99) System.out.print(" " + a[i][j]);
                else if(a[i][j]>=100 && a[i][j]<=999) System.out.print("" + a[i][j]);
                else System.out.print("  " + a[i][j]);
            }
            System.out.println("");
        }
    }
}
import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int i=0;
        int p;
        int j=0;
        int a[][] = new int[n][m];
        for (p = 0; p < m*n; p++) {
            a[i][j]=i*j;
            if(a[i][j]>=10 && a[i][j]<=99) System.out.print("  " + i*j);
            else if(a[i][j]>=100 && a[i][j]<=999) System.out.print(" " + i*j);
            else if(a[i][j]>=1000 && a[i][j]<=9999) System.out.print("" + i*j);
            else System.out.print("   " + i*j);
            j++;
            if(j>=m){
                System.out.println("");
                j=0;
                i++;
            }
        }
    }
}

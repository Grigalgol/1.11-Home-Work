import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int n, i, j, min_i, max_i, min_j, max_j, d = 0;
        int[][] m;
        n=in.nextInt();
        n=2*n+1;
        i=n/2;
        j=n/2;
        min_i=i;
        max_i=i;
        min_j=j;
        max_j=j;
        m=new int[n][n];
        for (int a = 0; a < n * n; a++) {
            m[i][j] = a;
            switch (d) {
                case 0:
                    i -= 1;
                    if (i < min_i) {
                        d = 1;
                        min_i = i;
                    }
                    break;
                case 1:
                    j -= 1;
                    if (j < min_j) {
                        d = 2;
                        min_j = j;
                    }
                    break;
                case 2:
                    i += 1;
                    if (i > max_i) {
                        d = 3;
                        max_i = i;
                    }
                    break;
                case 3:
                    j += 1;
                    if (j > max_j) {
                        d = 0;
                        max_j = j;
                    }
            }
        }
        for (int k = 0; k < n; k++) {
            for (int v = 0; v < n; v++)
                System.out.printf("%3d",m[k][v]);
            System.out.println();
        }
    }
}
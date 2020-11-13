import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i,j;
        int a[][] = new int[n][n];
        for(i=0; i<n; i++) {
            for(j=0; j<n; j++)
               a[i][j]=in.nextInt();
        }
        int flag=0;
        for(i=0; i<n; i++) {
            for (j = 0; j < n; j++)
                if (a[i][j] != a[j][i]) {
                    System.out.println("no");
                    flag++;
                    break;
                }
            if(flag!=0) break;
        }
        if(flag==0) System.out.println("yes");
    }
}
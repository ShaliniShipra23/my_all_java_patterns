package Pattern;
import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int No_of_rows=scn.nextInt();
    scn.close();
    int nst=1;
    int nsp=No_of_rows-1;
    // /t = tab= 5 spaces
    for(int i=1;i<=No_of_rows;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            nsp--;
            for(int k=nst;k>=1;k--)
            {
                System.out.print("*");
            }
            nst++;
            System.out.println();
        }
        
    }
}

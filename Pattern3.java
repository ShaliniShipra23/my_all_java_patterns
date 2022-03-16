package Pattern;
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int No_of_rows=scn.nextInt();
    scn.close();
    int nst=No_of_rows;
    for(int i=1;i<=No_of_rows;i++)
        {
            for(int j=nst;j>=1;j--)
            {
                System.out.print("* ");
            }
            nst--;
            System.out.println();
        }
    }
}

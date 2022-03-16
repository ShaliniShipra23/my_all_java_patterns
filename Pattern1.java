package Pattern;
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int No_of_rows=scn.nextInt();
        scn.close();
        int nst=No_of_rows;
        //loop for rows
        for(int i=1;i<=No_of_rows;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
}

}

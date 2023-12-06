/*
    Row = 6
    Col = 6


    $   $   $   $   $   $
    $   *   *   *   *   $
    $   *   *   *   *   $
    $   *   *   *   *   $             
    $   *   *   *   *   $             
    $   $   $   $   $   $

*/

import java.lang.*;
import java.util.*;

class Pattern
{
   public int iCol;
   public int iRow;

   public Pattern(int r, int c)
   {
    iRow = r;
    iCol =c;
   }

   public DisplayPattern()
   {
    int i =0;
    int j =0;

    for(i = 1; i< iRow; i++)
    {
        for(j =1; j<iCol; j++)
        {
            if((i ==1)||(iRow ==i)||(j ==1)||(iCol==j))
        }
        System.out.print("\n");
    }
   }
}

class Program118
{
    public static void main(String arg[])
    {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows : ");
        iValue1 = Sobj.nextInt();

        System.out.println("Enter the number of Columns : ");
        iValue2 = Sobj.nextInt();
        
    }
}

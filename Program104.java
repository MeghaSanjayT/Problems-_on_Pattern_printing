/*
    Row = 4
    Col = 4

    *   *   *   *
    #   #   #   #
    *   *   *   *
    #   #   #   #

*/

import java.lang.*;
import java.util.*;

class Pattern 
{
    public int iRow;
    public int iCol;

    public Pattern(int r, int c)
    {
        iRow = r;
        iCol = c;
    }

    public void DisplayPattern()
    {
        int i= 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print("#\t");
                }
                else
                {
                  System.out.print("*\t");
   
                }
            }
            System.out.print("\n");
        }
    }
}

class Program104
{
    public static void main(String abhdj[])
    {
        int iValue1 = 0;
        int iValue2 = 0;
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows : ");
        iValue1 = Sobj.nextInt();
       
        System.out.println("Enter the number of Columns : ");
        iValue2 = Sobj.nextInt();

        Pattern pobj = new Pattern(iValue1, iValue2);
        pobj.DisplayPattern();

    }
}
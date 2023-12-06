// 4
// *    *   *   *  

import java.lang.*;
import java.util.*;

class Pattern
{
    public int iNo;

    public Pattern(int i)
    {
        iNo = i;
    }

    public void DisplayPattern()
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        int iCnt = 0;
        for(iCnt =1; iCnt<iNo; iCnt++)
        {
            System.out.print("*\t");
        }
        System.out.print("\n");
    }
}

class Program89
{
    public static void main(String srg[])
    {
        int iValue = 0;

        System.out.println("Enter the number : ");
        Scanner Sobj = new Scanner(System.in);

        iValue = Sobj.nextInt();
        Pattern pobj =new Pattern(iValue);

        pobj.DisplayPattern();

    }
}
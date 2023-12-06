// 4
// 4    3   2   1   

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
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = iNo; iCnt >=1;iCnt--)
        {
            System.out.print(iCnt+"\t");
        }
        System.out.print("\n");
    }
}


class Program91
{
    public static void main(String srg[])
    {
        int iValue =0;
        System.out.println("Enter the Number : ");
        Scanner Sobj = new Scanner(System.in);

        iValue =Sobj.nextInt();

        Pattern pobj = new Pattern(iValue);

        pobj.DisplayPattern();

    }
}
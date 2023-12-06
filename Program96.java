// 4
// A    B   C   D   

// ASCII
// American Standard Code for Information Interchange

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
        char ch ='A';
         if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt =1; iCnt<=iNo; iCnt++)
        {
            System.out.print(ch +"\t");
            ch++;
        }
        System.out.print("\n");
    }
}


class Program96

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
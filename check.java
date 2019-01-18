import java.util.*;
class check
{
  public static void main(String [] args)
  {
  Scanner kb = new Scanner(System.in);
  int m,n;
  System.out.println("Enter the number of rows and colomns");
  m=kb.nextInt();
  n=kb.nextInt();
  int a[][]= new int[m][n];
  System.out.println("Please enter the sorted matrix");
   for(int i=0;i<m;i++)
   {
     for(int j=0;j<n;j++)
     {
       a[i][j]=kb.nextInt();
     }
   }
   System.out.println("Enter the number you want to search");
   int num=kb.nextInt();
   int flag=0;
   for(int i=0;i<m;i++)
   {
     for(int j=0;j<n;j++)
     {
       if(a[i][j]==num)
       {
         flag=1;
         break;
       }
     }
   }
   if (flag==1)
   {
     System.out.println("Element is present");
   }
   else
   {
     System.out.println("Element is not present");
   }

}
}

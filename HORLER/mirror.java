import java.util.*;
class mirror
{    int A[][] = new int[20][20];
        int n=0;
     void input()
    {Scanner kb = new Scanner(System.in);
     
        System.out.println("ENTER THE NUMBER OF N");
       
        n=kb.nextInt();
         System.out.println("ENTER THE MATRIX OF ORDER "+ n+"*"+n);
         for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 A[i][j] = kb .nextInt();
                }
            }
             for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                System.out.print("["+ A[i][j] +"]");
                } System.out.println();
            }
        }void mdisplay(){
            System.out.println("After mirror ----");
            for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {if(j<=(n/2)){int tmp = A[i][j];
                 A[i][j] = A[i][n-j-1];
                 A[i][n-j-1] = tmp;}
                System.out.print("["+ A[i][j] +"]");
                } System.out.println();
            }
        }public static void main(String[]args){
            mirror sh = new mirror();
            sh.input();
            sh.mdisplay();
    }}

import java.util.*;
class Symmetry
{    int A[][] = new int[20][20];
        int n=0;
        int sum = 0;
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
            }System.out.println("The Input is --> ");
             for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                System.out.print("["+ A[i][j] +"]");
                } System.out.println();
            }
        }void sdisplay(){
            System.out.println("After Symmetry -->");
            int p = A[0][0];
            for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {if(j>=i){
                 A[i][j] = A[j][i] = p;
                  p = p +1;
                }if(i == j){
                     sum = sum + A[i][j];
                    }
                System.out.print("["+ A[i][j] +"]");
                } System.out.println();}
            System.out.println("The sum of main diagonal is = " + sum);
        }public static void main(String[]args){
           Symmetry sh = new Symmetry();
            sh.input();
            sh.sdisplay();
    }}

 import java.util.*;
class boundary
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

                 A[i][j] = kb.nextInt();
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
            System.out.println("After boundary ----");
            for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {if(i==0||i==(n-1)){
                System.out.print("["+ A[i][j] +"]");
                }else if(j==0||j==(n-1)){
                    System.out.print("["+A[i][j]+"]");}
                    else{
                        System.out.print("[ ]");
                    }
                }System.out.println();
                
            }
        }public static void main(String[]args){
            boundary sh = new boundary();
            sh.input();
            sh.mdisplay();
    }}

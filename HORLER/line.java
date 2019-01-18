import java.util.*;
class line
{    int A[][] = new int[200][200];
        int n=0;
        int sum = 0;
         int p ;
        void input()
    {Scanner kb = new Scanner(System.in);
     
        System.out.println("ENTER THE NUMBER OF N");
       
        n=kb.nextInt();
    
          
        }void sdisplay(){
            System.out.println("After Symmetry -->");
           p =1;
            while(p<((n*2))){
            for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {if((i+j) == (p-1)){
                 A[i][j] =  p; }        
                } }p = p+1;}
                
                 for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++){
            if(i == j){
                     sum = sum + A[i][j];
                    }
                System.out.print("["+ A[i][j] +"]");
                } System.out.println();}
            System.out.println("The sum of main diagonal is = " + sum);
        }public static void main(String[]args){
           line sh = new line();
            sh.input();
            sh.sdisplay();
    }}

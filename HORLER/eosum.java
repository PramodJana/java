import java.util.*;
class eosum
{    int A[][] = new int[20][20];
        int n=0,a =0,b=0;
        int c;
        int sum ,esum,osum;
        int E[] = new int[100];
        int O[] = new int[100];
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
            } System.out.println("The Input is ---");
             for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                System.out.print("["+ A[i][j] +"]");
                } System.out.println();
            }
        }void sum(){sum = esum = osum =0;
           
            for (int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++){
                 sum = sum +A[i][j];
                 
                 if(A[i][j] % 2 == 0){
                     E[a++] = A[i][j];
                 esum = esum + A[i][j];}
                 else {O[b++] = A[i][j];
                     osum = osum + A[i][j];}
                     
                }} System.out.println("the sum of all element = "+ sum);
            System.out.print("the sum of even number = ");
            
            
            for( c = 0 ; c<a;c++){
            System.out.print(E[c] );
            if(c!= (a-1)){
            System.out.print("+");}
            if(c == (a-1)){
                System.out.print(" = " +esum);}}
            System.out.println();
            System.out.print("the sum of odd number = ");
            for(int c = 0 ; c<b;c++){
            System.out.print(O[c] );
            if(c!= (b-1))
            System.out.print("+");}
            if(c==(b-1)){
                System.out.print(" = " +osum);
            }}public static void main(String[]args){
           eosum sh = new eosum();
            sh.input();
            sh.sum();
    }}

import java.util.*;   
public class pramod  //class declaration 
{  int A[][] =new int[20][20];
    int M=0, N=0;
      int minr=0 ,minc=0;
        int maxr=0 ,maxc=0;
    void input() //method to accept the values of matrix a[][];
    {
        Scanner kb = new Scanner(System.in); // creating scanner class object
        System.out.println("ENTER THE NUMBER OF ROWS AND COLOMNS");  //promptingtheuserto input the numbers of rows and columns;
        int M= kb.nextInt();
        int N = kb.nextInt();
        System.out.println("ENTER THE MARIX OF ORDER " +M+"*"+N);
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                A[i][j]= kb.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX ");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                 System.out.print(A[i][j]);
            }
             System.out.println("");
        }
        int large =A[0][0];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                int p= A[i][j];
                if (p>large)
                   {
                 large = p;
                  maxr =i;
                 maxc=j;
                                }
                            }
                        }
                    System.out.println("LARGEST NUMBER :" +large);
                 System.out.println("ROW ="+maxr);
                  System.out.println("COLUMN="+maxc);
                  int small =A[0][0];
                        for(int i=0;i<M;i++)
        {
                        for(int j=0;j<N;j++)
            {
                        int p= A[i][j];
                             
                               if (p<small)
                               {
                                   small = p;
                                   minr =i;
                                   minc=j;
                                }
                            }
                        
                    }
                
                System.out.println("SMALLEST NUMBER :" +small);
                 System.out.println("ROW ="+minr);
                  System.out.println("COLUMN="+minc);
                  
                        for(int i=0;i<M;i++)
        {
                            for(int j=0;j<N;j++)
            {
                                   int p= A[i][j];
                                   for(int k=0;k<M;k++)
                      {
                                     for(int l=0;l<N;l++)
                             {
                                        int q= A[k][l];
                                     if (p>q)
                               {
                                   int temp =A[i][j];
                                   A[i][j] = A[k][l];
                                   A[k][l] = temp;
                                }
                            }
                        }
                    }
                }
                System.out.println("REARRANGED MATRIX");
                 for(int i=0;i<M;i++)
        {
                            for(int j=0;j<N;j++)
            {
                              System.out.print( A[i][j]);
                            }
                            System.out.println("");
                        }
    }
    
          
           
                    public static void main (String[]args)
                    {
                        pramod p = new pramod();
                        p.input();
                        
                    }
                }
                
               


import java.util.*;
class combine
{
    Scanner kb =new Scanner(System.in);
    int com[] =new int[1000];
    int size,k=0;
    combine(int nn)
    {
        size=nn;
    }
    void inputarray()
    {
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<size;i++)
        {
            com[i]=kb.nextInt();
        }
    }
    void mix(combine A ,combine B)
    {
        for(int i=0;i<size;i++)
        {
            com[k++]=A.com[i];
        }
        for(int j=0;j<size;j++)
        {
            com[k++]=B.com[j];
        }
    }
void sort()
{
    for(int i=0;i<(size+size);i++)
    {
        for(int j=0;j<(size+size);j++)
        {
            if(com[i]>com[j])
            {
                int temp=com[i];
                com[i]=com[j];
                com[j]=temp;
            }
        }
    }
}
void display()
{
    for(int i=0;i<(size+size);i++)
    {
        System.out.println(com[i] + " ");
    }
}
public static void main()
{   Scanner fb =new Scanner(System.in);
    System.out.println("ENTER THE SIZE");
    int z=fb.nextInt();
    combine A=new combine(z);
    A.inputarray();
    combine B=new combine(z);
    B.inputarray();
    combine C=new combine( z);
    C.mix(A,B);
    C.sort();
    C.display();
}
}

    
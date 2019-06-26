class A
{
    int m,n;
    void display1()
    {
        System.out.println("The values of m and n in class A are "+ m+ " "+n);
    }
}

class B extends A
{
    int c;
    void display2()
    {
        System.out.println("The value of c in class B is "+ c);
    }
    
    void sum()
    {
        System.out.println("m+n+c= "+(m+n+c));
    }
}

public class test1 {
    public static void main(String args[]) {
    A s1=new A();
    B s2=new B();
    s1.m=10;
    s1.n=20;
    System.out.println("State of Object A :");
    s1.display1();
    s2.m=1;
    s2.n=2;
    s2.c=3;
    System.out.println("State of Object B :");
    s2.display1();
    s2.display2();
    s2.sum();
    
    }
}


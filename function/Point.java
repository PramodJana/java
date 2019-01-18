import java.util.*;
class  Point
{
    Scanner kb = new Scanner(System.in);
    double x,y;
    Point()
    {
        x=0.0;
        y=0.0;
    }
    void readpoint()
    {
        System.out.println("ENTER THE CO-ORDINATES");
        System.out.print("X = ");
        x=kb.nextDouble();
        System.out.println(" ");
        System.out.print("Y = ");
        y=kb.nextDouble();
        System.out.println(" ");
    }
    Point midpoint(Point A ,Point B)
    {     System.out.println("<---------------------------------------------------------------------------------------------------------------->");
        System.out.println("OUTPUT :");
        System.out.println("POINT 1 = " +A.x+","+A.y);
        System.out.println("POINT 2 = " +B.x+","+B.y);
        Point d= new Point();
        d.x= (A.x+B.x)/2;
        d.y=(B.y+A.y)/2;
        return d;
    }
    void displaypoint()
    {
      
           System.out.println("MID POINT  = " +x+","+y);
           System.out.println("");
  System.out.println("<---------------------------------------------------------------------------------------------------------------->");
        }
        public static void main()
        {     System.out.println("<----------------------------------------------------------------------------------------------------->");
              System.out.println("INPUT");
            Point A=new Point();
            A.readpoint();
            Point B=new Point();
            B.readpoint();
            Point C=new Point();
           
           C=C.midpoint(A,B);
           C.displaypoint();
        }
    }

            
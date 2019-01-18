public class ParkingLot
{
    int vno =0, hours =0 ;
    double bill = 0.0;
    
    public void input(int v ,int h)
    {
        vno =v;
        hours =h;
        
    }
        
        public void calculate ()
        {
            if (hours == 1)
            {
                bill = 3.0;
            }
            if (hours >=2)
            {
                bill = bill +(hours *1.50);
            }
        }
        
        public void display()
        {
            System.out.println("THE VEHICLE no IS " + vno);
             System.out.println("TOTAL hours VEHICLE STAYS IS " +hours);
              System.out.println("TOTAL BILL IS " + bill);
            }
            
            public static void main(String [] args)
            {
                ParkingLot p = new ParkingLot ();
                p.input(9,87);
                p.calculate();
                p.display();
            }
        }


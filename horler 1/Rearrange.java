import java.util.*;
class Rearrange
{
    Scanner kb = new Scanner(System.in);
    String Txt="",Cxt="";
    int len;
    Rearrange()
    {Txt =" ";
        Cxt=" ";
        len =0;
    }
    void readword()
    {
        System.out.println("ENTER THE STRING IN UPPERCAES");
        Txt = kb.nextLine();
    }
        
    void convert()
    {   boolean flag =false;
        len =Txt.length();
    char w =Txt.charAt(0);
    if((w=='A')||(w=='E')||(w=='I')||(w=='O')||(w=='U'))
    {
        Cxt=Cxt+Txt+"Y";
    }
    else{
    for(int i=1;i<len;i++)
    {
        char ch =Txt.charAt(i);
        if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
        {
            flag=true;
            Cxt=Txt.substring(i,len)+Txt.substring(0,i)+"C";
            break;
        }
    }
    if (flag== false)
    {
        Cxt=Txt+"N";
    }
}
}
void display()
{ System.out.println("ORIGINAL STRING = "+Txt);
    System.out.println("CHANGED STRING ="+Cxt);
}
public static void main()
{
    Rearrange z = new Rearrange();
    z.readword();
    z.convert();
    z.display();
}
}

    
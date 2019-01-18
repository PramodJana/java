import java .util.*;
class Data
{
    protected String Str;
    Data()
    {
        Str = " ";
    }
    void acceptstr()
    {
        Scanner kb = new Scanner (System.in);
        System.out.println("enter the string");
        Str = kb.next();
    }
    void Print()
    {
        System.out.println("THE NAME OF THE STRING IS ="+Str);
    }
}
class Process extends Data
{
    int len;
    void VowelWords()
    {
        int q=0;
        StringTokenizer data = new StringTokenizer(Str);
        int ct= data.countTokens();
        for(int i=0;i<ct ;i++)
        {
            String st = data.nextToken();
            char p = st .charAt(0);
            if((p=='a')||(p=='e')||(p=='i')||(p=='o')||(p=='u')||(p=='A')||(p=='E')||(p=='I')||(p=='O')||(p=='U'))
            {
                System.out.print(st);
                q++;
            }
        }
        System.out.println("NUMBER OF VOWEL WORDS IS = "+ q);
    }
}
class Pramod
{
public static void main(String [] args)
{
    Data w = new Data();
    w.acceptstr();
    w.Print();
    Process e = new Process();
    e.VowelWords();
}
}

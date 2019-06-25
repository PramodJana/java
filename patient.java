import java.io.*;
import java.util.*;
class patient
{
	static String patientName;
	static double height,width;
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Please enter the credentials");
		System.out.print("Your name=");
		patientName=kb.nextLine();
		System.out.print("Height=");
		height=kb.nextDouble();
		System.out.print("Width=");
		width=kb.nextDouble();
		patient pj=new patient();
		System.out.println("The BMI of "+patientName+" is "+pj.computeBMI());
	}
	
	double computeBMI()
	{
		return (width-(height*height));
	}
}

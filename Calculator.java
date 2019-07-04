/*
	Τhis is a simple Calculator made by Andrew Papandreou as a small project so i could relax after my exams 
	If you want to ask me somethink about my code feel free to email me at antreashap@gmail.com
*/

import java.util.Scanner;


class Calculator
{
	public static void main(String[] Args)
	{
		Scanner input = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		int type = 0;


		while(true)
		{
			System.out.println("Choose what would you like to calculate by pressing the right number :" + "\n" + "1.Αddition" +"\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" + "5.Exit");
			type =input.nextInt() ;
			switch(type)
			{
				case 1 :
					System.out.print("Choose the first number :");
					a=input.nextInt();
					System.out.print("Choose the second number :");
					b=input.nextInt();
					c=a + b;
					System.out.println("The result is of " + a + " + " + b + " is equal with : " +c);
					System.out.println("\n" + "--------------------------" + "\n");
					System.out.println("Choose what would you like to calculate by pressing the right number :" + "\n" + "1.Αddition" +"\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" + "5.Exit");
					type =input.nextInt() ;
					if(type==5)
					{
						System.exit(-1);
					}
				case 2 :
					System.out.println("Choose the first number :");
					a=input.nextInt();
					System.out.println("Choose the second number :");
					b=input.nextInt();
					c=a - b;
					System.out.println("The result is of " + a + " - " + b + " is equal with : " +c);
					System.out.println("\n" + "--------------------------" + "\n");
					System.out.println("Choose what would you like to calculate by pressing the right number :" + "\n" + "1.Αddition" +"\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" +"5.Exit");
					type =input.nextInt() ;	
					if(type==5)
					{
						System.exit(-1);
					}			
				case 3 :
					System.out.print("Choose the first number :");
					a=input.nextInt();
					System.out.print("Choose the second number :");
					b=input.nextInt();
					c=a * b;
					System.out.println("The result is of " + a + " * " + b + " is equal with : " +c);
					System.out.println("\n" + "--------------------------" + "\n");
					System.out.println("Choose what would you like to calculate by pressing the right number :" + "\n" + "1.Αddition" +"\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" + "5.Exit");
					type =input.nextInt() ; 	
					if(type==5)
					{
						System.exit(-1);
					}
				case 4 :
					System.out.print("Choose the first number :");
					a=input.nextInt();
					System.out.print("Choose the second number :");
					b=input.nextInt();
					if(b!=0)
					{
						c=a / b;
						System.out.println("The result is of " + a + " / " + b + " is equal with : " +c);
						System.out.println("\n" + "--------------------------" + "\n");
						System.out.println("Choose what would you like to calculate by pressing the right number :" + "\n" + "1.Αddition" +"\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" + "5.Exit");
						type =input.nextInt() ;
					}
					else
					{
						System.err.println("You cant divide with 0 at the denominator");
						System.out.println("\n" + "--------------------------" + "\n");
						System.out.println("Choose what would you like to calculate by pressing the right number :" + "\n" + "1.Αddition" +"\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" + "5.Exit");
						type =input.nextInt() ;
					}
					if(type==5)
					{
						System.exit(-1);
					}
				case 5 :
					System.exit(-1);
				default :
					System.out.println("Choose what would you like to calculate by pressing the right number :" + "\n" + "1.Αddition" +"\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" + "5.Exit");
					type =input.nextInt() ;
			}
		}
	} 
}
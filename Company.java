import java.util.Scanner;
import java.time.*;
class Company 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name :");
		String name = sc.nextLine();

		System.out.println("Enter your date of birth :");
		int date = sc.nextInt();

		System.out.println("Enter your month of birth :");
		int month = sc.nextInt();

		System.out.println("Enter your birth year :");
		int year = sc.nextInt();

		System.out.println("Enter your monthly salary :");
		double m_sal = sc.nextDouble();



	
		// date of birth
        LocalDate pdate = LocalDate.of(year, month , date);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
 
		double a_sal = m_sal * 12 ;
		
		

		System.out.println("Employee name is : "+ name);
		System.out.println("Employee age is :" + diff.getYears());
		System.out.println("Employee's annual salary is : "+ a_sal);
		

	if (a_sal >= 500000.0)
		{
			System.out.println("tax on your annual salary is 20 %");
			double tax_amount = ( a_sal * 20 ) / 100 ;
			System.out.println("your tax amount is:" + tax_amount);
		}
		else if (a_sal >= 400000.0 && a_sal < 500000.0 )
		{
			System.out.println("tax on your annual salary is 15 %");
			double tax_amount = ( a_sal * 15 ) / 100 ;
			System.out.println("your tax amount is:" + tax_amount);
		}
		else if (a_sal >= 300000.0 && a_sal < 400000.0 )
		{
			System.out.println("tax on your annual salary is 10 %");
			double tax_amount = ( a_sal * 10 ) / 100 ;
			System.out.println("your tax amount is:" + tax_amount);
		}
		else if (a_sal >= 200000.0 && a_sal < 300000.0 )
		{
			System.out.println("tax on your annual salary is 5 %");
			double tax_amount = ( a_sal * 5 ) / 100 ;
			System.out.println("your tax amount is:" + tax_amount);
		}
		else if (a_sal >= 200000.0 && a_sal < 300000.0 )
		{
			System.out.println("no tax on your annual salary");
			double tax_amount = a_sal;
			System.out.println("your tax amount is:" + tax_amount);
		}
		
	}
}


//OUTPUT:
/*

E:\Java\Java_Course\Assignment_Day 3>javac Company.java

E:\Java\Java_Course\Assignment_Day 3>java Company
Enter your name :
Pratiksha Choudhari
Enter your date of birth :
25
Enter your month of birth :
8
Enter your birth year :
2000
Enter your monthly salary :
30000.0
Employee name is : Pratiksha Choudhari
Employee age is :20
Employee's annual salary is : 360000.0
tax on your annual salary is 10 %
your tax amount is:36000.0
*/
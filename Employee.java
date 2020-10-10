//Task 1

public class Employee 
{
	String name; 
	int age;
	String city;
		
		void display()
		{
		
			System.out.println("The name is " + name);
			System.out.println("The age is " + age);
			System.out.println("The city is " + city);

		}
	public static void main(String[] args) 
	{
		System.out.println("Details of first employee");
		Employee e1 = new Employee();
		e1.name = "Pratiksha";
		e1.age = 23;
		e1.city = "Pune";
		e1.display();
		System.out.println("__________________________\n");
		System.out.println("Details of second employee");
		Employee e2 = new Employee();
		e2.name = "Pratik";
		e2.age = 22;
		e2.city = "Pune";
		e2.display();
		
	}
}

//OUTPUT:
/*
E:\Java\Java_Course\Assignment_Day 2>javac Employee.java

E:\Java\Java_Course\Assignment_Day 2>java Employee
Details of first employee
The name is Pratiksha
The age is 23
The city is Pune
__________________________

Details of second employee
The name is Pratik
The age is 22
The city is Pune

*/
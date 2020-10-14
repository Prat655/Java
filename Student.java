import java.util.Scanner;
class Student 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of subject_1:");
		int sub1 = sc.nextInt();
		System.out.println("Enter marks of subject_2:");
		int sub2 = sc.nextInt();
		System.out.println("Enter marks of subject_3:");
		int sub3 = sc.nextInt();
		System.out.println("Enter marks of subject_4:");
		int sub4 = sc.nextInt();
		System.out.println("Enter marks of subject_5:");
		int sub5 = sc.nextInt();

		double total = (double)sub1 + sub2 + sub3 + sub4 + sub5 ;

		double percentage = ( total / 500 ) * 100 ;
		System.out.println("Your percentage are:" + percentage);
		System.out.println("Your grade is:");

		if(percentage >= 90){
			System.out.println("Excellent: Grade A");
		}else if(percentage < 90 && percentage >= 80){
			System.out.println("Very Good: Grade B");
		}else if(percentage < 80 && percentage >= 70){
			System.out.println("Good: Grade C");
		}else if(percentage < 70 && percentage >= 60){
			System.out.println("Satisfactory: Grade D");
		}else if(percentage < 60 && percentage >= 50){
			System.out.println("Work Hard: Grade E");
		}else if(percentage < 50 && percentage >= 40){
			System.out.println("Just Passed: Grade F");
		}else {
			System.out.println("Failed!");
		}
	}
}

//OUTPUT:
/*
E:\Java\Java_Course\Assignment_Day 3>javac Student.java

E:\Java\Java_Course\Assignment_Day 3>java Student
Enter marks of subject_1:
70
Enter marks of subject_2:
80
Enter marks of subject_3:
65
Enter marks of subject_4:
79
Enter marks of subject_5:
90
Your percentage are:76.8
Your grade is:
Good: Grade C*/
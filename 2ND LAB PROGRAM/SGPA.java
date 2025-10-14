import java.util.Scanner; 
class Student 
{ 
    String usn,name; 
    int[] credits,marks; 
  void AcceptDetails() 
  { 
    Scanner sc= new Scanner(System.in); 
    System.out.print("Enter USN:"); 
    usn= sc.next(); 
    System.out.println("Enter the name of student:"); 
    name= sc.next(); 
    credits= new int[4]; 
    marks= new int[4]; 
    System.out.println("Enter details of credits and marks in order for 4 subjects:"); 
    for(int i=0;i<4;i++) 
    { 
        System.out.println("Enter credits for subject" + (i+1)+":"); 
        credits[i]=sc.nextInt(); 
        System.out.println("Enter marks for "+ (i+1)+ ":"); 
        marks[i]=sc.nextInt(); 
 
    } 
  }   
  void Display() 
  { 
    System.out.println("STUDENT DETAILS"); 
    System.out.println("USN:"+ usn); 
    System.out.println("NAME:"+ name); 
    for (int i=0;i<4;i++) 
    { 
        System.out.println("Subject "+ (i+1)+ "- CREDITS:"+ credits[i]+ ",MARKS: "+ marks[i]); 
 
    } 
  } 
  double calc() 
  { 
    int totalCredits=0; 
    double totalGradePoints=0; 
    for(int i=0;i<4;i++) 
    { 
        totalCredits+= credits[i]; 
        totalGradePoints+= gradepoints(marks[i])*credits[i]; 
 
    } 
    return totalGradePoints/totalCredits; 
 
  } 
  int gradepoints(int marks) 
  { 
    if(marks>=90) return 10; 
    else if(marks>=80) return 9; 
    else if(marks>=70) return 8; 
    else if(marks>=60) return 7; 
    else if(marks>=50) return 6; 
    else if(marks>=40) return 5; 
    else return 0; 
  } 
 
} 
public class SGPA 
{ 
    public static void main(String[] a) 
    { 
        Scanner sc= new Scanner(System.in); 
        System.out.println("Name:SUDHIR UPADHAYA");
        System.out.println("USN = 1BF24CS304");
        System.out.println("Enter the number of students: "); 
        int numstudent= sc.nextInt(); 
         
        Student student[]=new Student[numstudent]; 
        for (int i=0;i< numstudent;i++) 
        { 
            student[i]=new Student(); 
            student[i].AcceptDetails(); 
            student[i].Display(); 
            System.out.println("\nSGPA: "+ student[i].calc()); 
    } 
} 
}
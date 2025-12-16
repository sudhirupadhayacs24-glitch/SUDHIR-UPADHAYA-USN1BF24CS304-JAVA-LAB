
public class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void name(String name) {
        System.out.println("Name        : " + name);
        
    }
    public void roll(int rollnumber){
          System.out.println("Roll Number : " + rollNumber);
    }
}

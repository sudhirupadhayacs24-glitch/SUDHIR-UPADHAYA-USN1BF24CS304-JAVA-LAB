
import java.util.*;


public class quadratic {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name = Sudhir Upadhaya");
        System.out.println("USN = 1BF24CS304");
        int a,b,c;
        double r1,r2;
        System.out.println("enter the value of a:");
        a = sc.nextInt();
        System.out.println("enter the value of b:");
        b = sc.nextInt();
        System.out.println("enter the value of c:");
        c = sc.nextInt();
        if(a==0) System.out.println("Not a quadratic equation");
        else{
            float d = b*b - (4*a*c);
            if(d==0){
                r1 = (-b)/(2*a);
                System.out.println("Roots are real and equal."+r1);
                System.out.println("Root 1 and Root 2");

            }
            else if(d>0){
                System.out.println("Roots are real and distinct.");
                r1 = ((-b)+((double)Math.sqrt(d)))/(2*a);
                r2 = ((-b)-((double)Math.sqrt(d)))/(2*a);
                System.out.println("the values of r1:"+r1);
                System.out.println("the values of r2:"+r2);


            }
            else if(d<0){
                System.out.println("Roots are imaginary.");
                r1 = (-b)/(2*a);
                r2 = Math.sqrt(-d)/(2*a);
                System.out.println("the values of r1:"+r1);
                System.out.println("the values of r1:"+r2);


            }
        }
        
        


    }


    
}

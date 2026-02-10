import java.util.Scanner;
public class CalculateGrades {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Percentage:");
        float percentage=sc.nextFloat();

        if(percentage >=90){
            System.out.println("You have got A");
        } else if(percentage >= 75){
            System.out.println("you have got B");
        } else if(percentage>=60){
            System.out.println("You have got D, you seriously have to focus on studies");
        }else{
            System.out.println("Sorry, you have Failed ");
            sc.close();
        }
    }
}

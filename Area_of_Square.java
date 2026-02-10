import java.util.Scanner;
public class Area_of_Square {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of a Square");
    int side = sc.nextInt();

    int Area_calculate = side*side;

    System.out.println("Area of square is : "+Area_calculate);
    sc.close();
    }
}

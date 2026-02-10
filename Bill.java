import java.util.Scanner;
public class Bill {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    float gst = 0.18f;
    float sum = (pencil+pen+eraser);
    float amt = (pencil+pen+eraser)*gst;

    float total = sum+amt;
    System.out.println(total);
    sc.close();
    }
}

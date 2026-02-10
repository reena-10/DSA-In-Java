import java.util.Scanner;
public class ElseifLadder {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For English Select Button 1");
        System.out.println("For Hindi select Button 2");
        System.out.println("For Spanish Select Button 3");
        System.out.println("For French select Button 4");
        System.out.println("For Italian Select Button 5");
        System.out.println("For Arabic Select Button 6");

        System.out.println();

        System.out.println("Enter the Button Number : ");
        int Button = sc.nextInt();
        if(Button == 1) {
             System.out.println("Hello");
        }else if(Button == 2){
            System.out.println("Namaste");
        }else if(Button == 3){
            System.out.println("Hola");
        }else if(Button ==4 ){
            System.out.println("Bonjour");
        }else if(Button == 5){
            System.out.println("Ciao");
        }else if(Button ==6){
            System.out.println("Marhaba");
        }else
        System.out.println("Invaild Button");
         
        sc.close();
        
    }
}

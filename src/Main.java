import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("this is the menu . 1:sum, 2:substraction, 3:divesion");
         int number;
         System.out.println("enter a number");
         number=input.nextInt();
         switch(number){

             case 1:
                 System.out.println("great you want to sum two numbers");
                 break;
             case 2:
                 System.out.println("great you want to substract two numbers");
                 break;
                 case 3:
                     System.out.println("great you want to division two numbers");
                     break;
                     default:
                         System.out.println("invalid input");

         }


    }
}
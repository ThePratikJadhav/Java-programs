import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number(max) to print all even and odd until:");
        int number = sc.nextInt();
        System.out.println("Even numbers from 1 to " + number + " are : \n");
        for (a = 1; a<= number; ++a ){
            if (a%2==0){
                System.out.println(a+"\n");

            }
        }
        System.out.println("odd numbers from 1 to " + number + " are : \n");
        for (a= 1; a<=number; ++a){
            if (a%2==1){
                System.out.println(a+"\n");
            }

        }
        sc.close();

    }
}
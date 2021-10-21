import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = 0;
        System.out.println("Enter The Number :");
        num = sc.nextInt();


        for (int i= 1 ; i<=10 ; ++i){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}

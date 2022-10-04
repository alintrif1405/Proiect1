import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int sum=0;
        int count=0;
        int number;
        number = reader.nextInt();
        while(number!=0){
            sum=sum+number;
            count++;
            number = reader.nextInt();
        }
        System.out.println(sum/count);
    }
}
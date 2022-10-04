import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int sum=0;
        int count=0;
        int number=2;
        while(number!=0){
            number = reader.nextInt();
            sum=sum+number;
            count++;
        }
        System.out.println(sum/count);
    }
}
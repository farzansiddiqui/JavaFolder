import java.util.Scanner;

public class JavaCon {
    public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

    

        int goodNumberCount = 0;
        int num = 0;

        while (goodNumberCount < n) {
            num++;
            if (num % 3 == 0 && num % 10 == 3) {
                continue;
            }
            goodNumberCount++;
        }
        scanner.close();

        if (goodNumberCount == n) {
            System.out.println("The " + n + "th good number is: " + num);
        } else {
            System.out.println("Write in input number, the last number was a bad number.");
        }
    
    }

}

import java.util.Scanner;

public class Multiplexer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Input I0 (0 or 1): ");
        int I0 = sc.nextInt();

        System.out.print("Enter Input I1 (0 or 1): ");
        int I1 = sc.nextInt();

        System.out.print("Enter Select S (0 or 1): ");
        int S = sc.nextInt();

        int Y;

        if (S == 0) {
            Y = I0;
        } else {
            Y = I1;
        }

        System.out.println("Output Y = " + Y);

        sc.close();
    }
}
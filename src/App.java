import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Informe o numero:\n");
        num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + num + " = " + i*num);
        }
    }
}

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание №12");

        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();
        double dist = 0;
        int days = 0;
        while (dist < y) {
            dist +=x;
            x *=1.1;
            days ++;
        }
        System.out.println(days + " - days");
    }
}

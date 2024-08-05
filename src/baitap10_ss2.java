import java.util.Scanner;

public class baitap10_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        while (true) {

            System.out.print("Nhập cạnh a: ");
            a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            c = scanner.nextDouble();


            if (isValidTriangle(a, b, c)) {

                double perimeter = a + b + c;
                double area = calculateArea(a, b, c);

                System.out.printf("Chu vi tam giác: %.2f\n", perimeter);
                System.out.printf("Diện tích tam giác: %.2f\n", area);
                break;
            } else {
                System.out.println("Cạnh không hợp lệ. Vui lòng nhập lại.");
            }
        }

        scanner.close();
    }

    private static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
                (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}



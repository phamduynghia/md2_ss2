import java.util.Scanner;

public class baitap9_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Hiển thị menu
            System.out.println("----- Menu -----");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Tính chu vi và diện tích hình chữ nhật
                    calculateRectangle(scanner);
                    break;

                case 2:
                    // Tính chu vi và diện tích hình tam giác
                    calculateTriangle(scanner);
                    break;

                case 3:
                    // Tính chu vi và diện tích hình tròn
                    calculateCircle(scanner);
                    break;

                case 4:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    // Xử lý lựa chọn không hợp lệ
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    // Phương thức tính chu vi và diện tích hình chữ nhật
    private static void calculateRectangle(Scanner scanner) {
        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.printf("Chu vi hình chữ nhật: %.2f\n", perimeter);
        System.out.printf("Diện tích hình chữ nhật: %.2f\n", area);
    }

    // Phương thức tính chu vi và diện tích hình tam giác
    private static void calculateTriangle(Scanner scanner) {
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        if (isValidTriangle(a, b, c)) {
            double perimeter = a + b + c;
            double area = calculateArea(a, b, c);

            System.out.printf("Chu vi hình tam giác: %.2f\n", perimeter);
            System.out.printf("Diện tích hình tam giác: %.2f\n", area);
        } else {
            System.out.println("Cạnh không hợp lệ cho hình tam giác.");
        }
    }

    // Phương thức kiểm tra tính hợp lệ của tam giác
    private static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
                (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Phương thức tính diện tích tam giác sử dụng công thức Heron
    private static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2; // Nửa chu vi
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Phương thức tính chu vi và diện tích hình tròn
    private static void calculateCircle(Scanner scanner) {
        final double PI = 3.14;

        System.out.print("Nhập bán kính: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.printf("Chu vi hình tròn: %.2f\n", circumference);
        System.out.printf("Diện tích hình tròn: %.2f\n", area);
    }
}



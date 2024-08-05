import java.util.Scanner;

public class baitap5_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị đầu của khoảng: ");
        int start = scanner.nextInt();

        System.out.print("Nhập giá trị cuối của khoảng: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Khoảng không hợp lệ. Giá trị đầu phải nhỏ hơn hoặc bằng giá trị cuối.");
            scanner.close();
            return;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);

        scanner.close();
    }
}

import java.util.Scanner;

public class baitap2_ss2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số tự nhiên: ");
        int number = scanner.nextInt();

        // Khai báo biến lưu trữ chuỗi cần hiển thị
        String result = "";

        if (number % 3 == 0 && number % 5 == 0) {
            result = "Chia hết cho cả 3 và 5";
        } else if (number % 3 == 0) {
            result = "Chỉ chia hết cho 3";
        } else if (number % 5 == 0) {
            result = "Chỉ chia hết cho 5";
        } else {
            result = "Không chia hết cho 3, cũng không chia hết cho 5";
        }

        System.out.println(result);
        scanner.close();
    }
}

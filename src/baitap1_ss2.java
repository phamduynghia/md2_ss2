import java.util.Scanner;

public class baitap1_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 0 đến 9: ");
        int number = scanner.nextInt();

        scanner.close();

        switch (number) {
            case 0:
                System.out.println("Số không");
                break;
            case 1:
                System.out.println("Số Một");
                break;
            case 2:
                System.out.println("Số Hai");
                break;
            case 3:
                System.out.println("Số Ba");
                break;
            case 4:
                System.out.println("Số Bốn");
                break;
            case 5:
                System.out.println("Số Năm");
                break;
            case 6:
                System.out.println("Số Sáu");
                break;
            case 7:
                System.out.println("Số Bảy");
                break;
            case 8:
                System.out.println("Số Tám");
                break;
            case 9:
                System.out.println("Số Chín");
                break;
            default:
                System.out.println("Số không hợp lệ");
                break;
        }
    }
}

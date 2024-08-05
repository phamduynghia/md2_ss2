import java.util.Scanner;
public class baitap8_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("----- Menu -----");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    checkEvenOdd(scanner);
                    break;

                case 2:

                    checkPrime(scanner);
                    break;

                case 3:

                    checkDivisibleBy3(scanner);
                    break;

                case 4:

                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:

                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }


    private static void checkEvenOdd(Scanner scanner) {
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }


    private static void checkPrime(Scanner scanner) {
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println(number + " không phải là số nguyên tố.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
    }

    private static void checkDivisibleBy3(Scanner scanner) {
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println(number + " chia hết cho 3.");
        } else {
            System.out.println(number + " không chia hết cho 3.");
        }
    }
}


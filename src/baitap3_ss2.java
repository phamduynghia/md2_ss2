import java.util.Scanner;

public class baitap3_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương gồm tối đa 3 chữ số: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ");
        } else {
            System.out.println(convertToWords(number));
        }
        scanner.close();
    }

    private static String convertToWords(int number) {
        if (number < 10) {
            return oneDigit(number);
        } else if (number < 20) {
            return twoDigitBelow20(number);
        } else if (number < 100) {
            return twoDigitAbove20(number);
        } else {
            return threeDigit(number);
        }
    }

    private static String oneDigit(int number) {
        String[] words = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        return words[number];
    }

    private static String twoDigitBelow20(int number) {
        String[] words = {"muoi", "muoi mot", "muoi hai", "muoi ba", "muoi bon", "muoi nam", "muoi sau", "muoi bay", "muoi tam", "muoi chin"};
        return words[number - 10];
    }

    private static String twoDigitAbove20(int number) {
        String[] tens = {"hai muoi", "ba muoi", "bon muoi", "nam muoi", "sau muoi", "bay muoi", "tam muoi", "chin muoi"};
        int tenPart = number / 10;
        int onePart = number % 10;
        if (onePart == 0) {
            return tens[tenPart - 2];
        } else {
            return tens[tenPart - 2] + " " + oneDigit(onePart);
        }
    }

    private static String threeDigit(int number) {
        int hundredPart = number / 100;
        int rest = number % 100;
        String result = oneDigit(hundredPart) + " tram";
        if (rest != 0) {
            result += " va " + convertToWords(rest);
        }
        return result;
    }
}

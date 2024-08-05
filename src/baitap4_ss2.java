import java.util.Scanner;

public class baitap4_ss2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Toán: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm môn Lý: ");
        double physicsScore = scanner.nextDouble();

        System.out.print("Nhập điểm môn Hóa: ");
        double chemistryScore = scanner.nextDouble();

        System.out.print("Nhập điểm môn Văn: ");
        double literatureScore = scanner.nextDouble();

        System.out.print("Nhập điểm môn Tiếng Anh: ");
        double englishScore = scanner.nextDouble();

        double averageScore = (mathScore + physicsScore + chemistryScore + literatureScore + englishScore) / 5;

        String grade;
        if (averageScore < 5) {
            grade = "Yếu";
        } else if (averageScore < 6.5) {
            grade = "Trung bình";
        } else if (averageScore < 8) {
            grade = "Khá";
        } else if (averageScore < 9) {
            grade = "Giỏi";
        } else {
            grade = "Xuất sắc";
        }

        System.out.printf("Điểm trung bình: %.2f\n", averageScore);
        System.out.println("Xếp loại học lực: " + grade);

        scanner.close();
    }
}


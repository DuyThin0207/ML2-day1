import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập tuổi");
        int b = number.nextInt();
        System.out.println("Nhập tên");
        String a = name.nextLine();
        System.out.println(" Tên bạn là " + a + ". Tuổi của bạn là: " + b);

    }
}

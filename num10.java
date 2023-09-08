import java.util.Scanner;

public class num10 {
    public static void main(String[] args) {
        Scanner sales = new Scanner(System.in);
        System.out.println("Nhập doanh thu: ");
        int a = sales.nextInt();
        System.out.println("Hoa hồng bạn nhận được là: " + a / 100 * 5 + "VNĐ");
    }
}

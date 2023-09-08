import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int a = number.nextInt();
        if (a > 0) {
            System.out.println(a + " lớn hơn 0.");
        }else {
            System.out.println(a + " nhỏ hơn 0");
        }
    }
}

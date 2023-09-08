import java.util.Scanner;

public class num12 {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);
        System.out.println("Nhập độ C để chuyển sang độ F:");
        int a = temperature.nextInt();
        System.out.println( a + " Độ C đổi sang được " + ( a * 9/5 + 32 ) + " độ F ");
    }
}

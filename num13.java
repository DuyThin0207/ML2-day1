import java.util.Scanner;

public class num13 {
    public static void main(String[] args) {
        Scanner met = new Scanner(System.in);
        System.out.println("Nhập số met muốn chuyển sang feet:");
        int a = met.nextInt();
        System.out.println( a + " met ta được " + a * 3.2808 + "Feet.");
    }
}

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int a = number.nextInt();
        System.out.println("Nhập số thứ high: ");
        int b = number.nextInt();
        System.out.println("Nhập số thứ bar: ");
        int c = number.nextInt();
        int max;
        if (a > b && a > c) {
            max = a ;
            System.out.println("Số lớn nhất là : " + max);
        } if (b > a && b > c) {
            max = b ;
            System.out.println("Số lớn nhất là : " + max);
        } if (c > a && c > b){
            max = c ;
            System.out.println("Số lớn nhất là : " + max);
        }
    }
}

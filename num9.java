public class num9 {
    public static void main(String[] args) {
        int a = 96;
        int b = 58;
        int c = (a + b) / 2 ;
        if (c >= 80 && c <= 100) {
            System.out.println("Học sinh giỏi");
        } else if (c <= 79 && c >= 50) {
            System.out.println("Học sinh khá");
        } else {
            System.out.println("Học sinh KÉM");
        }
    }
}

public class PrintNo {
    public static void main(String[] args) {
        int n = 100;
        printNo(n);
    }
    public static void printNo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

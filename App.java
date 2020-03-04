public class App {
    private static String spacing(Integer inputNum) {
        return (inputNum >= 10) ? "   " : "    ";
    }

    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int num = i * j;
                System.out.print(num);
                System.out.print(spacing(num));
            }
            System.out.println();
        }
    }
}
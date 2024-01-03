public class Segitiga {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("* ");
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i + j) == 9) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
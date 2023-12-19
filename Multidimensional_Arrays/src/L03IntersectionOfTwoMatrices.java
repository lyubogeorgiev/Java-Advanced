import java.util.Scanner;

public class L03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String[][] a = new String[m][];
        String[][] b = new String[m][];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextLine().split("\\s+");
        }

        String[][] c = new String[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j].equals(b[i][j])){
                    c[i][j] = a[i][j];
                } else {
                    c[i][j] = "*";
                }
            }
        }

        for (String[] chars : c) {
            System.out.println(String.join(" ", chars));
        }
    }
}

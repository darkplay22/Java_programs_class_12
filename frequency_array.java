import java.util.*;

class frequency_array {
    int mat[][];
    int m, n;

    frequency_array(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }

    void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    boolean compare(frequency_array B) {
        int[] frq1 = new int[10];
        int[] frq2 = new int[10];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                frq1[this.mat[i][j]]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                frq2[B.mat[i][j]]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (frq1[i] != frq2[i])
                return false;
        }

        return true;
    }

    void print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        frequency_array A = new frequency_array(m, n);
        frequency_array B = new frequency_array(m, n);

        System.out.println("Enter elements for Matrix A:");
        A.readArray();

        System.out.println("Enter elements for Matrix B:");
        B.readArray();

        System.out.println("\nMatrix A:");
        A.print();

        System.out.println("\nMatrix B:");
        B.print();

        if (A.compare(B))
            System.out.println("\nBoth matrices contain the same elements with the same frequency.");
        else
            System.out.println("\nBoth matrices do not contain the same elements.");
    }
}
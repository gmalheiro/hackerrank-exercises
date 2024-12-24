package hackerrank.exercise.maria_e_quadrados;

public class Main {

    public static void main(String[] args) {
        int T = 3;
        int[][] cases = {
                {3, 9},
                {17, 24},
                {1,10}
        };

        int[] results = new int[T];

        for (int i = 0; i < T; i++) {
            int A = cases[i][0];
            int B = cases[i][1];

            results[i] = countPerfectSquares(A, B);
        }

        for (int result : results) {
            System.out.println(result);
        }
    }

    public static int countPerfectSquares(int A, int B) {
        int start = (int) Math.ceil(Math.sqrt(A));
        int end = (int) Math.floor(Math.sqrt(B));

        if (start > end) {
            return 0;
        }

        return end - start + 1;
    }
}

// Question: Student Rank Analyzer

// A system is designed to analyze the ranks of students in a class.

// You are given:

// An integer N representing the number of students
// An array ranks[] containing the ranks of the students
// An integer K representing the position to be evaluated
// ⚠️ Constraints:
// The value of N must be exactly 10
// Each rank must be less than 100
// The value of K must be in the range 1 ≤ K ≤ N

// If any of the above conditions fail, print:

// Invalid Input
// 🎯 Task:

// If the input is valid:

// Find and print:
// The K-th smallest rank

// The K-th largest rank

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N != 10) {
            System.out.println("Invalid Input");
            return;
        }

        int[] ranks = new int[N];

        for (int i = 0; i < N; i++) {
            ranks[i] = sc.nextInt();
            if (ranks[i] >= 100) {
                System.out.println("Invalid Input");
                return;
            }
        }

        int K = sc.nextInt();

        if (K <= 0 || K > N) {
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(ranks);

        System.out.println(K + "th Smallest Rank: " + ranks[K - 1]);
        System.out.println(K + "th Largest Rank: " + ranks[N - K]);
    }
}
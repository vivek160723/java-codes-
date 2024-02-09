package DSA_TASK;


import java.util.Scanner;

public class coin2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step = toss("", n, false);
        System.out.println(step);
        sc.close();
    }

    private static int toss(String s, int n, boolean previousWasT) {
        if (n == 0) {
            System.out.println(s);
            return 1;
        }

        int head = 0, tail = 0;
        
        // Check if the previous toss was T, if yes, then don't allow H
        if (!previousWasT) {
            head = toss(s + "H" + " ", n - 1, false);
        }
        
        tail = toss(s + "T" + " ", n - 1, true);

        return head + tail;
    }
}

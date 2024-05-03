public class CoinToss {
    private static void toss(int n, int hCount, int tCount, String ans) {
        if (hCount + tCount == n) {
            System.out.println(ans);
            return;
        }
        if (hCount < n) {
            toss(n, hCount + 1, tCount, ans + "H");
        }
        if (tCount < n) {
            toss(n, hCount, tCount + 1, ans + "T");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        toss(n, 0, 0, "");
    }
}

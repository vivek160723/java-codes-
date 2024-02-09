package DSA_TASK;

import java.util.Arrays;
//not correect code need improvements 
public class Banana {
	public static void main(String [] args) {
		
	}
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1, hi = Arrays.stream(piles).max().getAsInt();
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (countTimeEatAllAtSpeed(mid, piles) <= h) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    
    private int countTimeEatAllAtSpeed(int K, int[] piles) {
        int countHours = 0;  // hours take to eat all bananas
        
        for (int pile : piles) {
            countHours += (pile + K - 1) / K; // Equivalent to ceil(pile/K)
        }
        return countHours;
    }

    }

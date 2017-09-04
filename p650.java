package first;

public class p650 {
public int minSteps(int n) {
        int[] minSteps=new int[n+1];
        for (int i = 2; i <= n; ++i) {
            minSteps[i] = i;
        }
        for (int i = 4; i <= n; ++i) {
            for (int j = i/2; j >= 2; --j) {
                if (i % j == 0) {
                    minSteps[i] = Math.min(minSteps[i], minSteps[j]+i/j);
                    break;
                }
            }
        }
        return minSteps[n];
}
}

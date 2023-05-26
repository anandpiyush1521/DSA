import java.util.*;
public class PointsInStraightLine{
    public static int maxPoints(int X[],int Y[],int N){
        int maxCount = 2;
		if (N <= 1) {
			maxCount = 1;
		} else {
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if((X[i] == X[j]) && (Y[i] == Y[j])) {
						continue;
					}
					int count = 2;
					for (int k = j + 1; k < N; k++) {
						if ((Y[k] - Y[i]) * (X[j] - X[i]) == (Y[j] - Y[i]) * (X[k] - X[i])) {
							count++;
						}
					}
					maxCount = Math.max(count, maxCount);
				}
			}
		}
		return maxCount;
    }
    // public static int findGcd(int a, int b){
    //     if(b == 0) return a;
    //     return findGcd(a, a%b);
    // }
    public static void main(String[] args){
        int[] X = {1, 2, 3};
        int[] Y = {1, 2, 3};
        int N = 3;
        System.out.println(maxPoints(X, Y, N));
    }
}
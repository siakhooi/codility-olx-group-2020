package nsh.codility;

import java.util.Arrays;

public class TheOLXGroup2020A implements TheOLXGroup2020Interface {
	public int solution(int[] juice, int[] capacity) {
		int max = 1;
		int N = juice.length;

		int[] sortedJuice = juice.clone();
		Arrays.sort(sortedJuice);

		for (int i = 0; i < N; i++) {
			int j = juice[i], c = capacity[i];
			boolean notskip = true;
			int remain = c - j;
			int n = 1;

			for (int k = 0; k < N && remain > 0; k++) {
				int sj = sortedJuice[k];
				if (sj == j && notskip) {
					notskip = false;
					continue;
				}
				remain -= sj;
				if (remain >= 0) 
					n++;
			}
			max = Math.max(max, n);
		}
		return max;
	}
}

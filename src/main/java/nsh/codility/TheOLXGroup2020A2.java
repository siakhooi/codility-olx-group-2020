package nsh.codility;

import java.util.Arrays;

public class TheOLXGroup2020A2 implements TheOLXGroup2020Interface {
	int checkIndex(int[] sortedJuice, int[] juice, int[] capacity, int N, int i) {
		int j = juice[i], c = capacity[i];
		boolean notskip = true;
		int remain = c - j;
		int max = 1;
		for (int k = 0; k < N && remain > 0; k++) {
			int sj = sortedJuice[k];
			if (sj == j && notskip) {
				notskip = false;
				continue;
			}
			remain -= sj;
			if (remain >= 0)
				max++;
		}

		return max;
	}

	public int solution(int[] juice, int[] capacity) {
		int N = juice.length;

		int[] sortedJuice = juice.clone();
		Arrays.sort(sortedJuice);
		int minJuice = sortedJuice[0];

		int maxCapacity = 0;
		int maxCapacityIndex = 0;
		int maxEmpty = 0;
		int maxEmptyIndex = 0;

		for (int i = 0; i < N; i++) {
			int j = juice[i], c = capacity[i];
			if (c - j > maxEmpty) {
				maxEmpty = c - j;
				maxEmptyIndex = i;
			}
			if (c > maxCapacity && c - j >= minJuice) {
				maxCapacityIndex = i;
				maxCapacity = c;
			}
		}
		int max1 = checkIndex(sortedJuice, juice, capacity, N, maxEmptyIndex);

		int max2 = 1;
		if (maxCapacityIndex != maxEmptyIndex)
			max2 = checkIndex(sortedJuice, juice, capacity, N, maxCapacityIndex);

		return Math.max(max1, max2);
	}
}

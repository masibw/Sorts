package com.mesimasi.sorts;

import java.util.List;

public class Merge {
//O(nlogn)
	public void merge(List<Integer> data, int left, int middle, int right) {
		int[] helper = new int[data.size()];

		for (int i = left; i <= right; i++) {
			helper[i]=data.get(i);
		}
		int helperLeft = left;
		int helperRight = middle + 1;
		int current = left;

		while (helperLeft <= middle && helperRight <= right) {
			if (helper[helperLeft] <= helper[helperRight]) {
				data.set(current, helper[helperLeft]);
				helperLeft++;
			} else {
				data.set(current, helper[helperRight]);
				helperRight++;
			}
			current++;
		}
		DataHelper DH = new DataHelper();
		System.out.println("------before---");
		DH.printDatas(data);
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			data.set(current + i, helper[helperLeft + i]);
		}
		System.out.println("------after---");
		DH.printDatas(data);

		System.out.println("------------end-----");
	}

	public void MergeSort(List<Integer> data, int left, int right) {
		if (left < right) {
			int middle = (left + right) >>> 1; //右に１つシフトすることで1/2になる
			MergeSort(data, left, middle);
			MergeSort(data, middle + 1, right);
			merge(data, left, middle, right);
		}

		return;
	}
}

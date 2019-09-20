package com.mesimasi.sorts;

import java.util.List;

public class Quick {
//O(nlogn)
	public void quickSort(List<Integer> data,int left,int right) {
		if(left>=right) return;

		int l=left;
		int r=right;
		int p = data.get((left+right)/2);
		while(l<=r) {
			while(data.get(l)<p) {
				l++;
			}

			while(data.get(r)>p) {
				r--;
			}
			if(l<=r) {
				int temp=data.get(r);
				data.set(r,data.get(l));
				data.set(l, temp);
				l++;
				r--;
			}
		}

		quickSort(data,left,r);
		quickSort(data,l,right);


		return;

	}
}

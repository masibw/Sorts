package com.mesimasi.sorts;

import java.util.List;

public class Select {
	//O(n^2)
	public void selectSort(List<Integer> data) {

		for (int i = 0; i < data.size(); i++) {
			int min = data.get(i);
			int index=i;
			for (int j = i+1; j < data.size(); j++) {
				if(data.get(j)<min) {
					min=data.get(j);
					index=j;
				}
			}
			int temp=data.get(i);
			data.set(i,min);
			data.set(index,temp);
		}
	}
}

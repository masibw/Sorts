package com.mesimasi.sorts;

import java.util.List;

public class Insert {


	public List<Integer> insertSort(List<Integer> data){
//計算量O(n^2)
		for(int i=1;i<data.size();i++) {
			for(int j=0;j<i;j++) {
				if(data.get(i)<data.get(j)) {
					int temp=data.get(i);
					data.remove(i);
					data.add(j,temp);
				}
			}
		}

		return data;
	}
}

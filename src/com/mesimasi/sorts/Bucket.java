package com.mesimasi.sorts;

import java.util.List;

public class Bucket {
	//O(n+k) 多分これでいけるはずだけどメモリ不足で実行できない
	public void bucketSort(List<Integer> data) {
		int max=0;
		for(int number:data) {
			if(number>max) {
				max=number;
			}
		}
		int[] bucket = new int[max+1];
		for (int i = 0; i < data.size(); i++) {
			bucket[data.get(i)]++;
		}

		int index=0;
		for(int i=0;i<max+1;i++) {
			if(bucket[i]>0) {
				for(int j=0;j<bucket[i];j++) {
					data.set(index, i);
					index++;
				}
			}
		}

	}
}

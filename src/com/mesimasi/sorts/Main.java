package com.mesimasi.sorts;

import java.util.List;

public class Main {
	public static void main(String[] args) {
			DataHelper dataHelper = new DataHelper();
			List<Integer> data = dataHelper.makeDataList();
			Bubble bubble = new Bubble();
			Insert insert = new Insert();
			Quick quick = new Quick();
			Merge merge=new Merge();
			Select select=new Select();
			Bucket bucket=new Bucket();
			long start = System.currentTimeMillis();
			bucket.bucketSort(data);
			long end = System.currentTimeMillis();
			dataHelper.printDatas(data);
			System.out.println((end-start)+"ms");
}
}

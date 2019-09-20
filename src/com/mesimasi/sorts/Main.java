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
			long start = System.currentTimeMillis();
			select.selectSort(data);
			long end = System.currentTimeMillis();
			dataHelper.printDatas(data);
			System.out.println((end-start)+"ms");
}
}

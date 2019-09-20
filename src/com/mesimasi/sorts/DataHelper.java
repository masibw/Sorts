package com.mesimasi.sorts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataHelper {

	public List<Integer> makeDataList(){
		List<Integer> data = new ArrayList<>();
		final  int size = 1000;
		Random random = new Random();
		for(int i=0;i<size;i++) {
		int number =random.nextInt();
//	for bucket sort		int number=(int)(Math.random()*100);
			data.add(number);
		}
		return data;
	}


	public void printDatas(List<Integer> datas) {
		for(Integer data:datas) {
			System.out.println(data);
		}
	}
}



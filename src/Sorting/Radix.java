package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

public class Radix implements Sort {
	private Integer a[];
	private List<Integer> list;
	private List<List> radixList;
	private int maxLength=10;
	public Radix(){
		radixList = new ArrayList<List>();
		for(int i=0;i<10;i++){
			radixList.add(new ArrayList<Integer>());
		}
	}
	
	@Override
	public void doSort(int a[]) {
		int max=0;
		// TODO Auto-generated method stub
		for(int i:a){
			if(i>=max){
				max=i;
			}
		}
	
		list = Arrays.asList(ArrayUtils.toObject(a));
		while((max/(maxLength/10))>0){
			for(int i:a){
				int radix = (i/(maxLength/10))%10;
				radixList.get(radix).add(i);
			}
			int count=0;
			for(List<Integer> rlist:radixList){
				for(Integer num:rlist){
					a[count++] = num;
//					list.addAll(rlist);
				}
				rlist.clear();
			}
			maxLength*=10;
			System.out.println(Arrays.toString(a));
		}
	}
					
	

}

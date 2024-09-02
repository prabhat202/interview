package codeschool;

import java.util.Iterator;

public class MyArrayList {
	private int SIZE = 3;
	int count = 0 ;
	
	private int[] data = new int[SIZE];
	
	public void add(int num) {
		if(empty()) {
			data[count++] = num;
		} else {
			resizeAndCopy();
			data[count++] = num;
		}
		
	}

	private void resizeAndCopy() {
		SIZE = SIZE * 2;
		int [] data1 = new int[SIZE];
		
		
		System.arraycopy(data, 0, data1, 0, data.length);
		data = data1;
	}

	private boolean empty() {
		if(count < SIZE) {
			return true;
		}
		return false;
	}
	
	private int getLength() {
		return SIZE;
	}
	
	private int getData(int i) {
		return data[i];
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		int x = list.getLength(); 
		int i = 0;
		while (x >0) {
			System.out.println(list.getData(i++));
			x--;
			
		}
	}

}

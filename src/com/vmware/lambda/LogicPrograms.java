package com.vmware.lambda;

import java.util.Arrays;

public class LogicPrograms {
	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		reverseNumber.reverseNumber();
		MyArrayList s = new MyArrayList();
		System.out.println(s.size());
		s.add("satheesh");
		s.add("satheesh");
		s.add("satheesh");
		s.add("satheesh");
		s.add("satheesh");
		s.add("sdashvanth");

		System.out.println("used:" + s.size());
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		s.get(5);
		System.out.println(s.remove(3));
		System.out.println("used:" + s.size());

	}
}

class ReverseNumber {
	public void reverseNumber() {
		int number = 1823;
		int s = 0;
		int y = 0;
		int reverse = 0;
		boolean flag = true;
		System.out.println(number);
		while (flag) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
			System.out.println(reverse);
			if (number == 0) {
				flag = false;
			}
		}
	}
}

class MyArrayList {
	private Object[] internal = new Object[10];
	private int actSize = 0;

	public void add(Object obj) {
		if (internal.length - actSize <= 5) {
			increaseArray();
		}
		internal[actSize++] = obj;

	}

	public Object remove(int index) {
		if (index < actSize) {
			Object obj = internal[index];
			internal[index] = null;
			int tmp = index;
			while (tmp < actSize) {
				internal[tmp] = internal[tmp + 1];
				internal[tmp + 1] = null;
				tmp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException("indexing problem");
		}

	}

	public Object get(int index) {
		if (index < actSize) {

			return internal[index];
		} else {
			throw new ArrayIndexOutOfBoundsException("array size problem");
		}
	}

	private void increaseArray() {
		int newSize = internal.length * 2;
		internal = Arrays.copyOf(internal, newSize);
		System.out.println(internal.length);

	}

	public int size() {
		return actSize;
	}
}
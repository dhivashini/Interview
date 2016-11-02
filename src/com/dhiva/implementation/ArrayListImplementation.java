package com.dhiva.implementation;

import java.util.Arrays;

public class ArrayListImplementation {
	private Object myArrayList[];
	private int currentSize;

	public ArrayListImplementation() {
		myArrayList = new Object[10];
	}

	public void add(Object e) {
		if (myArrayList.length - currentSize <= 5) {
			increaseListSize();
		} else
			myArrayList[currentSize++] = e;
	}

	public Object get(int index) {
		if (index < myArrayList.length)
			return myArrayList[index];
		else
			throw new ArrayIndexOutOfBoundsException();
	}

	public Object remove(int index) {
		if(index<currentSize){
			Object o = myArrayList[index];
			myArrayList[index] = null;
			int temp = index;
			while(temp<currentSize){
				myArrayList[temp]=myArrayList[temp+1];
				myArrayList[temp+1]=null;
				temp++;
			}
			currentSize--;
			return o;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size() {
		return currentSize;
	}

	public void increaseListSize() {
		myArrayList = Arrays.copyOf(myArrayList, myArrayList.length * 2);
	}
}

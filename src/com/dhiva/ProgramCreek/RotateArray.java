package com.dhiva.ProgramCreek;

//o(1) - space, o(n) - time
public class RotateArray {
	public int[] rotateArray(int[] inputArray, int order) {
		int index = order % inputArray.length;
		if (inputArray == null || order < 0)
			throw new NullPointerException();
		int shift = inputArray.length - index;
		shiftElements(inputArray, 0, shift-1);
		shiftElements(inputArray, shift, inputArray.length-1);
		shiftElements(inputArray, 0, inputArray.length-1);
		return inputArray;
	}

	private void shiftElements(int[] arr, int left, int right) {
		if (arr == null || arr.length == 1)
			return;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}

package com.dhiva.BitManipulation;

public class BitManipulation {
	
	public int getBit(int number, int position) {
		return (number & (1 << position));
	}

	public int setBit(int number, int position) {
		return (number | (1 << position));
	}

	public int flipBit(int number, int position) {
		return (number ^ (1 << position));
	}

	public int clearBit(int number, int position) {
		return (number & ~(1 << position));
	}
	
	public int clearBitsFromMSBToI(int number, int i){
		int mask = (1<<i) - 1;
		return number & mask;
	}
	
	public int getLSB(int number)
	{
		return number & 1;
	}
	
	public int countDigits(int number){
		int count = 0;
		for(int i=0;number>0;number>>=1)
			count++;
		return count;
	}
	
	public int getSignBit(int number)
	{
		int val = number & 0x80000000;
		return val >>> 31;
	}
	
	public int bitSetcountB(int num)
	{
		int count =0;
		while(num != 0)
		{
			count++;
			num = num & (num-1);
		}
		return count;
	}

}

package com.dhiva.arraystringtests;

import org.junit.Test;

import com.dhiva.ArraysAndStrings.KClosestPoints;
import com.dhiva.ArraysAndStrings.Point;

public class KClosestPointsTest {
	@Test
	public void test(){
		Point p1 = new Point(2,3);
		Point p2 = new Point(4,3);
		Point p3 = new Point(2,5);
		Point p4 = new Point(2,2);
		Point p5 = new Point(4,8);
		Point[] points = new Point[5];
		points[0] = p1;
		points[1] = p2;
		points[2] = p3;
		points[3] = p4;
		points[4] = p5;
		KClosestPoints obj = new KClosestPoints();
		Point[] output = obj.getKClosestPoints(2, points);
		for(int i=0 ;i <output.length;i++)
		System.out.println(output[i].x+"/"+output[i].y);
	}
}

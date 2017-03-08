package com.dhiva.memory;

import org.junit.Test;

public class LRUCacheTest {
	@Test
	public void test(){
		LRUCacheImplementation cache = new LRUCacheImplementation(1);
        cache.set(1, 10);
        System.out.println(cache.get(1));  
        cache.set(2, 20);
        cache.set(3, 30);
        cache.set(4, 40);
        cache.set(5, 50);
        cache.set(2, 60);
        System.out.println(cache.get(2));      
        cache.set(7, 70);
        System.out.println(cache.get(9));
	}
}

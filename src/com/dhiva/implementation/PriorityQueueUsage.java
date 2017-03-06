package com.dhiva.implementation;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUsage {
	public static void main(String[] args)
    {
		Person dhiva = new Person("dhisha", "jagan", "f", 22);
		Person hari = new Person("dhisha", "jagan", "f", 22);
		Person sk = new Person("kou", "sekhar", "m", 21);
		Person manoj = new Person("manash", "ravi", "m", 23);
		Person hani = new Person("hanumesh", "m", "m", 26);
		
        PriorityQueue<Person> queue = 
            new PriorityQueue<Person>(10, new Comparator<Person>() {
    			@Override
    			public int compare(Person o1, Person o2) {
    				return o1.getAge()-o2.getAge();
    			}
    		});
       
        PriorityQueue<Integer> current = new PriorityQueue<Integer>();
        current.add(10);
        current.add(5);
        current.add(6);
        current.add(1);
        current.add(3);
        current.add(4);
        
        while (current.size() != 0)
        {
            System.out.println(current.poll());
        }
        
        queue.add(hani);
        queue.add(manoj);
        queue.add(sk);
        queue.add(dhiva);
        queue.add(hari);
        
        for (Person p : queue) {
			System.out.println(p.getFirstName()+" " +p.getLastName()+" "+p.getAge());
		}
        System.out.println(queue.contains(dhiva));
        System.out.println(queue.contains(hari));
        System.out.println(queue.size());
        System.out.println(queue.remove().getFirstName());
        System.out.println(queue.size());
        
        System.out.println(queue.peek().getFirstName()+queue.peek().getAge());
        System.out.println(queue.size());
        
        while (queue.size() != 0)
        {
            System.out.println(queue.poll().getFirstName());
        }
    }
}

package com.dhiva.implementation;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUsage {
	public static void main(String[] args)
    {
		Person dhiva = new Person("dhisha", "jagan", "f", 21);
		Person hari = new Person("dhisha", "jagan", "f", 21);
		Person sk = new Person("kou", "sekhar", "m", 25);
		Person manoj = new Person("manash", "ravi", "m", 22);
		Person hani = new Person("hanumesh", "m", "m", 26);
		
        PriorityQueue<Person> queue = 
            new PriorityQueue<Person>(10, new Comparator<Person>() {
    			@Override
    			public int compare(Person o1, Person o2) {
    				return o1.getAge()-o2.getAge();
    			}
    		});
        queue.add(dhiva);
        queue.add(hari);
        queue.add(sk);
        queue.add(manoj);
        queue.add(hani);
        for (Person p : queue) {
			System.out.println(p.getFirstName()+" " +p.getLastName()+" "+p.getAge());
		}
        System.out.println(queue.contains(dhiva));
        System.out.println(queue.contains(hari));
        System.out.println(queue.size());
        System.out.println(queue.remove().getFirstName());
        System.out.println(queue.size());

        while (queue.size() != 0)
        {
            System.out.println(queue.poll().getFirstName());
        }
    }
}
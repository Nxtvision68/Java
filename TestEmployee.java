package ranga3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(103);
		e1.setName("ranga");
		e1.setSalary(1000);
		
		Employee e2 = new Employee();
		e2.setId(101);
		e2.setName("vikram");
		e2.setSalary(1500);
		
		Employee e3 = new Employee();
		e3.setId(102);
		e3.setName("sreenath");
		e3.setSalary(500);
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		Collections.sort(l);
		ListIterator<Employee> iterator = l.listIterator();
		while(iterator.hasNext()){
			Employee e = (Employee) iterator.next();
			System.out.println(e.id+":"+e.name+":"+e.salary);
		}
	}

}

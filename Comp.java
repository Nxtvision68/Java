package ranga3;

import java.util.Comparator;

public class Comp implements Comparator<Employee>{
	
	public int compare(Employee obj1, Employee obj2) {
		if(obj1.salary>obj2.salary){
			return 1;
		}
		else if(obj1.salary<obj2.salary){
			return -1;
		}
		else{
			return 0;
		}
		
	}

}

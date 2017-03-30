package ranga3;
public class Employee implements Comparable<Employee>{
	int id;
	String name;
	float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int compareTo(Employee o) {
		if(this.salary>o.salary){
			return 1;
		}
		else if(this.salary<o.salary){
			return -1;
		}
		return 0;
	}

}

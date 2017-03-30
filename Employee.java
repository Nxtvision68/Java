package Srealization;

public class Employee  implements SeriInterface {


	private static final long serialVersionUID = -4423666894518946280L;
	 transient int id= 1234;
	 String Name="sateesh";
	public int getId() {
	//ystem.out.println(id);
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
//System.out.println(Name);
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	 
	
}

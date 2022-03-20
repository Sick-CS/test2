package employeeinfo;

class Employee{
	
	private String Companyname;
	private String name;
	private String id;
	
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	
	public String getCompanyname() {
		return Companyname;
	}
	
	public void setCompanyname(String Companyname) {
		this.Companyname = Companyname; 
	}
}
class Businesslogic{
	private double salary;
	private double tax;
	private double pf;
	

	public double gettax() {
		return tax;
	}
	
	public void settax(double tax) {
		this.tax = tax;
	}
	
	public double getpf() {
		return pf;
	}
	
	public void setpf(double pf) {
		this.pf = pf;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public void setsalary(double salary) {
		this.salary = salary;
	}
	public double calculateSalary() {
		double total = salary + tax + pf;
		return total;
	}
}



public class Main {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setCompanyname("TATA");
		emp.setname("Tom");
		emp.setid("12");
		Businesslogic B = new Businesslogic();
		B.setsalary(50000);
		B.settax(200);
		B.setpf(15);
		
		System.out.println(emp.getCompanyname()+" Company"+"\n"+"Employee information: \n");
		System.out.println("	*Name of our Employee is: "+emp.getname());
		System.out.println("	*The employee id privoded from the complany is: "+emp.getid());
		System.out.println("	*The salary of "+emp.getname()+" is: "+B.getsalary());
		System.out.println("\n		*This tax amount will be deducted from your salary: "+B.gettax());
		System.out.println("		*This pf amount weill be deducted from your salary: "+B.getpf());
		System.out.println("		*"+emp.getname()+" your total salary will be: "+B.calculateSalary());
	}
}
















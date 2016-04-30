interface SalaryCalculator{
	double calculate(Employee employee);
}


class SimpleSalaryCalculator{
	
	protected double multiply;
	
	SimpleSalaryCalculator(double multiply){
		this.multiply = multiply;
	}

	public double getMultiply(){ 
		return this.multiply; 
	}

	double calculate(Employee employee){
		return employee.getSalary() * multiply;	
	}
}


class Employee{
	
	private String name;
	
	private String cpf;
	
	private Long id;
	
	private double salary;

	private String profession;


	public String getName(){
		return this.name;	
	}
	public String getCpf(){
		return this.cpf;
	}
	public Long getId(){
		return this.id;
	}
	public double getSalary(){
		return this.salary;
	}
	public String getProfession(){
		return this.profession;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public void setId(Long id){
		this.id = id;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setProfession(String profession){
		this.profession = profession;
	}

	

}

public class Example3Test{

	public static void main(String ...args){
		Employee emp = new Employee();
		emp.setName("Batman");
		emp.setCpf("333PLUS333");
		emp.setId(1L);
		emp.setSalary(1850);
		emp.setProfession("Jr. Java(and other stuff) Developer");

		double newSalary = new SimpleSalaryCalculator(1.01).calculate(emp);
		System.out.println("Real salary: " + newSalary);


		//With lambda
		
		SalaryCalculator calculator = (Employee employee) -> {
			return employee.getSalary() * 2;
		};  

		double imaginarySalary = calculator.calculate(emp);

		System.out.println("Expected: " + imaginarySalary);
					
				

	}


}
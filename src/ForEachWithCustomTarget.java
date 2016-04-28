import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple program using custom object as target for for-each ( enhanced for
 * loop ).
 * 
 * @author unmattavesa
 *
 */
public class ForEachWithCustomTarget {

	public static void main(String[] args) {
		
		Employees employees = new Employees();
		employees.add(new Employee("sivanarayana", 10000));
		employees.add(new Employee("unmattavesa", 20000));
		employees.add(new Employee("balaji", 30000));
		employees.add(new Employee("shankar", 40000));
		employees.add(new Employee("mayank", 50000));
		employees.add(new Employee("dhanu", 60000)); 
		
		
		// Print the name of each employee..
		out.println("Names of all employees :: ");
		out.println("---------------------------");
		for(Employee e : employees) {
			out.println(e.getEmpName());
		}
		out.println("---------------------------\n\n");
		
		
		// Print the name of each employee whose salary is greater than 25000
		out.println("Names of all employees with salary > 25000 :: ");
		out.println("---------------------------");
		for(Employee e : employees) {
			if(e.getSalary() > 25000)
			out.println(e.getEmpName());
		}
		out.println("---------------------------\n\n");
		
		
		// Print the sum of salaries of all employees
		out.println("Total salary of all the employees :: ");
		out.println("---------------------------");
		double totalSal = 0.0;
		for(Employee e : employees) {
			totalSal += e.getSalary();
		}
		out.println("\t" + totalSal);
		out.println("---------------------------\n\n");
	}
}

class Employees implements Iterable<Employee> {

	private List<Employee> employees = new ArrayList<>();
	
	public Iterator<Employee> iterator() {
		return employees.iterator();
	}
	
	boolean add(Employee e) {
		return employees.add(e);
	}
}



class Employee {

	private String empName;
	private double salary;
	
	public Employee() {
		// TODO
	}
	
	public Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}
	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

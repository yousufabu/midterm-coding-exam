package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	//employeeId() will return employee id.
	public int employeeId() ;

	//employeeName() will return employee name
	public String employeeName();


	//assignDepartment() will assign employee to departments
	public void assignDepartment();

	//calculate employee salary
	public int calculateSalary();

	//employee benefit
	public void benefitLayout();

	public String employeeAddress();

	public String employeeAnniversary();
}
class Employ implements Employee{

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {

	}

	@Override
	public int calculateSalary() {
		return 0;
	}

	@Override
	public void benefitLayout() {

	}

	@Override
	public String employeeAddress() {
		return null;
	}

	@Override
	public String employeeAnniversary() {
		return null;
	}
}
package ustbatchno3.sonarqubetest;



/*create a employee object with attributes like emp_name,age,no of yeaars working,salary
logic is increment of salary based out on experience
1-3 = 2.5% incr
3-6=5%
6-10=10%
>10=12% */


/**
 * Hello world!
 *
 */
public class Employee 
{
    private String emp_name;
    private int age;
    private int experience;
    private float salary;
	public Employee(String emp_name, int age, int experience, float salary) {
		super();
		this.emp_name = emp_name;
		this.age = age;
		this.experience = experience;
		this.salary = salary;
	}
	/**
	 * @return the emp_name
	 */
	public String getEmp_name() {
		return emp_name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param emp_name the emp_name to set
	 */
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", age=" + age + ", experience=" + experience + ", salary=" + salary
				+ "]";
	}
    
}

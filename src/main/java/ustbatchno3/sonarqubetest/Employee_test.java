package ustbatchno3.sonarqubetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Employee_test {
	public static void main(String[] args) {
	 List<Employee> l1  = new ArrayList<Employee>();
	 l1.add(new Employee("Christo",22,2,50000));
	 l1.add(new Employee("Anirudh", 30, 10, 100000));
	 l1.add(new Employee("Anirudh", 30, 5, 100000));
	 l1.add(new Employee("Anirudh", 30, 7, 100000));
	 l1.add(new Employee("Anirudh", 30, 12, 100000));
//	 System.out.println(l1);
	 List<Employee> l2 = l1.stream().peek(i->{
		 if(i.getExperience()>=1 && i.getExperience()<=3)
		    i.setSalary((float) (i.getSalary()+0.025*i.getSalary()));
		 if(i.getExperience()>=4 && i.getExperience()<=6)
			 i.setSalary((float) (i.getSalary()+(0.05)*i.getSalary()));
			else if((i.getExperience()>=7)&& (i.getExperience()<=10))
				i.setSalary((float) (i.getSalary()+(0.1)*i.getSalary()));
			else if((i.getExperience()>10))
				i.setSalary((float) (i.getSalary()+(0.12)*i.getSalary()));
		 
	 
	 }
			
		 
	 
		 ).collect(Collectors.toList());
	 
	 	
	System.out.println(l2);
	}
	
	

}

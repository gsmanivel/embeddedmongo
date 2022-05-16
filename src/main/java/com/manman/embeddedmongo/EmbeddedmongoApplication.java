package com.manman.embeddedmongo;

import com.manman.embeddedmongo.model.Address;
import com.manman.embeddedmongo.model.Employee;
import com.manman.embeddedmongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EmbeddedMongoApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("fname1","lastname1",new Address("addLine1","addLine2","city1","state1",00001),12341);
		Employee e2 = new Employee("fname2","lastname2",new Address("addLine1","addLine2","city2","state2",00002),12342);
		Employee e3 = new Employee("fname3","lastname3",new Address("addLine1","addLine2","city3","state3",00003),12343);
		Employee e4 = new Employee("fname4","lastname4",new Address("addLine1","addLine2","city4","state4",00004),12344);
		Employee e5 = new Employee("fname5","lastname5",new Address("addLine1","addLine2","city5","state5",00005),12345);

		Employee[] employeesArr = { e1,e2,e3,e4,e5};
		employeeList= Arrays.asList(employeesArr);

		employeeRepository.insert(employeeList);*/
	}
}

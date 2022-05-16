package com.manman.embeddedmongo.controller;

import com.manman.embeddedmongo.model.Address;
import com.manman.embeddedmongo.model.Employee;
import com.manman.embeddedmongo.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@DataMongoTest(properties = {"spring.mongodb.embedded.version=3.4.5"})
@ExtendWith(SpringExtension.class)
class EmployeeControllerTest {

    @Mock
    EmployeeService employeeService;

    EmployeeController employeeController;

    @Test
    public void getAll(){
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("fname1","lastname1",new Address("addLine1","addLine2","city1","state1",00001),12341);
        Employee e2 = new Employee("fname2","lastname2",new Address("addLine1","addLine2","city2","state2",00002),12342);
        Employee e3 = new Employee("fname3","lastname3",new Address("addLine1","addLine2","city3","state3",00003),12343);
        Employee e4 = new Employee("fname4","lastname4",new Address("addLine1","addLine2","city4","state4",00004),12344);
        Employee e5 = new Employee("fname5","lastname5",new Address("addLine1","addLine2","city5","state5",00005),12345);

        Employee[] employeesArr = { e1,e2,e3,e4,e5};
        employeeList= Arrays.asList(employeesArr);
        when(employeeService.findAll()).thenReturn(employeeList);
        employeeList = employeeController.getAll();
        assertThat(employeeList.size()).isEqualTo(5);
        employeeService.deleteAll();
    }

}
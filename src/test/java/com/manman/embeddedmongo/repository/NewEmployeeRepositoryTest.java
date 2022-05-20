package com.manman.embeddedmongo.repository;

import com.manman.embeddedmongo.model.Address;
import com.manman.embeddedmongo.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest(properties = {"spring.mongodb.embedded.version=3.4.5"})
@ExtendWith(SpringExtension.class)
class NewEmployeeRepositoryTest {

    @Autowired
    MongoTemplate mongoTemplate;

    NewEmployeeRepository newEmployeeRepository;

    @BeforeEach
    void setUp() {
        newEmployeeRepository = new NewEmployeeRepository(mongoTemplate);
    }

    @Test
    void name() {
        Employee e1 = new Employee("fname1", "lastname1", new Address("addLine1", "addLine2", "city1", "state1", 00001), 12341);
        Employee result = newEmployeeRepository.saveEmp(e1,"employee");
        assertEquals(result.getFirstName(),"fname1");
    }
}
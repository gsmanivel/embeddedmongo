package com.manman.embeddedmongo.repository;

import com.manman.embeddedmongo.model.Employee;
import org.springframework.data.mongodb.core.MongoTemplate;

public class NewEmployeeRepository {

    private MongoTemplate mongoTemplate;

    public NewEmployeeRepository(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    public Employee saveEmp(Employee employee,String collection){
        return this.mongoTemplate.save(employee);
    }

}

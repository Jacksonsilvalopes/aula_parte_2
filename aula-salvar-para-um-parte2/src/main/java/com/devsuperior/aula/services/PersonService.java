package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {


    @Autowired
    PersonRepository personRepository;
    @Transactional
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = new Department();
        dept.setId(dto.getDepartament().getId());

        entity.setDepartment(dept);

        entity = personRepository.save(entity);

        return new PersonDepartmentDTO(entity);
    }


}

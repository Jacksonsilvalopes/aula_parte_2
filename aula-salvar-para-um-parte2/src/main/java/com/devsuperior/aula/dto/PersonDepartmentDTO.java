package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;


import java.io.Serializable;


public class PersonDepartmentDTO implements Serializable {

    private Long id;
    private String name;
    private Double salary;
    private DepartamentDto departament;


	public PersonDepartmentDTO() {
	}

	public PersonDepartmentDTO(Long id, String name, Double salary, DepartamentDto departament) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departament = departament;
	}

	public PersonDepartmentDTO(Person person) {
        id = person.getId();
        name = person.getName();
        salary = person.getSalary();
        departament = new DepartamentDto(person.getDepartment());
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public DepartamentDto getDepartament() {
		return departament;
	}

	public void setDepartament(DepartamentDto departament) {
		this.departament = departament;
	}


}

package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;


import java.io.Serializable;


public class DepartamentDto {
    private Long id;
    private String name;

	public DepartamentDto() {
	}

	public DepartamentDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public DepartamentDto(Department department) {

        this.id = department.getId();
        this.name = department.getName();
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
}

package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {
		return new ArrayList<>();
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		return new ArrayList<>();
	}

	@Override
	public void updateDepartmentName(Long departmentId, String departmentName) {
		
	}

	@Override
	public Department createDepartment(String departmentName) {
		return null;
	}

}

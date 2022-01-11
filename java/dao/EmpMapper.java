package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Person;

public class EmpMapper implements RowMapper <Person>{

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person p = new Person();
		p.setId(rs.getInt("id"));
		p.setFirst_name(rs.getString("first_name"));
		p.setLast_name(rs.getNString("last_name"));
		p.setSalary(rs.getInt("salary"));
		p.setYear(rs.getInt("year"));
		p.setGender(rs.getString("gender"));
		p.setLanguage(rs.getString("language"));
		p.setDepartment(rs.getString("department"));
		p.setFormation(rs.getString("formation"));
		return p;
	}

}

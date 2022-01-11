package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Person;

public class EmpDao {
	
	private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }



    public List<Person> get() {
        String SQL = "SELECT * FROM EMPLOYEE.Employee";
        List <Person> courses = jdbcTemplateObject.query(SQL, new EmpMapper());
        return courses;
    }

    public Person get (int id) {
        String SQL = "select * FROM EMPLOYEE.Employee where id=" + id;
        Person c = (Person) jdbcTemplateObject.queryForObject(SQL, new EmpMapper());
        return c;
    }

    public int add(Person c) {
        String SQL = "insert into EMPLOYEE.Employee (first_name, last_name, salary, year, gender, language, department, formation) values (?, ?, ?, ?, ?, ?, ?, ?)";
        return (jdbcTemplateObject.update(SQL, c.getFirst_name(), c.getLast_name(), c.getSalary(), c.getYear(), c.getGender(), c.getLanguage(), c.getDepartment(), c.getFormation()));
    }

   
    public int delete(int id) {
        String SQL = "DELETE From EMPLOYEE.Employee WHERE id=?";
        return (jdbcTemplateObject.update(SQL, id));
    }

    
    public int update(Person c) {
        String SQL = "UPDATE ListeCourses.listeCourses SET first_name=?, last_name=?, salary=?, year=?,  gender=?, language=?, department=?, formation=? WHERE (id = ?);";
        return (jdbcTemplateObject.update(SQL, c.getFirst_name(), c.getLast_name(), c.getSalary(), c.getYear(), c.getGender(), c.getLanguage(), c.getDepartment(), c.getFormation(), c.getId()));
    }

}
